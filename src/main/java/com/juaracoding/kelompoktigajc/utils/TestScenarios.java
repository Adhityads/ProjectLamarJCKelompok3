package com.juaracoding.kelompoktigajc.utils;

public enum TestScenarios {
    T1("Open invalid URL"),
    T2("User valid URL"),
    T3("User enter empty username and password"),
    T4("User Valid Login");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
