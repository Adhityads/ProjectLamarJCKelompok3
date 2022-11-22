package com.juaracoding.kelompoktigajc.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/001.Login.bd.feature",
                    "src/main/resources/features/002.Filterbystatus.bd.feature",
                    "src/main/resources/features/003.Showentries.bd.feature",
                    "src/main/resources/features/004.Search.bd.feature",
                    "src/main/resources/features/005.Dataaktif.aksi.bd.feature",
                    "src/main/resources/features/006.User.m.feature",
                    "src/main/resources/features/007.Datapengajuan.m.feature",
                    "src/main/resources/features/008.Datapengajuan.aksi.m.feature",
                    "src/main/resources/features/009.Dataaktif.m.feature",
                    "src/main/resources/features/01.Login.feature",
                    "src/main/resources/features/02.Dashboard.feature",
                    "src/main/resources/features/03.Recruitment.feature"},
        glue = "com.juaracoding.kelompoktigajc.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
