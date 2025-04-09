package kkojaeh.c8;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 완주하지 못한 선수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
public class S19 {

  public String solution(String[] participant, String[] completion) {
    HashSet<String> set = new HashSet<>(Arrays.asList(completion));
    for (String p : participant) {
      if (set.contains(p)) {
        set.remove(p);
      } else {
        return p;
      }
    }
    return null;
  }
}
