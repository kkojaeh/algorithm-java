package kkojaeh.c6


import spock.lang.Specification

class S12Test extends Specification {

  S12 s

  void setup() {
    s = new S12()
  }

  def "#input -> #result"() {
    expect:
    s.solution(input as int[]) == result as int[]

    where:
    input           | result
    [1, 2, 3, 2, 3] | [4, 3, 1, 1, 0]

  }

}
