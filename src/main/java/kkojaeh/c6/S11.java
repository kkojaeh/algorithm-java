package kkojaeh.c6;

import java.util.Stack;

/**
 * 짝지어 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12973
 */
public class S11 {

  protected int solution(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (stack.isEmpty() || c != stack.peek()) {
        stack.push(c);
      } else {
        stack.pop();
      }
    }
    return stack.isEmpty() ? 1 : 0;
  }
}
