package kkojaeh.c6;

/**
 * 10 진수를 2진수로 변환하기
 */
public class S09 {

  public String solution(int n) {
    StringBuilder builder = new StringBuilder();
    int remained = n;
    while (remained > 1) {
      builder.append(remained % 2);
      remained /= 2;
    }
    builder.append(remained);
    return builder.reverse().toString();
  }
}
