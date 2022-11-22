Feature: Data Pengajuan

  Scenario: TCC.BD.AKSI.EDIT.001 Edit Data
    When  TCC.BD.AKSI.EDIT.001 menekan tombol Requtment Request
    And TCC.BD.AKSI.EDIT.001 menekan tombol +
    And TCC.BD.AKSI.EDIT.001 menekan tombol edit data
    Then TCC.BD.AKSI.EDIT.001 menampilkan form update

  Scenario: TCC.BD.AKSI.EDIT.004 tombol expend Jumlah Kebutuhan
    When TCC.BD.AKSI.EDIT.004 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.004 Menampilkan form jumlah kebutuhan diperbesar

  Scenario: TCC.BD.AKSI.EDIT.005 tombol expend Jumlah Kebutuhan
    When TCC.BD.AKSI.EDIT.005 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.005 Menampilkan form jumlah kebutuhan diperkecil

  Scenario: TCC.BD.AKSI.EDIT.006 tombol collapse Jumlah Kebutuhan
    When TCC.BD.AKSI.EDIT.006 menekan tombol collapse
    Then TCC.BD.AKSI.EDIT.006 Menyembunyikan form jumlah kebutuhan

  Scenario: TCC.BD.AKSI.EDIT.014 tombol expend Kebutuhan
    When TCC.BD.AKSI.EDIT.014 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.014 Menampilkan form kebutuhan diperbesar

  Scenario: TCC.BD.AKSI.EDIT.015 tombol expend Kebutuhan
    When TCC.BD.AKSI.EDIT.015 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.015 Menampilkan form kebutuhan diperkecil

  Scenario: TCC.BD.AKSI.EDIT.016 tombol collapse Kebutuhan
    When TCC.BD.AKSI.EDIT.016 menekan tombol collapse
    Then TCC.BD.AKSI.EDIT.016 Menyembunyikan form kebutuhan

  Scenario: TCC.BD.AKSI.EDIT.049 tombol expend Kualifikasi
    When TCC.BD.AKSI.EDIT.049 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.049 Menampilkan form kualifikasi diperbesar

  Scenario: TCC.BD.AKSI.EDIT.050 tombol expend kualifikasi
    When TCC.BD.AKSI.EDIT.050 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.050 Menampilkan form kualifikasi diperkecil

  Scenario: TCC.BD.AKSI.EDIT.051 tombol collapse kualifikasi
    When TCC.BD.AKSI.EDIT.051 menekan tombol collapse
    Then TCC.BD.AKSI.EDIT.051 Menyembunyikan form kualifikasi

  Scenario: TCC.BD.AKSI.EDIT.084 tombol expend form
    When TCC.BD.AKSI.EDIT.084 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.084 Menampilkan form diperbesar

  Scenario: TCC.BD.AKSI.EDIT.085 tombol expend form
    When TCC.BD.AKSI.EDIT.085 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.085 Menampilkan form diperkecil

  Scenario: TCC.BD.AKSI.EDIT.086 tombol collapse form
    When TCC.BD.AKSI.EDIT.086 menekan tombol collapse
    Then TCC.BD.AKSI.EDIT.086 Menyembunyikan form

  Scenario: TCC.BD.AKSI.EDIT.107 tombol expend remunerasi
    When TCC.BD.AKSI.EDIT.107 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.107 Menampilkan form remunerasi diperbesar

  Scenario: TCC.BD.AKSI.EDIT.108 tombol expend remunerasi
    When TCC.BD.AKSI.EDIT.108 menekan tombol expend
    Then TCC.BD.AKSI.EDIT.108 Menampilkan form remunerasi diperkecil

  Scenario: TCC.BD.AKSI.EDIT.109 tombol collapse remunerasi
    When TCC.BD.AKSI.EDIT.109 menekan tombol collapse
    Then TCC.BD.AKSI.EDIT.109  Menyembunyikan form remunerasi

  Scenario: TCC.BD.AKSI.EDIT.003 Edit data Back
    When TCC.BD.AKSI.EDIT.003 menekan tombol back
    Then TCC.BD.AKSI.EDIT.003 Kembali ke halaman sebelumnya

  Scenario: TCC.BD.AKSI.EDIT.007 Edit data jumlah kebutuhan Penempatan Validasi
    When TCC.BD.AKSI.EDIT.007 menekan data pengajuan
    And TCC.BD.AKSI.EDIT.007 menekan tombol +
    And TCC.BD.AKSI.EDIT.007 menekan edit data
    Then TCC.BD.AKSI.EDIT.007 jumlah kebutuhan Penempatan otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.009 Edit data jumlah kebutuhan Penempatan invalid
    When TCC.BD.AKSI.EDIT.009 menekan data penempatan
    Then TCC.BD.AKSI.EDIT.009 ada tulisan No Result Found

  Scenario: TCC.BD.AKSI.EDIT.017 Edit data - kebutuhan project name
    When TCC.BD.AKSI.EDIT.017 menekan data projek name validasi
    Then TCC.BD.AKSI.EDIT.017 projek name otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.018 Edit data - kebutuhan project name ubah
    When TCC.BD.AKSI.EDIT.018 menekan data projek name
    Then TCC.BD.AKSI.EDIT.018 projek name tidak bisa diubah

  Scenario: TCC.BD.AKSI.EDIT.019 Edit data - kebutuhan client name
    When TCC.BD.AKSI.EDIT.019 menekan data client name
    Then TCC.BD.AKSI.EDIT.019 clien name otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.020 Edit data - kebutuhan jenis kerja sama
    When TCC.BD.AKSI.EDIT.020 menekan data jenis kerja sama
    Then TCC.BD.AKSI.EDIT.020 jenis kerja sama otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.025 Edit data - kebutuhan nama posisi
    When TCC.BD.AKSI.EDIT.025 menekan data nama posisi validasi
    Then TCC.BD.AKSI.EDIT.025 nama posisi otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.027 Edit data - kebutuhan edit invalid nama posisi
    When TCC.BD.AKSI.EDIT.027 masukkan nama posisi invalid
    Then TCC.BD.AKSI.EDIT.027 nama posisi otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.029 Edit data - kebutuhan status kontrak
    When TCC.BD.AKSI.EDIT.029 menekan data status kontrak validasi
    Then TCC.BD.AKSI.EDIT.029 status kontrak otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.031 Edit data - kebutuhan edit invalid status kontrak
    When TCC.BD.AKSI.EDIT.031 masukkan status kontrak invalid
    Then TCC.BD.AKSI.EDIT.031 status kontrak otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.037 Edit data - kebutuhan jam kerja
    When TCC.BD.AKSI.EDIT.037 menekan data jam kerja validasi
    Then TCC.BD.AKSI.EDIT.037 jam kerja otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.039 Edit data - kebutuhan edit invalid jam kerja
    When TCC.BD.AKSI.EDIT.039 masukkan jam kerja invalid
    Then TCC.BD.AKSI.EDIT.039 jam kerja otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.052 Edit data - kebutuhan gender
    When TCC.BD.AKSI.EDIT.052 menekan data gender validasi
    Then TCC.BD.AKSI.EDIT.052 gender otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.054 Edit data - kebutuhan edit invalid gender
    When TCC.BD.AKSI.EDIT.054 masukkan gender invalid
    Then TCC.BD.AKSI.EDIT.054 gender otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.056 Edit data - kebutuhan education
    When TCC.BD.AKSI.EDIT.056 menekan data education validasi
    Then TCC.BD.AKSI.EDIT.056 education otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.058 Edit data - kebutuhan edit invalid education
    When TCC.BD.AKSI.EDIT.058 masukkan education invalid
    Then TCC.BD.AKSI.EDIT.058 education otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.074 Edit data - kebutuhan bahasa inggris
    When TCC.BD.AKSI.EDIT.074 menekan data bahasa inggris validasi
    Then TCC.BD.AKSI.EDIT.074 bahasa inggris otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.076 Edit data - kebutuhan edit invalid bahasa inggris
    When TCC.BD.AKSI.EDIT.076 masukkan bahasa inggris invalid
    Then TCC.BD.AKSI.EDIT.076 bahasa inggris otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.087 Edit data - kebutuhan Divisi
    When TCC.BD.AKSI.EDIT.087 menekan divisi validasi
    Then TCC.BD.AKSI.EDIT.087 divisi otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.089 Edit data - kebutuhan edit invalid divisi
    When TCC.BD.AKSI.EDIT.089 masukkan divisi invalid
    Then TCC.BD.AKSI.EDIT.089 divisi otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.091 Edit data - kebutuhan department
    When TCC.BD.AKSI.EDIT.091 menekan department validasi
    Then TCC.BD.AKSI.EDIT.091 department otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.093 Edit data - kebutuhan edit invalid department
    When TCC.BD.AKSI.EDIT.093 masukkan department invalid
    Then TCC.BD.AKSI.EDIT.093 department otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.095 Edit data - kebutuhan unit
    When TCC.BD.AKSI.EDIT.095 menekan unit validasi
    Then TCC.BD.AKSI.EDIT.095 unit otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.097 Edit data - kebutuhan edit invalid unit
    When TCC.BD.AKSI.EDIT.097 masukkan unit invalid
    Then TCC.BD.AKSI.EDIT.097 unit otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.099 Edit data - Edit data - kebutuhan Level
    When TCC.BD.AKSI.EDIT.099 menekan level validasi
    Then TCC.BD.AKSI.EDIT.099 level otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.101 Edit data - kebutuhan edit invalid level
    When TCC.BD.AKSI.EDIT.101 masukkan level invalid
    Then TCC.BD.AKSI.EDIT.101 level otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.103 Edit data - Edit data - kebutuhan upliner
    When TCC.BD.AKSI.EDIT.103 menekan upliner validasi
    Then TCC.BD.AKSI.EDIT.103 upliner otomatis terisi

  Scenario: TCC.BD.AKSI.EDIT.105 Edit data - kebutuhan edit invalid upliner
    When TCC.BD.AKSI.EDIT.105 masukkan upliner invalid
    Then TCC.BD.AKSI.EDIT.105 upliner otomatis terisi













