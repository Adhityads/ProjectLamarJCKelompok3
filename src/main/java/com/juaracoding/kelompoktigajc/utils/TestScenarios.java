package com.juaracoding.kelompoktigajc.utils;

public enum TestScenarios {
    T1("User login"),
    T8("TCC.DASHBOARD.DB.001"),
    T9("TCC.DASHBOARD.DB.002"),
    T10("TCC.DASHBOARD.DB.003"),
    T11("TCC.RECRUITMENT.001"),
    T12("TCC.RECRUITMENT.002"),
    T13("TCC.BD.FILTERBYSTATUS.003"),
    T14("TCC.BD.FILTERBYSTATUS.004"),
    T15("TCC.BD.FILTERBYSTATUS.005"),
    T16("TCC.BD.FILTERBYSTATUS.001"),
    T17("TCC.BD.SEARCH.001"),
    T18("TCC.BD.SEARCH.002"),
    T19("TCC.BD.SEARCH.003"),
    T20("TCC.BD.SHOWENTRIES.001"),
//    T21("TCC.BD.SHOWENTRIES.002"),
//    T22("TCC.BD.SHOWENTRIES.003"),
//    T23("TCC.BD.SHOWENTRIES.004"),
    T24("TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.001"),
    T25("TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.002"),
    T26("TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.003"),
    T27("TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.004"),
    T28("TCC.BD.TAMBAH.KEBUTUHAN.004"),
    T29("TCC.BD.TAMBAH.KEBUTUHAN.006");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
