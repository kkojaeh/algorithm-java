package kkojaeh.c7


import spock.lang.Specification

class S16Test extends Specification {

  S16 s

  void setup() {
    s = new S16()
  }

  def "#progresses, #speeds -> #result"() {
    expect:
    s.solution(progresses, speeds) == result

    where:
    progresses                        | speeds                      | result
    [93, 30, 55] as int[]             | [1, 30, 5] as int[]         | [2, 1] as int[]
    [95, 90, 99, 99, 80, 99] as int[] | [1, 1, 1, 1, 1, 1] as int[] | [1, 3, 2] as int[]

  }

}
