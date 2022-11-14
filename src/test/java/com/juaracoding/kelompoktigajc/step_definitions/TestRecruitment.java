package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.LoginPage;
import com.juaracoding.kelompoktigajc.pages.RecruitmentPage;
import com.juaracoding.kelompoktigajc.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRecruitment {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu recruitment")
    public void user_click_menu_recruitment(){
        recruitmentPage.MenuRecruitment();
        extentTest.log(LogStatus.PASS,"User click menu recruitment");
    }

    @Then("User show menu recruitment")
    public void user_show_menu_recruitment(){
        Assert.assertEquals(recruitmentPage.getTxtRecruitmentRequest(),"Data Recruitment Request ||  Tambah     ");
        extentTest.log(LogStatus.PASS,"User show menu recruitment");
    }

    @When("User click data pengajuan")
    public void user_click_data_pengajuan(){
        recruitmentPage.MenuDataPengajuan();
        extentTest.log(LogStatus.PASS,"User click data pengajuan");
    }

    @Then("User show data pengajuan")
    public void user_show_data_pengajuan(){
        System.out.println(recruitmentPage.getTxtDataPengajuan());
        Assert.assertEquals(recruitmentPage.getTxtDataPengajuan(), "Data Pengajuan");
        extentTest.log(LogStatus.PASS,"User show data pengajuan");
    }
    @When("User click filter status approve")
    public void user_click_filter_status_approve(){
        recruitmentPage.FilterByApprove();
        extentTest.log(LogStatus.PASS,"User click filter status approve");
    }

    @Then("User show data approve")
    public void user_show_data_approve(){
        System.out.println(recruitmentPage.getTxtFilter());
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("0 to 0"));
        extentTest.log(LogStatus.PASS,"User show data approve");
    }

}
