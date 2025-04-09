package kkojaeh.c8


import spock.lang.Specification

class S21Test extends Specification {

  S21 s

  void setup() {
    s = new S21()
  }

  def "#records -> #result"() {
    expect:
    s.solution(records as String[]) == result as String[]

    where:
    records                                                                                                       | result
    ["Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"] | ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]

  }

}
