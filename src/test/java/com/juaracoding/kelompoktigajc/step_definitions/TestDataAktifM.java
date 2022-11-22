package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.DataAktifM;
import com.juaracoding.kelompoktigajc.pages.DataPengajuanM;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
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
    @When("TCC.M.AKTIF.SEARCH.001 User input search")
    public void tcc_m_aktif_search_001_user_input_search(){
        dataAktifM.search("dika");
        extentTest.log(LogStatus.PASS,"User enter value to search");
    }
    @And("TCC.M.AKTIF.SEARCH.001 User click search button")
    public void tcc_m_aktif_search_001_user_click_search_button(){
        Hooks.delay(1);
        dataAktifM.clickButtonSearch();
        extentTest.log(LogStatus.PASS,"User click search button");
    }
    @Then("TCC.M.AKTIF.SEARCH.001 User show search result")
    public void tcc_m_aktif_search_001_user_show_search_result(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktifM.getTxtTable().contains("DIKA"));
        extentTest.log(LogStatus.PASS,"User show search result");
    }
    @When("TCC.M.AKTIF.SEARCH.003 User refresh search")
    public void tcc_m_aktif_search_003_user_refresh_search(){
        dataAktifM.clickButtonRefresh();
        dataAktifM.clickMenuDataAktif();
        extentTest.log(LogStatus.PASS,"User click refresh button");
    }
    @Then("TCC.M.AKTIF.SEARCH.003 User show refresh result")
    public void tcc_m_aktif_search_003_user_show_refresh_result(){
        Hooks.delay(2);
        Assert.assertTrue(dataAktifM.getTxtTable().contains("DIKA"));
        Assert.assertTrue(dataAktifM.getTxtTable().contains("HCI"));
        Assert.assertTrue(dataAktifM.getTxtTable().contains("AKKI"));
        extentTest.log(LogStatus.PASS,"User show refresh search result");
    }

    @When("TCC.M.AKTIF.SEARCH.002 User input search")
    public void tcc_m_aktif_search_002_user_input_search(){
        dataAktifM.search("Adssdsds");
        extentTest.log(LogStatus.PASS,"User enter value to search");
    }
    @And("TCC.M.AKTIF.SEARCH.002 User click search button")
    public void tcc_m_aktif_search_002_user_click_search_button(){
        dataAktifM.clickButtonSearch();
        extentTest.log(LogStatus.PASS,"User click search button");
    }
    @Then("TCC.M.AKTIF.SEARCH.002 User show search result")
    public void tcc_m_aktif_search_002_user_show_search_result(){
        Hooks.delay(2);
        Assert.assertEquals(dataAktifM.getTxtTable(),"No data available in table");
        dataAktifM.clickButtonRefresh();
        extentTest.log(LogStatus.PASS,"User show search result");
    }

    @When("TCC.M.AKTIF.AKSI.001 User click icon view data")
    public void tcc_m_aktif_aksi_001_user_click_icon_view_data(){
        dataAktifM.clickMenuDataAktif();
        Hooks.delay(1);
        dataAktifM.clickIconViewData();
        extentTest.log(LogStatus.PASS,"User click icon view data");
    }
    @Then("TCC.M.AKTIF.AKSI.001 User on view data")
    public void tcc_m_aktif_aksi_001_user_on_view_data(){
        Hooks.delay(1);
        System.out.println(dataAktifM.getTxtJumlahKebutuhan());
        System.out.println(dataAktifM.getTxtKebutuhan());
        Assert.assertTrue(dataAktifM.getTxtJumlahKebutuhan().contains("Bogor"));
        Assert.assertTrue(dataAktifM.getTxtKebutuhan().contains("Gulf"));
        Assert.assertTrue(dataAktifM.getTxtKebutuhan().contains("GLOBAL"));
        Assert.assertTrue(dataAktifM.getTxtKebutuhan().contains("RSM"));
        Assert.assertTrue(dataAktifM.getTxtKebutuhan().contains("MAGANG"));
        extentTest.log(LogStatus.PASS,"User on view data");
    }
    @When("TCC.M.AKTIF.AKSI.002 User click expand window")
    public void tcc_m_aktif_aksi_002_user_click_expand_window(){
        dataAktifM.clickExpandJumlahKebutuhan();
        extentTest.log(LogStatus.PASS,"User click expand jumlah kebutuhan window");
    }
    @Then("TCC.M.AKTIF.AKSI.002 User show full window")
    public void tcc_m_aktif_aksi_002_user_show_expand_window(){
        extentTest.log(LogStatus.PASS,"User show full jumlah kebutuhan window");
    }
    @When("TCC.M.AKTIF.AKSI.003 User click expand window")
    public void tcc_m_aktif_aksi_003_user_click_expand_window(){
        dataAktifM.clickExpandJumlahKebutuhan();
        extentTest.log(LogStatus.PASS,"User click expand jumlah kebutuhan window");
    }
    @Then("TCC.M.AKTIF.AKSI.003 User show smaller window")
    public void tcc_m_aktif_aksi_003_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller jumlah kebutuhan window");
    }
    @When("TCC.M.AKTIF.AKSI.004 User click collapse window")
    public void tcc_m_aktif_aksi_004_user_click_expand_window(){
        dataAktifM.clickHideJumlahKebutuhan();
        extentTest.log(LogStatus.PASS,"User click collapse jumlah kebutuhan window");
    }
    @Then("TCC.M.AKTIF.AKSI.004 User hide window")
    public void tcc_m_aktif_aksi_004_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide jumlah kebutuhan window");
    }
    @When("TCC.M.AKTIF.AKSI.005 User click expand window")
    public void tcc_m_pengajuan_aksi_005_user_click_expand_window(){
        dataAktifM.clickExpandKebutuhan();
        extentTest.log(LogStatus.PASS,"User click expand kebutuhan window");
    }
    @Then("TCC.M.AKTIF.AKSI.005 User show full window")
    public void tcc_m_aktif_aksi_005_user_show_expand_window(){
        extentTest.log(LogStatus.PASS,"User show full kebutuhan window");
    }
    @When("TCC.M.AKTIF.AKSI.006 User click expand window")
    public void tcc_m_aktif_aksi_006_user_click_expand_window(){
        dataAktifM.clickExpandKebutuhan();
        extentTest.log(LogStatus.PASS,"User click expand kebutuhan window");
    }
    @Then("TCC.M.AKTIF.AKSI.006 User show smaller window")
    public void tcc_m_aktif_aksi_006_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller kebutuhan window");
    }
    @When("TCC.M.AKTIF.AKSI.007 User click collapse window")
    public void tcc_m_aktif_aksi_007_user_click_expand_window(){
        dataAktifM.clickHideKebutuhan();
        extentTest.log(LogStatus.PASS,"User click collapse kebutuhan window");
    }
    @Then("TCC.M.AKTIF.AKSI.007 User hide window")
    public void tcc_m_aktif_aksi_007_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide kebutuhan window");
    }
    @When("TCC.M.AKTIF.AKSI.008 User click expand window")
    public void tcc_m_aktif_aksi_008_user_click_expand_window(){
        dataAktifM.clickExpandKualifikasi();
        extentTest.log(LogStatus.PASS,"User click expand kualifkasi window");
    }
    @Then("TCC.M.AKTIF.AKSI.008 User show full window")
    public void tcc_m_aktif_aksi_008_user_show_expand_window(){
        extentTest.log(LogStatus.PASS,"User show full kualifikasi window");
    }
    @When("TCC.M.AKTIF.AKSI.009 User click expand window")
    public void tcc_m_aktif_aksi_009_user_click_expand_window(){
        dataAktifM.clickExpandKualifikasi();
        extentTest.log(LogStatus.PASS,"User click expand kualifkasi window");
    }
    @Then("TCC.M.AKTIF.AKSI.009 User show smaller window")
    public void tcc_m_aktif_aksi_009_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller kualifkasi window");
    }
    @When("TCC.M.AKTIF.AKSI.010 User click collapse window")
    public void tcc_m_aktif_aksi_010_user_click_expand_window(){
        dataAktifM.clickHideKualifikasi();
        extentTest.log(LogStatus.PASS,"User click collapse kualifkasi window");
    }
    @Then("TCC.M.AKTIF.AKSI.010 User hide window")
    public void tcc_m_aktif_aksi_010_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide kualifkasi window");
    }
    @When("TCC.M.AKTIF.AKSI.011 User click expand window")
    public void tcc_m_aktif_aksi_011_user_click_expand_window(){
        Hooks.delay(1);
        dataAktifM.clickExpandForm();
        extentTest.log(LogStatus.PASS,"User click expand form window");
    }
    @Then("TCC.M.AKTIF.AKSI.011 User show full window")
    public void tcc_m_aktif_aksi_011_user_show_expand_window(){
        extentTest.log(LogStatus.PASS,"User show full form window");
    }
    @When("TCC.M.AKTIF.AKSI.012 User click expand window")
    public void tcc_m_aktif_aksi_012_user_click_expand_window(){
        dataAktifM.clickExpandForm();
        extentTest.log(LogStatus.PASS,"User click expand form window");
    }
    @Then("TCC.M.AKTIF.AKSI.012 User show smaller window")
    public void tcc_m_aktif_aksi_012_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller form window");
    }
    @When("TCC.M.AKTIF.AKSI.013 User click collapse window")
    public void tcc_m_aktif_aksi_013_user_click_expand_window(){
        dataAktifM.clickHideForm();
        extentTest.log(LogStatus.PASS,"User click collapse form window");
    }
    @Then("TCC.M.AKTIF.AKSI.013 User hide window")
    public void tcc_m_aktif_aksi_013_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide form window");
    }
    @When("TCC.M.AKTIF.AKSI.014 User click expand window")
    public void tcc_m_aktif_aksi_014_user_click_expand_window(){
        Hooks.delay(1);
        dataAktifM.clickExpandRemunerasi();
        extentTest.log(LogStatus.PASS,"User click expand remunerasi window");
    }
    @Then("TCC.M.AKTIF.AKSI.014 User show full window")
    public void tcc_m_aktif_aksi_014_user_show_expand_window(){
        extentTest.log(LogStatus.PASS,"User show full remunerasi window");
    }
    @When("TCC.M.AKTIF.AKSI.015 User click expand window")
    public void tcc_m_aktif_aksi_015_user_click_expand_window(){
        Hooks.delay(1);
        dataAktifM.clickExpandRemunerasi();
        extentTest.log(LogStatus.PASS,"User click expand remunerasi window");
    }
    @Then("TCC.M.AKTIF.AKSI.015 User show smaller window")
    public void tcc_m_aktif_aksi_015_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller remunerasi window");
    }
    @When("TCC.M.AKTIF.AKSI.016 User click collapse window")
    public void tcc_m_aktif_aksi_016_user_click_expand_window(){
        dataAktifM.clickHideRemunerasi();
        extentTest.log(LogStatus.PASS,"User click collapse remunerasi window");
    }
    @Then("TCC.M.AKTIF.AKSI.016 User hide window")
    public void tcc_m_paktif_aksi_016_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide remunerasi window");
    }
    @When("TCC.M.AKTIF.AKSI.017 User click button back")
    public void tcc_m_aktif_aksi_017_user_click_button_back(){
        Hooks.delay(2);
        dataAktifM.clickButtonBackViewData();
        extentTest.log(LogStatus.PASS,"User click button back");
    }
    @Then("TCC.M.AKTIF.AKSI.017 User has click button back")
    public void tcc_m_aksi_aksi_017_user_has_click_button_back(){
        Hooks.delay(2);
        System.out.println(dataAktifM.getTxtTable());
        Assert.assertTrue(dataAktifM.getTxtTable().contains("HCI"));
        Assert.assertTrue(dataAktifM.getTxtTable().contains("DIKA"));
        Assert.assertTrue(dataAktifM.getTxtTable().contains("AKKI"));
        extentTest.log(LogStatus.PASS,"User has click button back");
    }
    @When("TCC.M.AKTIF.AKSI.018 User click icon download data")
    public void tcc_m_aktif_aksi_018_user_click_icon_download_data(){
        dataAktifM.clickIconDownloadData();
        extentTest.log(LogStatus.PASS,"User click icon download data");
    }
    @Then("TCC.M.AKTIF.AKSI.018 User has click icon download data")
    public void tcc_m_aktif_aksi_018_user_has_click_icon_download_data(){
        extentTest.log(LogStatus.PASS,"User downloaded the data ");
    }
    @When("TCC.M.AKTIF.HAL.001 User choose halaman 2")
    public void tcc_m_aktif_hal_001_user_choose_halaman_2(){
        Hooks.scroll(100);
        dataAktifM.clickButtonHal();
        extentTest.log(LogStatus.PASS,"User choose halaman 2");
    }
    @Then("TCC.M.AKTIF.HAL.001 User on halaman 2")
    public void tcc_m_aktif_hal_001_user_on_halaman_2(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktifM.getTxtHal().contains("11 to 20"));
        extentTest.log(LogStatus.PASS,"User on halaman 2");
    }
    @When("TCC.M.AKTIF.HAL.002 User choose next halaman")
    public void tcc_m_aktif_hal_002_user_choose_next_halaman(){
        Hooks.scroll(100);
        dataAktifM.clickButtonHalNext();
        extentTest.log(LogStatus.PASS,"User choose next halaman");
    }
    @Then("TCC.M.AKTIF.HAL.002 User on halaman 3")
    public void tcc_m_aktif_hal_002_user_on_halaman_3(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktifM.getTxtHal().contains("21 to 30"));
        extentTest.log(LogStatus.PASS,"User on halaman 3");
    }
    @When("TCC.M.AKTIF.HAL.003 User choose previous halaman")
    public void tcc_m_aktif_hal_003_user_choose_previous_halaman(){
        Hooks.scroll(100);
        dataAktifM.clickButtonHalPrev();
        extentTest.log(LogStatus.PASS,"User choose previous halaman");
    }
    @Then("TCC.M.AKTIF.HAL.003 User on halaman 2")
    public void tcc_m_aktif_hal_003_user_on_halaman_2(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktifM.getTxtHal().contains("11 to 20"));
        extentTest.log(LogStatus.PASS,"User on halaman 2");
    }
}
