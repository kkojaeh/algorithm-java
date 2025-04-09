package kkojaeh.c7;

/**
 * 카드 뭉치
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */
public class S17 {

  public String solution(String[] cards1, String[] cards2, String[] goal) {
    int index1 = 0;
    int index2 = 0;
    System.out.println(goal);
    for (int i = 0; i < goal.length; i++) {
      String current = goal[i];
      if (index1 < cards1.length && current.equals(cards1[index1])) {
        index1++;
      } else if (index2 < cards2.length && current.equals(cards2[index2])) {
        index2++;
      } else {
        return "No";
      }
    }
    return "Yes";
  }
}
