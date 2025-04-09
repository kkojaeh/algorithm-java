package kkojaeh.c7

import kkojaeh.c6.S13
import spock.lang.Specification

class S13Test extends Specification {

  S13 s

  void setup() {
    s = new S13()
  }

  def "#input -> #result"() {
    given:
    def board = [
        [0, 0, 0, 0, 0],
        [0, 0, 1, 0, 3],
        [0, 2, 5, 0, 1],
        [4, 2, 4, 4, 2],
        [3, 5, 1, 3, 1]
    ] as int[][]

    def moves = [1, 5, 3, 5, 1, 2, 1, 4] as int[]
    def result = 4
    expect:
    s.solution(board, moves) == result

  }

}
