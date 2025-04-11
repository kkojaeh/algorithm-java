package kkojaeh.c9


import spock.lang.Specification

class S25Test extends Specification {

  S25 s

  void setup() {
    s = new S25()
  }

  def "#nodes -> #result"() {
    expect:
    s.solution(nodes as int[]) == result as String[]

    where:
    nodes                 | result
    [1, 2, 3, 4, 5, 6, 7] | ["1 2 4 5 3 6 7", "4 2 5 1 6 3 7", "4 5 2 6 7 3 1"]

  }

}
