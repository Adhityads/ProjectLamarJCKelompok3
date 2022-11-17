Feature: User M Dashboard
  Scenario: Login User M
    When User m enter valid username and password
    And User m click button login
    Then User m login success

  Scenario: TCC.M.APPROVERRF.001
    When TCC.M.APPROVERRF.001 User click menu approve RRF
    Then TCC.M.APPROVERRF.001 User on menu approve RRF