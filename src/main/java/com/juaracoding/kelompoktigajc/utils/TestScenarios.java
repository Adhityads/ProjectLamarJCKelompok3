package com.juaracoding.kelompoktigajc.utils;

public enum TestScenarios {
    T1("User login"),
    T2("User go to View Detail Seven Days"),
    T3("User go to recruitment"),
    T4("User click filter status"),
    T5("User search data");;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
