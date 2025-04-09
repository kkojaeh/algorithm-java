package kkojaeh.c8


import spock.lang.Specification

class S22Test extends Specification {

  S22 s

  void setup() {
    s = new S22()
  }

  def "#genres , #plays -> #result"() {
    expect:
    s.solution(genres as String[], plays as int[]) == result as int[]

    where:
    genres                                          | plays                      | result
    ["classic", "pop", "classic", "classic", "pop"] | [500, 600, 150, 800, 2500] | [4, 1, 3, 0]
    ["classic", "pop", "classic", "classic"]        | [800, 600, 800, 800]       | [0, 2, 1]

  }

}
