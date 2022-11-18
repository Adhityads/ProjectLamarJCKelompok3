Feature: Data Aktif M

  Scenario: TCC.M.AKTIF.SHOWENTRIES.001
    When TCC.M.AKTIF.SHOWENTRIES.001 User click menu data aktif
    Then TCC.M.AKTIF.SHOWENTRIES.001 User show default showentries

  Scenario: TCC.M.AKTIF.SHOWENTRIES.002
    When TCC.M.AKTIF.SHOWENTRIES.002 User choose 25 showentries
    Then TCC.M.AKTIF.SHOWENTRIES.002 User show 25 showentries

  Scenario: TCC.M.AKTIF.SHOWENTRIES.003
    When TCC.M.AKTIF.SHOWENTRIES.003 User choose 50 showentries
    Then TCC.M.AKTIF.SHOWENTRIES.003 User show 50 showentries

  Scenario: TCC.M.AKTIF.SHOWENTRIES.004
    When TCC.M.AKTIF.SHOWENTRIES.004 User choose 100 showentries
    Then TCC.M.AKTIF.SHOWENTRIES.004 User show 100 showentries