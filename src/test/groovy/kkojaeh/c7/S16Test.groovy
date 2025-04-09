package kkojaeh.c7


import spock.lang.Specification

class S16Test extends Specification {

  S16 s

  void setup() {
    s = new S16()
  }

  def "#progresses, #speeds -> #result"() {
    expect:
    s.solution(progresses as int[], speeds as int[]) == result as int[]

    where:
    progresses               | speeds             | result
    [93, 30, 55]             | [1, 30, 5]         | [2, 1]
    [95, 90, 99, 99, 80, 99] | [1, 1, 1, 1, 1, 1] | [1, 3, 2]

  }

}
