package com.juaracoding.kelompoktigajc.utils;

public enum TestScenarios {
    J1("User login"),

    // TCC.BD.HALAMAN
    J138("TCC.BD.HALAMAN.001 Pindah ke halaman yang dituju"),
    J139("TCC.BD.HALAMAN.003 Pindah ke halaman Previous"),
    J140("TCC.BD.HALAMAN.002 Pindah ke halaman Next"),

    //TCC.BD.AKSI. EDIT
    J141("TCC.BD.AKSI.EDIT.001 Edit Data"),
    J142("TCC.BD.AKSI.EDIT.004 tombol expend Jumlah Kebutuhan"),
    J143("TCC.BD.AKSI.EDIT.005 tombol expend Jumlah Kebutuhan"),
    J144("TCC.BD.AKSI.EDIT.006 tombol collapse Jumlah Kebutuhan"),
    J145("TCC.BD.AKSI.EDIT.014 tombol expend Kebutuhan"),
    J146("TCC.BD.AKSI.EDIT.015 tombol expend Kebutuhan"),
    J147("TCC.BD.AKSI.EDIT.016 tombol collapse Kebutuhan"),
    J148("TCC.BD.AKSI.EDIT.049 tombol expend Kualifikasi"),
    J149("TCC.BD.AKSI.EDIT.050 tombol expend kualifikasi"),
    J150("TCC.BD.AKSI.EDIT.051 tombol collapse kualifikasi"),
    J151("TCC.BD.AKSI.EDIT.049 tombol expend form"),
    J152("TCC.BD.AKSI.EDIT.050 tombol expend form"),
    J153("TCC.BD.AKSI.EDIT.051 tombol collapse form"),
    J154("TCC.BD.AKSI.EDIT.049 tombol expend remunerasi"),
    J155("TCC.BD.AKSI.EDIT.050 tombol expend remunerasi"),
    J156("TCC.BD.AKSI.EDIT.051 tombol collapse remunerasi"),
    J157("TCC.BD.AKSI.EDIT.003 Edit data Back"),
    J158("TCC.BD.AKSI.EDIT.007 Edit data jumlah kebutuhan Penempatan Validasi"),
    J159("TCC.BD.AKSI.EDIT.017 Edit data - kebutuhan project name"),
    J160("TCC.BD.AKSI.EDIT.018 Edit data - kebutuhan project name invalid"),
    J161("TCC.BD.AKSI.EDIT.019 Edit data - kebutuhan client name"),
    J162("TCC.BD.AKSI.EDIT.020 Edit data - kebutuhan jenis kerja sama"),
    J163("TCC.BD.AKSI.EDIT.025 Edit data - kebutuhan nama posisi"),
    J164("TCC.BD.AKSI.EDIT.027 Edit data - kebutuhan edit invalid nama posisi"),
    J165("TCC.BD.AKSI.EDIT.029 Edit data - kebutuhan status kontrak"),
    J166("TCC.BD.AKSI.EDIT.031 Edit data - kebutuhan edit invalid status kontrak"),
    J167("TCC.BD.AKSI.EDIT.037 Edit data - kebutuhan jam kerja"),
    J168("TCC.BD.AKSI.EDIT.039 Edit data - kebutuhan edit invalid jam kerja"),
    J169("TCC.BD.AKSI.EDIT.052 Edit data - kebutuhan gender"),
    J170("TCC.BD.AKSI.EDIT.054 Edit data - kebutuhan edit invalid gender"),
    J171("TCC.BD.AKSI.EDIT.056 Edit data - kebutuhan education"),
    J172("TCC.BD.AKSI.EDIT.058 Edit data - kebutuhan edit invalid education"),
    J173("TCC.BD.AKSI.EDIT.074 Edit data - kebutuhan bahasa inggris"),
    J174("TCC.BD.AKSI.EDIT.076 Edit data - kebutuhan edit invalid bahasa inggris"),
    J175("TCC.BD.AKSI.EDIT.087 Edit data - kebutuhan Divisi"),
    J176("TCC.BD.AKSI.EDIT.089 Edit data - kebutuhan edit invalid divisi"),
    J177("TCC.BD.AKSI.EDIT.091 Edit data - kebutuhan department"),
    J178("TCC.BD.AKSI.EDIT.093 Edit data - kebutuhan edit invalid department"),
    J179("TCC.BD.AKSI.EDIT.095 Edit data - kebutuhan unit"),
    J180("TCC.BD.AKSI.EDIT.097 Edit data - kebutuhan edit invalid unit"),
    J181("TCC.BD.AKSI.EDIT.099 Edit data - Edit data - kebutuhan Level"),
    J182("TCC.BD.AKSI.EDIT.101 Edit data - kebutuhan edit invalid level"),
    J183("TCC.BD.AKSI.EDIT.103 Edit data - Edit data - kebutuhan upliner"),
    J184("TCC.BD.AKSI.EDIT.105 Edit data - kebutuhan edit invalid upliner");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
