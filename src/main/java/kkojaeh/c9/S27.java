package kkojaeh.c9;

import java.util.HashMap;
import java.util.Map;

/**
 * 다단계 칫솔 판매
 * https://school.programmers.co.kr/learn/courses/30/lessons/77486
 */
public class S27 {

  public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
    Map<String, Member> members = new HashMap<>();
    for (int i = 0; i < enroll.length; i++) {
      String name = enroll[i];
      Member member = new Member(name);
      members.put(name, member);
    }
    Member root = new Member("root");
    for (int i = 0; i < enroll.length; i++) {
      String name = enroll[i];
      Member member = members.get(name);
      String referralName = referral[i];
      member.parent = members.getOrDefault(referralName, root);
    }

    for (int i = 0; i < seller.length; i++) {
      String name = seller[i];
      Member member = members.get(name);
      member.amount = amount[i];
      member.calculate();
    }

    int[] result = new int[enroll.length];
    for (int i = 0; i < enroll.length; i++) {
      String name = enroll[i];
      Member member = members.get(name);
      result[i] = member.profit;
    }
    return result;
  }

  class Member {

    String name;

    int amount;

    int profit;

    Member parent;

    public Member(String name) {
      this.name = name;
    }

    void calculate() {
      int profit = amount * 100;
      int fee = (int) (profit * 0.1);
      this.profit += profit - fee;

      Member p = parent;
      while (p != null && fee > 0) {
        int superFee = (int) (fee * 0.1);
        if (p.parent != null) {
          p.profit += (fee - superFee);
        } else {
          p.profit += fee;
        }
        fee = superFee;
        p = p.parent;
      }
    }

    @Override
    public String toString() {
      return "Member{" +
          "name='" + name + '\'' +
          ", amount=" + amount +
          ", profit=" + profit +
          '}';
    }
  }

}
