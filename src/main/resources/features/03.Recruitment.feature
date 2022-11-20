Feature: Menu Recruitment
  Scenario: TCC.RECRUITMENT.001
    When User click menu recruitment
    Then User show menu recruitment

  Scenario: TCC.RECRUITMENT.002
    When User click data pengajuan
    Then User show data pengajuan

#  Scenario: User click status approve
#   When User click filter status approve
#   Then User show data approve

  Scenario: TCC.BD.FILTERBYSTATUS.003
    When User click filter status pending
    Then User show data pending

  Scenario: TCC.BD.FILTERBYSTATUS.004
    When User click filter status return
    Then User show data return

  Scenario: TCC.BD.FILTERBYSTATUS.005
    When User click filter status cancel
    Then User show data cancel

  Scenario: TCC.BD.FILTERBYSTATUS.001
    When User click filter status default
    Then User show data default

  Scenario: TCC.BD.SEARCH.001
    When User Click input data search valid
    And  User input data and Click search valid
    Then User Show data search valid

  Scenario: TCC.BD.SEARCH.002
    When User Click input data search invalid
    And  User input data and Click search invalid
    Then User Show data search invalid

  Scenario: TCC.BD.SHOWENTRIES.001
    When User click show entries sepuluh
    Then User show sepuluh entries

  Scenario: TCC.BD.SHOWENTRIES.002
    When User click show entries dualima
    Then User show dualima entries

  Scenario: TCC.BD.SHOWENTRIES.003
    When User click show entries limapuluh
    Then User show limapuluh  entries

  Scenario: TCC.BD.SHOWENTRIES.004
    When User click show entries seratus
    Then User show seratus entries
