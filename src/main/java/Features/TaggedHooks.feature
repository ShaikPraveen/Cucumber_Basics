Feature: Tagged Hooks Concept

  @First
  Scenario: This is First Testcase
    Given This is First Step
    Then This is Second Step
    Then This is Third Step

  @Second
  Scenario: This is Second Testcase
    Given This is First Step
    Then This is Second Step
    Then This is Third Step

  @Third
  Scenario: This is Third Testcase
    Given This is First Step
    Then This is Second Step
    Then This is Third Step
