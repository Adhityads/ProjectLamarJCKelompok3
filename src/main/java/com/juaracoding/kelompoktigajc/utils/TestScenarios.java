package com.juaracoding.kelompoktigajc.utils;

public enum TestScenarios {
    T1("User login"),
    T2("TCC.DASHBOARD.DB.001"),
    T3("TCC.DASHBOARD.DB.002"),
    T4("TCC.DASHBOARD.DB.003"),
    T5("TCC.RECRUITMENT.001"),
    T6("TCC.RECRUITMENT.002"),
    T7("TCC.BD.FILTERBYSTATUS.003"),
    T8("TCC.BD.FILTERBYSTATUS.004"),
    T9("TCC.BD.FILTERBYSTATUS.005"),
    T10("TCC.BD.FILTERBYSTATUS.001"),
    T11("TCC.BD.SEARCH.001"),
    T12("TCC.BD.SEARCH.002"),
    T13("TCC.BD.SEARCH.003"),
    T14("TCC.BD.SHOWENTRIES.001"),
    T15("TCC.BD.SHOWENTRIES.002"),
    T16("TCC.BD.SHOWENTRIES.003"),
    T17("TCC.BD.SHOWENTRIES.004"),
    T18("TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.001"),
    T19("TCC.BD.TAMBAH.JUMLAHKEBUTUHAN.002");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
