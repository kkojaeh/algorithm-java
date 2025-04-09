package kkojaeh.c8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 오픈채팅방
 * https://school.programmers.co.kr/learn/courses/30/lessons/42888
 */
public class S21 {
  public String[] solution(String[] records) {
    Room s = new Room(records.length);
    for (String record : records) {
      String[] words = record.split(" ");
      String type = words[0];
      switch (type) {
        case "Enter":
          s.enter(words[1], words[2]);
          break;
        case "Leave":
          s.leave(words[1]);
          break;
        case "Change":
          s.change(words[1], words[2]);
          break;
      }
    }
    return s.getActionLogs();
  }

  interface Action {
    String getUserId();

    String toMessage(String nickname);
  }

  class EnterAction implements Action {

    private final String userId;

    public EnterAction(String userId) {
      this.userId = userId;
    }

    @Override
    public String getUserId() {
      return userId;
    }

    @Override
    public String toMessage(String nickname) {
      return nickname + "님이 들어왔습니다.";
    }
  }

  class LeaveAction implements Action {

    private final String userId;

    public LeaveAction(String userId) {
      this.userId = userId;
    }

    @Override
    public String getUserId() {
      return userId;
    }

    @Override
    public String toMessage(String nickname) {
      return nickname + "님이 나갔습니다.";
    }
  }

  class Room {
    private final Map<String, String> nicknames = new HashMap<>();
    private final ArrayList<Action> actions;

    public Room(int capacity) {
      actions = new ArrayList<>(capacity);
    }

    void enter(String userId, String nickname) {
      nicknames.put(userId, nickname);
      actions.add(new EnterAction(userId));
    }

    void leave(String userId) {
      actions.add(new LeaveAction(userId));
    }

    void change(String userId, String nickname) {
      nicknames.put(userId, nickname);
    }

    String[] getActionLogs() {
      return actions.stream().map(action -> {
        String nickname = nicknames.get(action.getUserId());
        return action.toMessage(nickname);
      }).toArray(String[]::new);
    }
  }
}
