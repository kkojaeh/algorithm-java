package kkojaeh.c8


import spock.lang.Specification

class S23Test extends Specification {

  S23 s

  void setup() {
    s = new S23()
  }

  def "#id_list , #report , #k -> #result"() {
    expect:
    s.solution(id_list as String[], report as String[], k) == result as int[]

    where:
    id_list                            | report                                                                 | k | result
    ["muzi", "frodo", "apeach", "neo"] | ["muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"] | 2 | [2, 1, 1, 0]
    ["con", "ryan"]                    | ["ryan con", "ryan con", "ryan con", "ryan con"]                       | 3 | [0, 0]

  }

}
