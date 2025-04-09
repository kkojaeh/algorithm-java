package kkojaeh.c7

import kkojaeh.c6.S09
import spock.lang.Specification

class S09Test extends Specification {

  S09 s

  void setup() {
    s = new S09()
  }

  def "#input -> #result"() {
    expect:
    s.solution(input) == result

    where:
    input | result
    10    | "1010"
    27    | "11011"
    12345 | "11000000111001"

  }

}
