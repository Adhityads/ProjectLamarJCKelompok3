Feature: Show Entries User BD

  Scenario: TCC.BD.SHOWENTRIES.005
    When TCC.BD.SHOWENTRIES.005 User default
    Then TCC.BD.SHOWENTRIES.005 User show 10 entries

  Scenario: TCC.BD.SHOWENTRIES.006
    When TCC.BD.SHOWENTRIES.006 User choose 25 entries
    Then TCC.BD.SHOWENTRIES.006 User show 25 entries

  Scenario: TCC.BD.SHOWENTRIES.007
    When TCC.BD.SHOWENTRIES.007 User choose 50 entries
    Then TCC.BD.SHOWENTRIES.007 User show 50 entries

  Scenario: TCC.BD.SHOWENTRIES.008
    When TCC.BD.SHOWENTRIES.008 User choose 100 entries
    Then TCC.BD.SHOWENTRIES.008 User show 100 entries