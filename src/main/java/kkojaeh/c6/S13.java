package kkojaeh.c6;

import java.util.Stack;

/**
 * 크레인 인형뽑기 게임
 * https://school.programmers.co.kr/learn/courses/30/lessons/64061
 */
public class S13 {

  public int solution(int[][] board, int[] moves) {
    Stack<Integer>[] stacks = new Stack[board.length];
    for (int i = 0; i < board.length; i++) {
      Stack<Integer> stack = new Stack<Integer>();
      for (int j = board.length - 1; j >= 0; j--) {
        int e = board[j][i];
        if (e > 0) {
          stack.push(e);
        }
      }
      stacks[i] = stack;
    }
    Stack<Integer> bucket = new Stack<Integer>();
    int count = 0;
    for (int move : moves) {
      Stack<Integer> stack = stacks[move - 1];
      if (!stack.isEmpty()) {
        int item = stack.pop();
        int peek = 0;
        if (!bucket.isEmpty()) {
          peek = bucket.peek();
        }
        if (peek == item) {
          bucket.pop();
          count += 2;
        } else {
          bucket.push(item);
        }
      }
    }
    return count;
  }
}
