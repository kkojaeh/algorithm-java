package kkojaeh.c6


import spock.lang.Specification

class S03Test extends Specification {

  S03 s

  void setup() {
    s = new S03()
  }

  def "#input -> #result"() {
    expect:
    s.solution(input) == result

    where:
    input    | result
    "()()"   | true
    "(())()" | true
    ")()("   | false
    "(()("   | false

  }

}
