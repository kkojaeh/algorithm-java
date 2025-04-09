package kkojaeh.c7


import spock.lang.Specification

class S17Test extends Specification {

  S17 s

  void setup() {
    s = new S17()
  }

  def "#card1, #card2 -> #goal -> #result"() {
    expect:
    s.solution(card1 as String[], card2 as String[], goal as String[]) == result

    where:
    card1                   | card2          | goal                                  | result
    ["i", "drink", "water"] | ["want", "to"] | ["i", "want", "to", "drink", "water"] | "Yes"
    ["i", "water", "drink"] | ["want", "to"] | ["i", "want", "to", "drink", "water"] | "No"

  }

}
