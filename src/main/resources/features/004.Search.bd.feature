Feature: Search User BD
  Scenario: TCC.BD.SEARCH.004
    When TCC.BD.SEARCH.004 User input search
    And TCC.BD.SEARCH.004 User click search button
    Then TCC.BD.SEARCH.004 User show search result

  Scenario: TCC.BD.SEARCH.006
    When TCC.BD.SEARCH.006 User refresh search
    Then TCC.BD.SEARCH.006 User show refresh result

  Scenario: TCC.BD.SEARCH.005
    When TCC.BD.SEARCH.005 User input search
    And TCC.BD.SEARCH.005 User click search button
    Then TCC.BD.SEARCH.005 User show search result