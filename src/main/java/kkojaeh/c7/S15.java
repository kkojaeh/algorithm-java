package kkojaeh.c7;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 요세푸스 문제
 * https://namu.wiki/w/%EC%9A%94%EC%84%B8%ED%91%B8%EC%8A%A4%20%EB%AC%B8%EC%A0%9C
 */
public class S15 {

  public int solution(int n, int k) {
    LinkedList<Integer> queue = new LinkedList<>();
    queue.addAll(IntStream.range(1, n + 1).boxed().collect(Collectors.toList()));
    int index = 0;
    while (queue.size() > 1) {
      index = (index + (k - 1)) % queue.size();
      queue.remove(index);
    }
    return queue.get(0);
  }
}
