package com.juaracoding.kelompoktigajc.utils;

public enum TestScenarios {
    J1("User login"),

    // TCC.BD.HALAMAN
    J2("TCC.BD.HALAMAN.001 Pindah ke halaman yang dituju"),
    J3("TCC.BD.HALAMAN.003 Pindah ke halaman Previous"),
    J4("TCC.BD.HALAMAN.002 Pindah ke halaman Next"),

    //TCC.BD.AKSI. EDIT
    J6("TCC.BD.AKSI.EDIT.001 Edit Data"),
    J7("TCC.BD.AKSI.EDIT.004 tombol expend Jumlah Kebutuhan"),
    J8("TCC.BD.AKSI.EDIT.005 tombol expend Jumlah Kebutuhan"),
    J9("TCC.BD.AKSI.EDIT.006 tombol collapse Jumlah Kebutuhan"),
    J10("TCC.BD.AKSI.EDIT.014 tombol expend Kebutuhan"),
    J11("TCC.BD.AKSI.EDIT.015 tombol expend Kebutuhan"),
    J12("TCC.BD.AKSI.EDIT.016 tombol collapse Kebutuhan"),
    J13("TCC.BD.AKSI.EDIT.049 tombol expend Kualifikasi"),
    J14("TCC.BD.AKSI.EDIT.050 tombol expend kualifikasi"),
    J15("TCC.BD.AKSI.EDIT.051 tombol collapse kualifikasi"),
    J16("TCC.BD.AKSI.EDIT.049 tombol expend form"),
    J17("TCC.BD.AKSI.EDIT.050 tombol expend form"),
    J18("TCC.BD.AKSI.EDIT.051 tombol collapse form"),
    J19("TCC.BD.AKSI.EDIT.049 tombol expend remunerasi"),
    J20("TCC.BD.AKSI.EDIT.050 tombol expend remunerasi"),
    J21("TCC.BD.AKSI.EDIT.051 tombol collapse remunerasi"),
    J22("TCC.BD.AKSI.EDIT.003 Edit data Back"),
    J23("TCC.BD.AKSI.EDIT.007 Edit data jumlah kebutuhan Penempatan Validasi"),
    J24("TCC.BD.AKSI.EDIT.017 Edit data - kebutuhan project name"),
    J25("TCC.BD.AKSI.EDIT.018 Edit data - kebutuhan project name invalid"),
    J26("TCC.BD.AKSI.EDIT.019 Edit data - kebutuhan client name"),
    J27("TCC.BD.AKSI.EDIT.020 Edit data - kebutuhan jenis kerja sama"),
    J28("TCC.BD.AKSI.EDIT.025 Edit data - kebutuhan nama posisi"),
    J29("TCC.BD.AKSI.EDIT.027 Edit data - kebutuhan edit invalid nama posisi"),
    J30("TCC.BD.AKSI.EDIT.029 Edit data - kebutuhan status kontrak"),
    J31("TCC.BD.AKSI.EDIT.031 Edit data - kebutuhan edit invalid status kontrak"),
    J32("TCC.BD.AKSI.EDIT.037 Edit data - kebutuhan jam kerja"),
    J33("TCC.BD.AKSI.EDIT.039 Edit data - kebutuhan edit invalid jam kerja"),
    J34("TCC.BD.AKSI.EDIT.052 Edit data - kebutuhan gender"),
    J35("TCC.BD.AKSI.EDIT.054 Edit data - kebutuhan edit invalid gender"),
    J36("TCC.BD.AKSI.EDIT.056 Edit data - kebutuhan education"),
    J37("TCC.BD.AKSI.EDIT.058 Edit data - kebutuhan edit invalid education"),
    J38("TCC.BD.AKSI.EDIT.074 Edit data - kebutuhan bahasa inggris"),
    J39("TCC.BD.AKSI.EDIT.076 Edit data - kebutuhan edit invalid bahasa inggris"),
    J40("TCC.BD.AKSI.EDIT.087 Edit data - kebutuhan Divisi"),
    J41("TCC.BD.AKSI.EDIT.089 Edit data - kebutuhan edit invalid divisi"),
    J42("TCC.BD.AKSI.EDIT.091 Edit data - kebutuhan department"),
    J43("TCC.BD.AKSI.EDIT.093 Edit data - kebutuhan edit invalid department"),
    J44("TCC.BD.AKSI.EDIT.095 Edit data - kebutuhan unit"),
    J45("TCC.BD.AKSI.EDIT.097 Edit data - kebutuhan edit invalid unit"),
    J46("TCC.BD.AKSI.EDIT.099 Edit data - Edit data - kebutuhan Level"),
    J47("TCC.BD.AKSI.EDIT.101 Edit data - kebutuhan edit invalid level"),
    J48("TCC.BD.AKSI.EDIT.103 Edit data - Edit data - kebutuhan upliner"),
    J49("TCC.BD.AKSI.EDIT.105 Edit data - kebutuhan edit invalid upliner");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
