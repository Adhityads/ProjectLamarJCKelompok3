package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.DataAktifM;
import com.juaracoding.kelompoktigajc.pages.DataPengajuanM;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDataAktifM {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private DataAktifM dataAktifM = new DataAktifM();

    public TestDataAktifM() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("TCC.M.AKTIF.SHOWENTRIES.001 User click menu data aktif")
    public void tcc_m_aktif_showentries_001_user_click_menu_data_aktif(){
        dataAktifM.clickMenuDataAktif();
        extentTest.log(LogStatus.PASS,"User click menu data aktif");
    }
    @Then("TCC.M.AKTIF.SHOWENTRIES.001 User show default showentries")
    public void tcc_m_aktif_showentries_001_user_show_default_show_entries(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktifM.getTxtTableRow()==10);
        extentTest.log(LogStatus.PASS,"User show default showentries");
    }
    @When("TCC.M.AKTIF.SHOWENTRIES.002 User choose 25 showentries")
    public void tcc_m_aktif_showentries_002_user_choose_25_showentries(){
        dataAktifM.showentriesduapuluhlima();
        extentTest.log(LogStatus.PASS,"User choose 25 showentries");
    }
    @Then("TCC.M.AKTIF.SHOWENTRIES.002 User show 25 showentries")
    public void tcc_m_aktif_showentries_002_user_show_25_show_entries(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktifM.getTxtTableRow()>10);
        extentTest.log(LogStatus.PASS,"User show 25 showentries");
    }
    @When("TCC.M.AKTIF.SHOWENTRIES.003 User choose 50 showentries")
    public void tcc_m_aktif_showentries_003_user_choose_50_showentries(){
        dataAktifM.showentrieslimapuluh();
        extentTest.log(LogStatus.PASS,"User choose 50 showentries");
    }
    @Then("TCC.M.AKTIF.SHOWENTRIES.003 User show 50 showentries")
    public void tcc_m_aktif_showentries_003_user_show_50_show_entries(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktifM.getTxtTableRow()>25);
        extentTest.log(LogStatus.PASS,"User show 50 showentries");
    }
    @When("TCC.M.AKTIF.SHOWENTRIES.004 User choose 100 showentries")
    public void tcc_m_aktif_showentries_004_user_choose_100_showentries(){
        dataAktifM.showentriesseratus();
        extentTest.log(LogStatus.PASS,"User choose 100 showentries");
    }
    @Then("TCC.M.AKTIF.SHOWENTRIES.004 User show 100 showentries")
    public void tcc_m_aktif_showentries_004_user_show_100_show_entries(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktifM.getTxtTableRow()>25);
        extentTest.log(LogStatus.PASS,"User show 100 showentries");
    }
}
