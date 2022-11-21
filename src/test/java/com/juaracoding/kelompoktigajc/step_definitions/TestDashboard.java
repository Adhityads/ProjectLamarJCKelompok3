package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.DashboardPage;
import com.juaracoding.kelompoktigajc.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDashboard {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private DashboardPage dashboardPage = new DashboardPage();

    public TestDashboard() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click view detail Seven")
    public void User_click_view_detail_seven(){
        dashboardPage.viewDetailDataTujuh();
        extentTest.log(LogStatus.PASS,"User click view detail Seven");
    }
    @Then("User show detail seven days")
    public void user_show_detail_seven_days(){
        System.out.println(dashboardPage.getTxtDetailData());
        Assert.assertEquals(dashboardPage.getTxtDetailData(),"No data available in table");
        extentTest.log(LogStatus.PASS,"User show detail seven days");
    }
    @When("User click view detail Sepuluh")
    public void User_click_view_detail_sepuluh(){
        dashboardPage.viewDetailDataSepuluh();
        extentTest.log(LogStatus.PASS,"User click view detail sepuluh");
    }
    @Then("User show detail sepuluh days")
    public void user_show_detail_sepuluh_days(){
        System.out.println(dashboardPage.getTxtDetailData());
        Assert.assertEquals(dashboardPage.getTxtDetailData(),"No data available in table");
        extentTest.log(LogStatus.PASS,"User show detail sepuluh days");
    }

    @When("User click view detail EmpatBelas")
    public void User_click_view_detail_empatbelas(){
        dashboardPage.viewDetailDataEmpatBelas();
        extentTest.log(LogStatus.PASS,"User click view detail EmpatBelas");
    }
    @Then("User show detail EmpatBelas days")
    public void user_show_detail_empatbelas_days(){
        System.out.println(dashboardPage.getTxtDetailData());
        Assert.assertEquals(dashboardPage.getTxtDetailData(),"No data available in table");
        extentTest.log(LogStatus.PASS,"User show detail EmpatBelas days");
    }

}
