package kkojaeh.c9


import spock.lang.Specification

class S27Test extends Specification {

  S27 s

  void setup() {
    s = new S27()
  }

  def "#enroll, #referral, #seller, #amount -> #result"() {
    expect:
    s.solution(enroll as String[], referral as String[], seller as String[], amount as int[]) == result as int[]

    where:
    enroll                                                               | referral                                                         | seller                                    | amount            | result
    ["john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"] | ["-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"] | ["young", "john", "tod", "emily", "mary"] | [12, 4, 2, 5, 10] | [360, 958, 108, 0, 450, 18, 180, 1080]
    ["john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"] | ["-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"] | ["sam", "emily", "jaimie", "edward"]      | [2, 3, 5, 4]      | [0, 110, 378, 180, 270, 450, 0, 0]

  }

}
