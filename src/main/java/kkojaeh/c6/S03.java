package kkojaeh.c6;

import java.util.Stack;

/**
 * 올바른 괄호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */
public class S03 {

  boolean solution(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        if (stack.isEmpty()) {
          return false;
        } else {
          stack.pop();
        }
      }
    }
    return stack.isEmpty();
  }
}
