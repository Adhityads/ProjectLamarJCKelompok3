package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.DataAktif;
import com.juaracoding.kelompoktigajc.pages.LoginPage;
import com.juaracoding.kelompoktigajc.pages.OpenUrl;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
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
        Hooks.delay(2);
        System.out.println(dataAktif.getTxtTable());
        Assert.assertTrue(dataAktif.getTxtTable().contains("ACTIVE"));
        Assert.assertTrue(dataAktif.getTxtTable().contains("DONE"));
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
        Hooks.delay(2);
        Assert.assertTrue(dataAktif.getTxtTable().contains("ACTIVE"));
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
        Hooks.delay(2);
        Assert.assertTrue(dataAktif.getTxtTable().contains("DONE"));
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
        Hooks.delay(2);
        Assert.assertTrue(dataAktif.getTxtTable().contains("CLOSED"));
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
        Hooks.delay(2);
        Assert.assertTrue(dataAktif.getTxtTable().contains("HOLD"));
        extentTest.log(LogStatus.PASS,"User on filter by status hold");
    }
    @When("TCC.BD.FILTERBYSTATUS.012")
    public void tcc_bd_filter_by_status_012(){
        dataAktif.clickButtonReset();
        extentTest.log(LogStatus.PASS,"user choose filter by status reset");
    }
    @Then("User filter by status reset")
    public void user_filter_by_status_reset(){
        Hooks.delay(2);
        System.out.println(dataAktif.getTxtTable());
        Assert.assertTrue(dataAktif.getTxtTable().contains("ACTIVE"));
        Assert.assertTrue(dataAktif.getTxtTable().contains("DONE"));
        extentTest.log(LogStatus.PASS,"User on filter by status reset");
    }

    @When("TCC.BD.SHOWENTRIES.005 User default")
    public void tcc_bd_showentries_005_user_default(){
        dataAktif.showentriessepuluh();
        extentTest.log(LogStatus.PASS,"User choose show 10 entries");
    }
    @Then("TCC.BD.SHOWENTRIES.005 User show 10 entries")
    public void tcc_bd_showentries_005_user_show_10_entries(){
        Hooks.delay(2);
        System.out.println(dataAktif.getTxtTableRow());
        Assert.assertTrue(dataAktif.getTxtTableRow()==10);
        extentTest.log(LogStatus.PASS,"User show 10 entries");
    }
    @When("TCC.BD.SHOWENTRIES.006 User choose 25 entries")
    public void tcc_bd_showentries_006_user_choose_25_entries(){
        dataAktif.showentriesduapuluhlima();
        extentTest.log(LogStatus.PASS,"User choose show 25 entries");
    }
    @Then("TCC.BD.SHOWENTRIES.006 User show 25 entries")
    public void tcc_bd_showentries_006_user_show_25_entries(){
        Hooks.delay(2);
        System.out.println(dataAktif.getTxtTableRow());
        Assert.assertTrue(dataAktif.getTxtTableRow()>10);
        extentTest.log(LogStatus.PASS,"User show 25 entries");
    }
    @When("TCC.BD.SHOWENTRIES.007 User choose 50 entries")
    public void tcc_bd_showentries_007_user_choose_50_entries(){
        dataAktif.showentrieslimapuluh();
        extentTest.log(LogStatus.PASS,"User choose show 50 entries");
    }
    @Then("TCC.BD.SHOWENTRIES.007 User show 50 entries")
    public void tcc_bd_showentries_007_user_show_50_entries(){
        Hooks.delay(2);
        System.out.println(dataAktif.getTxtTableRow());
        Assert.assertTrue(dataAktif.getTxtTableRow()>25);
        extentTest.log(LogStatus.PASS,"User show 50 entries");
    }
    @When("TCC.BD.SHOWENTRIES.008 User choose 100 entries")
    public void tcc_bd_showentries_008_user_choose_100_entries(){
        dataAktif.showentriesseratus();
        extentTest.log(LogStatus.PASS,"User choose show 100 entries");
    }
    @Then("TCC.BD.SHOWENTRIES.008 User show 100 entries")
    public void tcc_bd_showentries_008_user_show_100_entries(){
        Hooks.delay(2);
        System.out.println(dataAktif.getTxtTableRow());
        Assert.assertTrue(dataAktif.getTxtTableRow()>25);
        extentTest.log(LogStatus.PASS,"User show 100 entries");
    }
    @When("TCC.BD.SEARCH.004 User input search")
    public void tcc_bd_search_004_user_input_search(){
        dataAktif.searchInput("kredivo");
        extentTest.log(LogStatus.PASS,"User enter value to search");
    }
    @And("TCC.BD.SEARCH.004 User click search button")
    public void tcc_bd_search_004_user_click_search_button(){
        Hooks.delay(1);
        dataAktif.clickButtonSearch();
        extentTest.log(LogStatus.PASS,"User click search button");
    }
    @Then("TCC.BD.SEARCH.004 User show search result")
    public void tcc_bd_search_004_user_show_search_result(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktif.getTxtTable().contains("KREDIVO"));
        extentTest.log(LogStatus.PASS,"User show search result");
    }
    @When("TCC.BD.SEARCH.006 User refresh search")
    public void tcc_bd_search_006_user_refresh_search(){
        dataAktif.clickButtonRefresh();
        extentTest.log(LogStatus.PASS,"User click refresh button");
    }
    @Then("TCC.BD.SEARCH.006 User show refresh result")
    public void tcc_bd_search_006_user_show_refresh_result(){
        Hooks.delay(2);
        Assert.assertTrue(dataAktif.getTxtTable().contains("CRM"));
        Assert.assertTrue(dataAktif.getTxtTable().contains("KREDIVO"));
        Assert.assertTrue(dataAktif.getTxtTable().contains("Desk"));
        extentTest.log(LogStatus.PASS,"User show refresh search result");
    }

    @When("TCC.BD.SEARCH.005 User input search")
    public void tcc_bd_search_005_user_input_search(){
        dataAktif.searchInput("Adssdsds");
        extentTest.log(LogStatus.PASS,"User enter value to search");
    }
    @And("TCC.BD.SEARCH.005 User click search button")
    public void tcc_bd_search_005_user_click_search_button(){
        dataAktif.clickButtonSearch();
        extentTest.log(LogStatus.PASS,"User click search button");
    }
    @Then("TCC.BD.SEARCH.005 User show search result")
    public void tcc_bd_search_005_user_show_search_result(){
        Hooks.delay(2);
        Assert.assertEquals(dataAktif.getTxtTable(),"No matching records found");
        extentTest.log(LogStatus.PASS,"User show search result");
    }

    @When("TCC.BD.DATAAKTIF.AKSI.001 User click button plus")
    public void tcc_bd_dataaktif_aksi_001_user_click_button_plus(){
        dataAktif.clickButtonRefresh();
        Hooks.delay(2);
        dataAktif.clickButtonPlus();
        extentTest.log(LogStatus.PASS,"User click button plus");
    }
    @Then("TCC.BD.DATAAKTIF.AKSI.001 User view menu aksi")
    public void tcc_bd_dataaktif_aksi_001_user_view_menu_aksi(){
        Hooks.delay(2);
        Assert.assertTrue(dataAktif.getTxtAksi().contains("Aksi"));
        extentTest.log(LogStatus.PASS,"User view data aksi");
    }
    @When("TCC.BD.DATAAKTIF.AKSI.002 User click button minus")
    public void tcc_bd_dataaktif_aksi_002_user_click_button_minus(){
        dataAktif.clickButtonPlus();
        extentTest.log(LogStatus.PASS,"User click button minus");
    }
    @Then("TCC.BD.DATAAKTIF.AKSI.002 User hide menu aksi")
    public void tcc_bd_dataaktif_aksi_002_user_hide_menu_aksi(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktif.getIntAksi()==0);
        extentTest.log(LogStatus.PASS,"User view data hide");
    }

}
