package com.juaracoding.kelompoktigajc.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/001.Login.bd.feature",
                    "src/main/resources/features/007.Filterbystatus.bd.feature",
                    "src/main/resources/features/008.Showentries.bd.feature",
                    "src/main/resources/features/009.Search.bd.feature",
                    "src/main/resources/features/010.Dataaktif.aksi.bd.feature",
                    "src/main/resources/features/011.User.m.feature",
                    "src/main/resources/features/012.Datapengajuan.m.feature",
                    "src/main/resources/features/013.Datapengajuan.aksi.m.feature",
                    "src/main/resources/features/014.Dataaktif.m.feature",
                    "src/main/resources/features/002.Dashboard.feature",
                    "src/main/resources/features/003.Recruitment.feature"},
        glue = "com.juaracoding.kelompoktigajc.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
