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

  Scenario: TCC.BD.DATAAKTIF.AKSI.005
    When TCC.BD.DATAAKTIF.AKSI.005 User click icon update status
    Then TCC.BD.DATAAKTIF.AKSI.005 User on update status

  Scenario: TCC.BD.DATAAKTIF.AKSI.007
    When TCC.BD.DATAAKTIF.AKSI.007 User Click update status
    And TCC.BD.DATAAKTIF.AKSI.007 User fill empty status
    Then TCC.BD.DATAAKTIF.AKSI.007 User get required message