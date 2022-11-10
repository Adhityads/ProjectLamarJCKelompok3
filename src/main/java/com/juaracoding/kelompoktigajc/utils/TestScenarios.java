package com.juaracoding.kelompoktigajc.utils;

public enum TestScenarios {
    T1("User login");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
