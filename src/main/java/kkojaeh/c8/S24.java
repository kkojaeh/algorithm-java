package kkojaeh.c8;

import java.util.*;

/**
 * 메뉴 리뉴얼
 * https://school.programmers.co.kr/learn/courses/30/lessons/72411
 */
public class S24 {
  public String[] solution(String[] orders, int[] courses) {
    List<String> result = new ArrayList<>();
    for (int course : courses) {
      Map<String, Integer> map = new HashMap<>();
      for (int i = 0; i < orders.length; i++) {
        String order = sort(orders[i]);

        combinations(order, course).forEach(menu -> {
          int count = map.getOrDefault(menu, 0);
          map.put(menu, count + 1);
        });
      }

      int max = map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
          .mapToInt(e -> e.getValue())
          .max()
          .orElse(0);
      if (max > 1) {
        map.entrySet().stream().filter(e -> e.getValue() == max)
            .forEach(e -> result.add(e.getKey()));
      }
    }
    Collections.sort(result);
    return result.toArray(String[]::new);
  }

  private static List<String> combinations(String text, int subsize) {
    if (text.length() < subsize) {
      return Collections.emptyList();
    } else if (text.length() == subsize) {
      return Arrays.asList(text);
    }
    int length = text.length();
    List<String> result = new ArrayList<>();
    for (int i = 0; i < length - (subsize - 1); i++) {
      for (int j = i + 1; j < length - (subsize - 2); j++) {
        String sub = text.substring(i, i + 1) + text.substring(j, j + subsize - 1);
        result.add(sub);
      }
    }
    return result;
  }

  private static String sort(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);

  }


}
