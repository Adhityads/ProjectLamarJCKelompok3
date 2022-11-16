Feature: Menu Recruitment
  Scenario: User go to recruitment
    When User click menu recruitment
    Then User show menu recruitment

    When User click data pengajuan
    Then User show data pengajuan

  Scenario: User click filter status
    When User click filter status approve
    Then User show data approve

    When User click filter status pending
    Then User show data pending

    When User click filter status return
    Then User show data return

    When User click filter status cancel
    Then User show data cancel
 Scenario: User search data
    When User Click input data search
    And  User input data and Click search
    Then User Show data search valid

    When User Click input data search invalid
    And  User input data and Click search invalid
    Then User Show data search invalid
