package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.DataAktif;
import com.juaracoding.kelompoktigajc.pages.LoginPage;
import com.juaracoding.kelompoktigajc.pages.OpenUrl;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDataAktif {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private DataAktif dataAktif = new DataAktif();

    public TestDataAktif() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("TCC.BD.FILTERBYSTATUS.007")
    public void tcc_bd_filter_by_status_007(){
        dataAktif.clickMenuRecruitment();
        dataAktif.clickMenuDataAktif();
        extentTest.log(LogStatus.PASS,"User bd click menu data aktif");
    }
    @Then("User bd on data aktif")
    public void user_bd_on_data_aktif(){
        dataAktif.clickButtonFilter();
        Assert.assertEquals(dataAktif.getTxtFilterByStatus(),"");
        extentTest.log(LogStatus.PASS,"User bd on menu data aktif filter by status default");
    }
    @When("TCC.BD.FILTERBYSTATUS.008")
    public void tcc_bd_filter_by_status_008(){
        dataAktif.filterByStatusActive();
        dataAktif.clickButtonFilter();
        extentTest.log(LogStatus.PASS,"user choose filter by status active");
    }
    @Then("User filter by status active")
    public void user_filter_by_status_active(){
        extentTest.log(LogStatus.PASS,"User on filter by status active");
    }
    @When("TCC.BD.FILTERBYSTATUS.009")
    public void tcc_bd_filter_by_status_009(){
        dataAktif.filterByStatusDone();
        dataAktif.clickButtonFilter();
        extentTest.log(LogStatus.PASS,"user choose filter by status done");
    }
    @Then("User filter by status done")
    public void user_filter_by_status_done(){
        extentTest.log(LogStatus.PASS,"User on filter by status done");
    }
    @When("TCC.BD.FILTERBYSTATUS.010")
    public void tcc_bd_filter_by_status_010(){
        dataAktif.filterByStatusClosed();
        dataAktif.clickButtonFilter();
        extentTest.log(LogStatus.PASS,"user choose filter by status closed");
    }
    @Then("User filter by status closed")
    public void user_filter_by_status_closed(){
        extentTest.log(LogStatus.PASS,"User on filter by status closed");
    }
    @When("TCC.BD.FILTERBYSTATUS.011")
    public void tcc_bd_filter_by_status_011(){
        dataAktif.filterByStatusHold();
        dataAktif.clickButtonFilter();
        extentTest.log(LogStatus.PASS,"user choose filter by status hold");
    }
    @Then("User filter by status hold")
    public void user_filter_by_status_hold(){
        extentTest.log(LogStatus.PASS,"User on filter by status hold");
    }
    @When("TCC.BD.FILTERBYSTATUS.012")
    public void tcc_bd_filter_by_status_012(){
        dataAktif.clickButtonReset();
        extentTest.log(LogStatus.PASS,"user choose filter by status reset");
    }
    @Then("User filter by status reset")
    public void user_filter_by_status_reset(){
        extentTest.log(LogStatus.PASS,"User on filter by status reset");
    }

    @When("TCC.BD.SHOWENTRIES.005")
    public void tcc_bd_showentries_005(){
        dataAktif.showentriessepuluh();
        extentTest.log(LogStatus.PASS,"User choose show 10 entries");
    }
    @Then("User show 10 entries")
    public void user_show_10_entries(){
        extentTest.log(LogStatus.PASS,"User show 10 entries");
    }
    @When("TCC.BD.SHOWENTRIES.006")
    public void tcc_bd_showentries_006(){
        dataAktif.showentriesduapuluhlima();
        extentTest.log(LogStatus.PASS,"User choose show 25 entries");
    }
    @Then("User show 25 entries")
    public void user_show_25_entries(){
        extentTest.log(LogStatus.PASS,"User show 25 entries");
    }
    @When("TCC.BD.SHOWENTRIES.007")
    public void tcc_bd_showentries_007(){
        dataAktif.showentrieslimapuluh();
        extentTest.log(LogStatus.PASS,"User choose show 50 entries");
    }
    @Then("User show 50 entries")
    public void user_show_50_entries(){
        extentTest.log(LogStatus.PASS,"User show 50 entries");
    }
    @When("TCC.BD.SHOWENTRIES.008")
    public void tcc_bd_showentries_008(){
        dataAktif.showentriesseratus();
        extentTest.log(LogStatus.PASS,"User choose show 100 entries");
    }
    @Then("User show 100 entries")
    public void user_show_100_entries(){
        extentTest.log(LogStatus.PASS,"User show 100 entries");
    }
    @When("TCC.BD.SEARCH.004")
    public void tcc_bd_search_004(){
        dataAktif.searchvalid("kredivo");
        extentTest.log(LogStatus.PASS,"User enter value to search");
    }
    @And("User click search button")
    public void user_click_search_button(){
        Hooks.delay(1);
        dataAktif.clickButtonSearch();
        extentTest.log(LogStatus.PASS,"User click search button");
    }
    @Then("User show search result")
    public void user_show_search_result(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktif.getTxtSearch().contains("KREDIVO"));
        extentTest.log(LogStatus.PASS,"User show search result");
    }

}
