package com.juaracoding.kelompoktigajc.utils;

public enum TestScenarios {
    T1("User login"),
    T2("User go to recruitment");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
