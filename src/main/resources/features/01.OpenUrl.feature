Feature: Open URL
  Scenario: TCC.LOGIN.002
    When User open invalid url
    Then User on invalid url

  Scenario: TCC.LOGIN.001
    When  User open valid url
    Then User on valid url