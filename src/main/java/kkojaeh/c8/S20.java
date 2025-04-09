package kkojaeh.c8;

import java.util.HashMap;
import java.util.Map;

/**
 * 할인 행사
 * https://school.programmers.co.kr/learn/courses/30/lessons/131127
 */
public class S20 {
  public int solution(String[] want, int[] number, String[] discount) {
    Map<String, Integer> counter = new HashMap<>();
    for (int i = 0; i < want.length; i++) {
      counter.put(want[i], number[i]);
    }
    int count = 0;
    for (int i = 0; i < discount.length - 9; i++) {
      boolean match = counter.equals(subset(i, discount));
      if (match) {
        count++;
      }
    }
    return count;
  }

  private Map<String, Integer> subset(int index, String[] discount) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = index; i < index + 10; i++) {
      String d = discount[i];
      int count = map.getOrDefault(d, 0);
      map.put(d, count + 1);
    }
    return map;
  }
}
