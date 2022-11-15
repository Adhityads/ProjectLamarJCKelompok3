Feature: User bd Login

  Scenario: TCC.LOGIN.002
    When User open invalid url
    Then User on invalid url

  Scenario: TCC.LOGIN.001
    When  User open valid url
    Then User on valid url

  Scenario: TCC.LOGIN.006
    When User enter empty username and password
    And User click login button
    Then User get message required

  Scenario: TCC.LOGIN.004
    When TCC.LOGIN.004
    And User click login button
    Then User bd login fail

  Scenario: TCC.LOGIN.003
    When User bd enter valid username and password
    And User bd click button login
    Then User bd login success

  Scenario: TCC.LOGIN.007
    When TCC.LOGIN.007
    Then User bd has log out

  Scenario: TCC.LOGIN.005
    When TCC.LOGIN.005
    And User click login button
    Then User bd login success