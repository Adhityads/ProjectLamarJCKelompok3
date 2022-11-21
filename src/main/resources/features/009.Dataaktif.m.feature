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

  Scenario: TCC.M.AKTIF.SEARCH.001
    When TCC.M.AKTIF.SEARCH.001 User input search
    And TCC.M.AKTIF.SEARCH.001 User click search button
    Then TCC.M.AKTIF.SEARCH.001 User show search result

  Scenario: TCC.M.AKTIF.SEARCH.003
    When TCC.M.AKTIF.SEARCH.003 User refresh search
    Then TCC.M.AKTIF.SEARCH.003 User show refresh result

  Scenario:  TCC.M.AKTIF.SEARCH.002
    When TCC.M.AKTIF.SEARCH.002 User input search
    And TCC.M.AKTIF.SEARCH.002 User click search button
    Then TCC.M.AKTIF.SEARCH.002 User show search result

  Scenario: TCC.M.AKTIF.AKSI.001
    When TCC.M.AKTIF.AKSI.001 User click icon view data
    Then TCC.M.AKTIF.AKSI.001 User on view data

  Scenario: TCC.M.AKTIF.AKSI.002
    When TCC.M.AKTIF.AKSI.002 User click expand window
    Then TCC.M.AKTIF.AKSI.002 User show full window

  Scenario: TCC.M.AKTIF.AKSI.003
    When TCC.M.AKTIF.AKSI.003 User click expand window
    Then TCC.M.AKTIF.AKSI.003 User show smaller window

  Scenario: TCC.M.AKTIF.AKSI.004
    When TCC.M.AKTIF.AKSI.004 User click collapse window
    Then TCC.M.AKTIF.AKSI.004 User hide window

  Scenario: TCC.M.AKTIF.AKSI.005
    When TCC.M.AKTIF.AKSI.005 User click expand window
    Then TCC.M.AKTIF.AKSI.005 User show full window

  Scenario: TCC.M.AKTIF.AKSI.006
    When TCC.M.AKTIF.AKSI.006 User click expand window
    Then TCC.M.AKTIF.AKSI.006 User show smaller window

  Scenario: TCC.M.AKTIF.AKSI.007
    When TCC.M.AKTIF.AKSI.007 User click collapse window
    Then TCC.M.AKTIF.AKSI.007 User hide window

  Scenario: TCC.M.AKTIF.AKSI.008
    When TCC.M.AKTIF.AKSI.008 User click expand window
    Then TCC.M.AKTIF.AKSI.008 User show full window

  Scenario: TCC.M.AKTIF.AKSI.009
    When TCC.M.AKTIF.AKSI.008 User click expand window
    Then TCC.M.AKTIF.AKSI.008 User show full window

  Scenario: TCC.M.AKTIF.AKSI.010
    When TCC.M.AKTIF.AKSI.010 User click collapse window
    Then TCC.M.AKTIF.AKSI.010 User hide window

  Scenario: TCC.M.AKTIF.AKSI.011
    When TCC.M.AKTIF.AKSI.011 User click expand window
    Then TCC.M.AKTIF.AKSI.011 User show full window

  Scenario: TCC.M.AKTIF.AKSI.012
    When TCC.M.AKTIF.AKSI.012 User click expand window
    Then TCC.M.AKTIF.AKSI.012 User show smaller window

  Scenario: TCC.M.AKTIF.AKSI.013
    When TCC.M.AKTIF.AKSI.013 User click collapse window
    Then TCC.M.AKTIF.AKSI.013 User hide window

  Scenario: TCC.M.AKTIF.AKSI.014
    When TCC.M.AKTIF.AKSI.014 User click expand window
    Then TCC.M.AKTIF.AKSI.014 User show full window

  Scenario: TCC.M.AKTIF.AKSI.015
    When TCC.M.AKTIF.AKSI.015 User click expand window
    Then TCC.M.AKTIF.AKSI.015 User show smaller window

  Scenario: TCC.M.AKTIF.AKSI.016
    When TCC.M.AKTIF.AKSI.016 User click collapse window
    Then TCC.M.AKTIF.AKSI.016 User hide window

  Scenario: TCC.M.AKTIF.AKSI.017
    When TCC.M.AKTIF.AKSI.017 User click button back
    Then TCC.M.AKTIF.AKSI.017 User has click button back

  Scenario:  TCC.M.AKTIF.AKSI.018
    When TCC.M.AKTIF.AKSI.018 User click icon download data
    Then TCC.M.AKTIF.AKSI.018 User has click icon download data

  Scenario: TCC.M.AKTIF.HAL.001
    When TCC.M.AKTIF.HAL.001 User choose halaman 2
    Then TCC.M.AKTIF.HAL.001 User on halaman 2

  Scenario: TCC.M.AKTIF.HAL.002
    When TCC.M.AKTIF.HAL.002 User choose next halaman
    Then TCC.M.AKTIF.HAL.002 User on halaman 3

  Scenario: TCC.M.AKTIF.HAL.003
    When TCC.M.AKTIF.HAL.003 User choose previous halaman
    Then TCC.M.AKTIF.HAL.003 User on halaman 2