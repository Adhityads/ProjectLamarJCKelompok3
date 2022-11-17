Feature: Data Pengajuan M

  Scenario: TCC.M.PENGAJUAN.SHOWENTRIES.001
    When TCC.M.PENGAJUAN.SHOWENTRIES.001 Showentries default
    Then TCC.M.PENGAJUAN.SHOWENTRIES.001 User on showentries default

  Scenario: TCC.M.PENGAJUAN.SHOWENTRIES.002
    When TCC.M.PENGAJUAN.SHOWENTRIES.002 User choose 25 entries
    Then TCC.M.PENGAJUAN.SHOWENTRIES.002 User show 25 entries

  Scenario: TCC.M.PENGAJUAN.SHOWENTRIES.003
    When TCC.M.PENGAJUAN.SHOWENTRIES.003 User choose 50 entries
    Then TCC.M.PENGAJUAN.SHOWENTRIES.003 User show 50 entries

  Scenario: TCC.M.PENGAJUAN.SHOWENTRIES.004
    When TCC.M.PENGAJUAN.SHOWENTRIES.004 User choose 100 entries
    Then TCC.M.PENGAJUAN.SHOWENTRIES.004 User show 100 entries

  Scenario: TCC.M.PENGAJUAN.SEARCH.001
    When TCC.M.PENGAJUAN.SEARCH.001 User input search
    And TCC.M.PENGAJUAN.SEARCH.001 User click search button
    Then TCC.M.PENGAJUAN.SEARCH.001 User show search result

  Scenario: TCC.M.PENGAJUAN.SEARCH.003
    When TCC.M.PENGAJUAN.SEARCH.003 User refresh search
    Then TCC.M.PENGAJUAN.SEARCH.003 User show refresh result

  Scenario: TCC.M.PENGAJUAN.SEARCH.002
    When TCC.M.PENGAJUAN.SEARCH.002 User input search
    And TCC.M.PENGAJUAN.SEARCH.002 User click search button
    Then TCC.M.PENGAJUAN.SEARCH.002 User show search result

