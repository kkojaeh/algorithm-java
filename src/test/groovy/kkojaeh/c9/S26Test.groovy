package kkojaeh.c9


import spock.lang.Specification

class S26Test extends Specification {

  S26 s

  void setup() {
    s = new S26()
  }

  def "#N, #A, #B -> #result"() {
    expect:
    s.solution(N, A, B) == result

    where:
    N | A | B | result
    8 | 4 | 7 | 3

  }

}
