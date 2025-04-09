package kkojaeh.c7

import kkojaeh.c6.S12
import spock.lang.Specification

class S12Test extends Specification {

  S12 s

  void setup() {
    s = new S12()
  }

  def "#input -> #result"() {
    expect:
    s.solution(input) == result

    where:
    input                    | result
    [1, 2, 3, 2, 3] as int[] | [4, 3, 1, 1, 0] as int[]

  }

}
