package com.juaracoding.kelompoktigajc.utils;

public enum TestScenarios {
    T1("TCC.LOGIN.002"),
    T2("TCC.LOGIN.001"),
    T3("TCC.LOGIN.006"),
    T4("TCC.LOGIN.004"),
    T5("TCC.LOGIN.003"),
    T6("TCC.LOGIN.007"),
    T7("TCC.LOGIN.005"),
    T8("TCC.BD.FILTERBYSTATUS.007"),
    T9("TCC.BD.FILTERBYSTATUS.008"),
    T10("TCC.BD.FILTERBYSTATUS.009"),
    T11("TCC.BD.FILTERBYSTATUS.010"),
    T12("TCC.BD.FILTERBYSTATUS.011"),
    T13("TCC.BD.FILTERBYSTATUS.012"),
    T14("TCC.BD.SHOWENTRIES.005"),
    T15("TCC.BD.SHOWENTRIES.006"),
    T16("TCC.BD.SHOWENTRIES.007"),
    T17("TCC.BD.SHOWENTRIES.008"),
    T18("TCC.BD.SEARCH.004"),
    T19("TCC.BD.SEARCH.006"),
    T20("TCC.BD.SEARCH.005"),
    T21("TCC.BD.DATAAKTIF.AKSI.001"),
    T22("TCC.BD.DATAAKTIF.AKSI.002"),
    T23("TCC.BD.DATAAKTIF.AKSI.003"),
    T24("TCC.BD.DATAAKTIF.AKSI.004"),
    T25("TCC.BD.DATAAKTIF.AKSI.005"),
    T26("TCC.BD.DATAAKTIF.AKSI.007");



    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
