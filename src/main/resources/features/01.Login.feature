Feature: Login User

  Scenario: User Login
    When User go to web login
    And User enter username and password
    And User click button login
    Then User login success