Feature: Data Aktif Aksi User BD
  Scenario: TCC.BD.DATAAKTIF.AKSI.001
    When TCC.BD.DATAAKTIF.AKSI.001 User click button plus
    Then TCC.BD.DATAAKTIF.AKSI.001 User view menu aksi

  Scenario: TCC.BD.DATAAKTIF.AKSI.002
    When TCC.BD.DATAAKTIF.AKSI.002 User click button minus
    Then TCC.BD.DATAAKTIF.AKSI.002 User hide menu aksi

  Scenario: TCC.BD.DATAAKTIF.AKSI.003
    When TCC.BD.DATAAKTIF.AKSI.003 User click icon view data
    Then TCC.BD.DATAAKTIF.AKSI.003 User on view data

  Scenario: TCC.BD.DATAAKTIF.AKSI.004
    When TCC.BD.DATAAKTIF.AKSI.004 User click icon download data
    Then TCC.BD.DATAAKTIF.AKSI.004 User has download data

#  Scenario: TCC.BD.DATAAKTIF.AKSI.005
#    When TCC.BD.DATAAKTIF.AKSI.005 User click icon update status
#    Then TCC.BD.DATAAKTIF.AKSI.005 User on update status
#
#  Scenario: TCC.BD.DATAAKTIF.AKSI.007
#    When TCC.BD.DATAAKTIF.AKSI.007 User fill empty status
#    And TCC.BD.DATAAKTIF.AKSI.007 User click button update
#    Then TCC.BD.DATAAKTIF.AKSI.007 User get required message
#
#  Scenario: TCC.BD.DATAAKTIF.AKSI.006
#    When TCC.BD.DATAAKTIF.AKSI.006 User click update status
#    And TCC.BD.DATAAKTIF.AKSI.006 User click button update
#    Then TCC.BD.DATAAKTIF.AKSI.006 User get success message

  Scenario: TCC.BD.DATAAKTIF.AKSI.008
    When TCC.BD.DATAAKTIF.AKSI.008 User click icon repeat data
    Then TCC.BD.DATAAKTIF.AKSI.008 User on repeat data

  Scenario: TCC.BD.DATAAKTIF.AKSI.009
    When TCC.BD.DATAAKTIF.AKSI.009 User click icon poster
    Then TCC.BD.DATAAKTIF.AKSI.009 User has click icon poster

  Scenario: TCC.BD.DATAAKTIF.HAL.001
    When TCC.BD.DATAAKTIF.HAL.001 User choose halaman 2
    Then TCC.BD.DATAAKTIF.HAL.001 User on halaman 2

  Scenario: TCC.BD.DATAAKTIF.HAL.002
    When TCC.BD.DATAAKTIF.HAL.002 User choose next halaman
    Then TCC.BD.DATAAKTIF.HAL.002 User on halaman 3

  Scenario: TCC.BD.DATAAKTIF.HAL.003
    When TCC.BD.DATAAKTIF.HAL.003 User choose previous halaman
    Then TCC.BD.DATAAKTIF.HAL.003 User on halaman 2

  Scenario: User bd Logout
    When TCC.LOGIN.007