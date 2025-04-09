package kkojaeh.c8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 신고 결과 받기
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334
 */
public class S23 {
  public int[] solution(String[] id_list, String[] reports, int k) {
    Map<String, List<String>> reported = new HashMap<>();
    for (String report : reports) {
      String[] split = report.split(" ");
      String from = split[0];
      String to = split[1];
      List<String> reporters;
      if (reported.containsKey(to)) {
        reporters = reported.get(to);
      } else {
        reporters = new ArrayList<>();
        reported.put(to, reporters);
      }
      if (!reporters.contains(from)) {
        reporters.add(from);
      }
    }
    Map<String, Integer> sendCount = new HashMap<>();
    for (String report : reported.keySet()) {
      List<String> reporters = reported.get(report);
      if (reporters.size() >= k) {
        for (String reporter : reporters) {
          int count = sendCount.getOrDefault(reporter, 0);
          sendCount.put(reporter, count + 1);
        }
      }
    }
    int[] answer = new int[id_list.length];
    for (int i = 0; i < id_list.length; i++) {
      String id = id_list[i];
      answer[i] = sendCount.getOrDefault(id, 0);
    }
    return answer;
  }
}
