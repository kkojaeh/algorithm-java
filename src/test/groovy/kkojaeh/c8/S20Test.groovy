package kkojaeh.c8


import spock.lang.Specification

class S20Test extends Specification {

  S20 s

  void setup() {
    s = new S20()
  }

  def "#want, #number, #discount -> #result"() {
    expect:
    s.solution(want as String[], number as int[], discount as String[]) == result

    where:
    want                                       | number          | discount                                                                                                                       | result
    ["banana", "apple", "rice", "pork", "pot"] | [3, 2, 2, 2, 1] | ["chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"] | 3
    ["apple"]                                  | [10]            | ["banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"]                           | 0

  }

}
