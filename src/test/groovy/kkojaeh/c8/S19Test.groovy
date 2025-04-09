package kkojaeh.c8


import spock.lang.Specification

class S19Test extends Specification {

  S19 s

  void setup() {
    s = new S19()
  }

  def "#participant, #completion -> #result"() {
    expect:
    s.solution(participant as String[], completion as String[]) == result

    where:
    participant                                       | completion                               | result
    ["leo", "kiki", "eden"]                           | ["eden", "kiki"]                         | "leo"
    ["marina", "josipa", "nikola", "vinko", "filipa"] | ["josipa", "filipa", "marina", "nikola"] | "vinko"
    ["mislav", "stanko", "mislav", "ana"]             | ["stanko", "ana", "mislav"]              | "mislav"

  }

}
