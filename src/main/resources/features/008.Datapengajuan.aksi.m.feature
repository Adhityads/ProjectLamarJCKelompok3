Feature: Data Pengajuan M Aksi

  Scenario: TCC.M.PENGAJUAN.AKSI.004
    When TCC.M.PENGAJUAN.AKSI.004 User click icon approve
    Then TCC.M.PENGAJUAN.AKSI.004 User show notification alert

  Scenario: TCC.M.PENGAJUAN.AKSI.006
    When TCC.M.PENGAJUAN.AKSI.006 User click cancel on notification alert
    Then TCC.M.PENGAJUAN.AKSI.006 User has click cancel

#  Scenario: TCC.M.PENGAJUAN.AKSI.005
#    When TCC.M.PENGAJUAN.AKSI.005 User click ok on notification alert
#    Then TCC.M.PENGAJUAN.AKSI.005 User get success message

  Scenario: TCC.M.PENGAJUAN.AKSI.007
    When TCC.M.PENGAJUAN.AKSI.007 User click icon view data
    Then TCC.M.PENGAJUAN.AKSI.007 User on view data

  Scenario: TCC.M.PENGAJUAN.AKSI.008
    When TCC.M.PENGAJUAN.AKSI.008 User click expand window
    Then TCC.M.PENGAJUAN.AKSI.008 User show full window

  Scenario: TCC.M.PENGAJUAN.AKSI.009
    When TCC.M.PENGAJUAN.AKSI.009 User click expand window
    Then TCC.M.PENGAJUAN.AKSI.009 User show smaller window

  Scenario: TCC.M.PENGAJUAN.AKSI.010
    When TCC.M.PENGAJUAN.AKSI.010 User click collapse window
    Then TCC.M.PENGAJUAN.AKSI.010 User hide window
