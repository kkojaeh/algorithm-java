package kkojaeh.c8


import spock.lang.Specification

class S18Test extends Specification {

  S18 s

  void setup() {
    s = new S18()
  }

  def "#array, #target -> #result"() {
    expect:
    s.solution(array as int[], target) == result

    where:
    array           | target | result
    [1, 2, 3, 4, 8] | 6      | true
    [2, 3, 5, 9]    | 10     | false

  }

}
