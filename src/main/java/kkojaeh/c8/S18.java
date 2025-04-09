package kkojaeh.c8;

import java.util.HashSet;
import java.util.Set;

/**
 * 두개의 수로 특정값 만들기
 */
public class S18 {
  /**
   * arr 중 두수의 합이 target 이 존재하는지 여부를 반환
   *
   * @param array
   * @param target
   * @return
   */
  public boolean solution(int[] array, int target) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < array.length; i++) {
      int current = array[i];
      int expected = target - current;
      if (set.contains(expected)) {
        return true;
      }
      set.add(current);
    }
    return false;
  }
}
