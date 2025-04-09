package kkojaeh.c7;

import java.util.LinkedList;
import java.util.List;

/**
 * 기능 개발
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */
public class S16 {

  public int[] solution(int[] progresses, int[] speeds) {
    List<Integer> result = new LinkedList<>();
    LinkedList<Integer> queue = new LinkedList<>();
    int length = progresses.length;
    int completed = 0;
    while(true) {
      for (int i = 0; i < length; i++) {
        progresses[i] += speeds[i];
      }
      int count = 0;
      for (int i = completed; i < length; i++) {
        if(progresses[i] >= 100) {
          count++;
          completed++;
        }else {
          break;
        }
      }
      if(count > 0) {
        result.add(count);
      }
      if(completed == length) {
        break;
      }
    }
    return result.stream().mapToInt(i -> i).toArray();
  }
}
