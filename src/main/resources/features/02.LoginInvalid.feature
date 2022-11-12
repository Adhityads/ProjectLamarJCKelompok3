Feature: User Invalid login

  Scenario: TCC.LOGIN.006
    When User enter empty username and password
    And User click login button
    Then User get message required
