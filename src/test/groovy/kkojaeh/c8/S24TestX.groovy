package kkojaeh.c8


import spock.lang.Specification

class S24TestX extends Specification {

  S24 s

  void setup() {
    s = new S24()
  }

  def "#orders , #courses -> #result"() {
    expect:
    s.solution(orders as String[], courses as int[]) == result as String[]

    where:
    orders                                            | courses   | result
    ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]   | [2, 3, 4] | ["AC", "ACDE", "BCFG", "CDE"]
    ["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"] | [2, 3, 5] | ["ACD", "AD", "ADE", "CD", "XYZ"]
    ["XYZ", "XWY", "WXA"]                             | [2, 3, 4] | ["WX", "XY"]
    ["XYZ", "XWY", "WXA"]                             | [10]      | []

  }

}
