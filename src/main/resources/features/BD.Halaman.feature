Feature: Data Pengajuan

  Scenario: TCC.BD.HALAMAN.001 Pindah ke halaman yang dituju
    When TCC.BD.HALAMAN.001 menekan tombol requitment request
    And TCC.BD.HALAMAN.001 menekan halaman yang dituju
    Then TCC.BD.HALAMAN.001 menampilkan halaman yang dituju

  Scenario: TCC.BD.HALAMAN.003 Pindah ke halaman Previous
    When TCC.BD.HALAMAN.003 menekan halaman Previous
    Then TCC.BD.HALAMAN.003 menampilkan halaman Previous

  Scenario: TCC.BD.HALAMAN.002 Pindah ke halaman next
    When TCC.BD.HALAMAN.002 menekan halaman next
    Then TCC.BD.HALAMAN.002 menampilkan halaman next