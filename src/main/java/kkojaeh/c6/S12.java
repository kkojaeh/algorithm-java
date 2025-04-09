package kkojaeh.c6;

import java.util.Stack;

/**
 * 주식 가격
 * https://school.programmers.co.kr/learn/courses/30/lessons/42584
 */
public class S12 {

  public int[] solution(int[] prices) {
    int[] result = new int[prices.length];
    Stack<Integer> stack = new Stack<Integer>();
    int length = prices.length;
    stack.push(0);
    for (int i = 0; i < length; i++) {
      while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
        int j = stack.pop();
        result[j] = i - j;
      }
      stack.push(i);
    }
    for (int i : stack) {
      result[i] = length - i - 1;
    }
    return result;
  }


}
