package kkojaeh.c8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 완주하지 못한 선수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
public class S19 {

  public String solution(String[] participant, String[] completion) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (String p : participant) {
      int count = map.getOrDefault(p, 0) + 1;
      map.put(p, count);
    }
    for (String c : completion) {
      int count = map.get(c) - 1;

      if(count == 0) {
        map.remove(c);
      }else {
        map.put(c, count);
      }
    }
    return map.keySet().stream().findFirst().get();
  }
}
