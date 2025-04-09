package kkojaeh.c6


import spock.lang.Specification

class S11Test extends Specification {

  S11 s

  void setup() {
    s = new S11()
  }

  def "#input -> #result"() {
    expect:
    s.solution(input) == result

    where:
    input    | result
    "baabaa" | 1
    "cdcd"   | 0

  }

}
