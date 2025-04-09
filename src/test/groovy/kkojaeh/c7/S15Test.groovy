package kkojaeh.c7


import spock.lang.Specification

class S15Test extends Specification {

  S15 s

  void setup() {
    s = new S15()
  }

  def "#N, #K -> #result"() {
    expect:
    s.solution(N, K) == result

    where:
    N | K | result
    5 | 2 | 3

  }

}
