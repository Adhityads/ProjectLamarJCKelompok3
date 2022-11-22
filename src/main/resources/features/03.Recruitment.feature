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

  Scenario: TCC.BD.SEARCH.003
    When TCC.BD.SEARCH.003 User refresh search
    Then TCC.BD.SEARCH.003 user show refresh search

  Scenario: TCC.BD.SHOWENTRIES.001
    When User click show entries sepuluh
    Then User show sepuluh entries

#  Scenario: TCC.BD.SHOWENTRIES.002
#    When User click show entries dualima
#    Then User show dualima entries
#
#  Scenario: TCC.BD.SHOWENTRIES.003
#    When User click show entries limapuluh
#    Then User show limapuluh entries
#
#  Scenario: TCC.BD.SHOWENTRIES.004
#    When User click show entries seratus
#    Then User show seratus entries

  Scenario: TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.001
    When TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.001 User click button tambah
    Then TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.001 User on form tambah data

  Scenario: TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.002
    When TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.002 user fill penempatan
    Then TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.002 user filled penempatan

  Scenario: TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.004
    When TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.004 User fill jumlah kebutuhan
    Then TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.004 User filled jumlah kebutuhan

  Scenario: TCC.BD.TAMBAH.KEBUTUHAN.001
    When TCC.BD.TAMBAH.KEBUTUHAN.001 User fill nama project
    Then TCC.BD.TAMBAH.KEBUTUHAN.001 User filled nama project

  Scenario: TCC.BD.TAMBAH.KEBUTUHAN.004
    When TCC.BD.TAMBAH.KEBUTUHAN.004 User fill tanggal aktif
    Then TCC.BD.TAMBAH.KEBUTUHAN.004 User filled tanggal aktif

  Scenario: TCC.BD.TAMBAH.KEBUTUHAN.006
    When TCC.BD.TAMBAH.KEBUTUHAN.006 User fill tanggal berakhir
    Then TCC.BD.TAMBAH.KEBUTUHAN.006 User filled tanggal berakhir


