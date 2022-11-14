package com.juaracoding.kelompoktigajc.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/001.TCC.LOGIN.002.feature",
                "src/main/resources/features/002.TCC.LOGIN.001.feature",
                "src/main/resources/features/003.TCC.LOGIN.006.feature",
                "src/main/resources/features/004.TCC.LOGIN.004.feature",
                "src/main/resources/features/005.TCC.LOGIN.003.feature",
                "src/main/resources/features/006.TCC.LOGIN.007.feature",
                "src/main/resources/features/007.TCC.LOGIN.005.feature",
                "src/main/resources/features/008.TCC.BD.FILTERBYSTATUS.007.feature",
                "src/main/resources/features/009.TCC.BD.FILTERBYSTATUS.008.feature",
                "src/main/resources/features/010.TCC.BD.FILTERBYSTATUS.009.feature",
                "src/main/resources/features/011.TCC.BD.FILTERBYSTATUS.010.feature",
                "src/main/resources/features/012.TCC.BD.FILTERBYSTATUS.011.feature",
                "src/main/resources/features/013.TCC.BD.FILTERBYSTATUS.012.feature",
                "src/main/resources/features/014.TCC.BD.SHOWENTRIES.005.feature",
                "src/main/resources/features/015.TCC.BD.SHOWENTRIES.006.feature",
                "src/main/resources/features/016.TCC.BD.SHOWENTRIES.007.feature",
                "src/main/resources/features/017.TCC.BD.SHOWENTRIES.008.feature",
                "src/main/resources/features/018.TCC.BD.SEARCH.004.feature"
                },
        glue = "com.juaracoding.kelompoktigajc.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
