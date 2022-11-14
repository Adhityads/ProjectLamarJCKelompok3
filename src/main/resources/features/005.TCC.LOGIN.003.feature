Feature: TCC.LOGIN.003

  Scenario: TCC.LOGIN.003
    When User bd enter valid username and password
    And User bd click button login
    Then User bd login success