package kkojaeh.c8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 베스트 앨범
 * https://school.programmers.co.kr/learn/courses/30/lessons/42579
 */
public class S22 {
  public int[] solution(String[] genres, int[] plays) {
    int length = genres.length;
    Map<String, Map<Integer, Integer>> genreMap = new HashMap<>();
    for (int i = 0; i < length; i++) {
      String genre = genres[i];
      int play = plays[i];
      Map<Integer, Integer> musicMap;
      if (genreMap.containsKey(genre)) {
        musicMap = genreMap.get(genre);
      } else {
        musicMap = new HashMap<>();
        genreMap.put(genre, musicMap);
      }
      musicMap.put(i, play);
    }
    List<Integer> answer = new ArrayList<>();
    List<String> sortedGenres = genreMap.entrySet().stream().sorted( //
            Comparator.comparingInt(e -> {
              int sum = e.getValue().values().stream().mapToInt(v -> v).sum();
              return sum * -1;
            }))
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
    for (String genre : sortedGenres) {
      Map<Integer, Integer> musicMap = genreMap.get(genre);
      musicMap.entrySet().stream().sorted((o1, o2) -> {
            if (o1.getValue() != o2.getValue()) {
              return Integer.compare(o1.getValue(), o2.getValue()) * -1;
            } else {
              return Integer.compare(o1.getKey(), o2.getValue());
            }
          })
          .limit(2)
          .forEach(e -> answer.add(e.getKey()));
    }
    return answer.stream().mapToInt(i -> i).toArray();
  }
}
