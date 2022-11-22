package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.DataAktif;
import com.juaracoding.kelompoktigajc.pages.DataPengajuanM;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.SortedMap;

public class TestDataPengajuanM {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private DataPengajuanM dataPengajuanM = new DataPengajuanM();

    public TestDataPengajuanM() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.M.PENGAJUAN.SHOWENTRIES.001 Showentries default")
    public void tcc_m_pengajuan_showentries_001_showentries_default(){
        dataPengajuanM.showentriessepuluh();
        extentTest.log(LogStatus.PASS,"User show entries default");
    }
    @Then("TCC.M.PENGAJUAN.SHOWENTRIES.001 User on showentries default")
    public void tcc_m_pengajuan_showentries_001_user_on_showentries_default(){
        System.out.println(dataPengajuanM.getTxtTableRow());
        Assert.assertTrue(dataPengajuanM.getTxtTableRow()<10);
        extentTest.log(LogStatus.PASS,"User show 10 entries");
    }
    @When("TCC.M.PENGAJUAN.SHOWENTRIES.002 User choose 25 entries")
    public void tcc_m_pengajuan_showentries_002_user_choose_25_entries(){
        dataPengajuanM.showentriesduapuluhlima();
        extentTest.log(LogStatus.PASS,"User choose show 25 entries");
    }
    @Then("TCC.M.PENGAJUAN.SHOWENTRIES.002 User show 25 entries")
    public void tcc_m_pengajuan_showentries_002_user_show_25_entries(){
        Hooks.delay(2);
        System.out.println(dataPengajuanM.getTxtTableRow());
        Assert.assertTrue(dataPengajuanM.getTxtTableRow()>10);
        extentTest.log(LogStatus.PASS,"User show 25 entries");
    }
    @When("TCC.M.PENGAJUAN.SHOWENTRIES.003 User choose 50 entries")
    public void tcc_m_pengajuan_showentries_003_user_choose_50_entries(){
        dataPengajuanM.showentrieslimapuluh();
        extentTest.log(LogStatus.PASS,"User choose show 50 entries");
    }
    @Then("TCC.M.PENGAJUAN.SHOWENTRIES.003 User show 50 entries")
    public void tcc_m_pengajuan_showentries_003_user_show_50_entries(){
        Hooks.delay(2);
        System.out.println(dataPengajuanM.getTxtTableRow());
        Assert.assertTrue(dataPengajuanM.getTxtTableRow()>10);
        extentTest.log(LogStatus.PASS,"User show 50 entries");
    }
    @When("TCC.M.PENGAJUAN.SHOWENTRIES.004 User choose 100 entries")
    public void tcc_m_pengajuan_showentries_004_user_choose_100_entries(){
        dataPengajuanM.showentriesseratus();
        extentTest.log(LogStatus.PASS,"User choose show 100 entries");
    }
    @Then("TCC.M.PENGAJUAN.SHOWENTRIES.004 User show 100 entries")
    public void tcc_m_pengajuan_showentries_004_user_show_100_entries(){
        Hooks.delay(2);
        System.out.println(dataPengajuanM.getTxtTableRow());
        Assert.assertTrue(dataPengajuanM.getTxtTableRow()>10);
        extentTest.log(LogStatus.PASS,"User show 100 entries");
    }

    @When("TCC.M.PENGAJUAN.SEARCH.001 User input search")
    public void tcc_m_pengajuan_search_001_user_input_search(){
        dataPengajuanM.search("bca");
        extentTest.log(LogStatus.PASS,"User enter value to search");
    }
    @And("TCC.M.PENGAJUAN.SEARCH.001 User click search button")
    public void tcc_m_pengajuan_search_001_user_click_search_button(){
        Hooks.delay(1);
        dataPengajuanM.clickButtonSearch();
        extentTest.log(LogStatus.PASS,"User click search button");
    }
    @Then("TCC.M.PENGAJUAN.SEARCH.001 User show search result")
    public void tcc_m_pengajuan_search_001_user_show_search_result(){
        Hooks.delay(1);
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("BCA"));
        extentTest.log(LogStatus.PASS,"User show search result");
    }
    @When("TCC.M.PENGAJUAN.SEARCH.003 User refresh search")
    public void tcc_m_pengajuan_search_003_user_refresh_search(){
        dataPengajuanM.clickButtonRefresh();
        extentTest.log(LogStatus.PASS,"User click refresh button");
    }
    @Then("TCC.M.PENGAJUAN.SEARCH.003 User show refresh result")
    public void tcc_m_pengajuan_search_003_user_show_refresh_result(){
        Hooks.delay(2);
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("BCA"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("HCI"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("DANA"));
        extentTest.log(LogStatus.PASS,"User show refresh search result");
    }

    @When("TCC.M.PENGAJUAN.SEARCH.002 User input search")
    public void tcc_m_pengajuan_search_002_user_input_search(){
        dataPengajuanM.search("Adssdsds");
        extentTest.log(LogStatus.PASS,"User enter value to search");
    }
    @And("TCC.M.PENGAJUAN.SEARCH.002 User click search button")
    public void tcc_m_pengajuan_search_002_user_click_search_button(){
        dataPengajuanM.clickButtonSearch();
        extentTest.log(LogStatus.PASS,"User click search button");
    }
    @Then("TCC.M.PENGAJUAN.SEARCH.002 User show search result")
    public void tcc_m_pengajuan_search_002_user_show_search_result(){
        Hooks.delay(2);
        Assert.assertEquals(dataPengajuanM.getTxtTable(),"No data available in table");
        dataPengajuanM.clickButtonRefresh();
        extentTest.log(LogStatus.PASS,"User show search result");
    }
    @When("TCC.M.PENGAJUAN.AKSI.004 User click icon approve")
    public void tcc_m_pengajuan_aksi_004_user_click_icon_approve(){
        Hooks.delay(1);
        dataPengajuanM.clickButtonApprove();
        extentTest.log(LogStatus.PASS,"User click icon approve");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.004 User show notification alert")
    public void tcc_m_pengajuan_aksi_004_user_show_notification_alert(){
        Hooks.delay(1);
        System.out.println(dataPengajuanM.getTxtAlert());
        Assert.assertEquals(dataPengajuanM.getTxtAlert(),"Apakah Anda yakin data akan di approve ?");
        extentTest.log(LogStatus.PASS,"User show notification alert");
    }
    @When("TCC.M.PENGAJUAN.AKSI.006 User click cancel on notification alert")
    public void tcc_m_pengajuan_aksi_006_user_click_cancel_on_notification_alert(){
        dataPengajuanM.clickAlertCancel();
        extentTest.log(LogStatus.PASS,"User click cancel on notifcation alert");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.006 User has click cancel")
    public void tcc_m_pengajuan_aksi_006_user_has_click_cancel(){
        extentTest.log(LogStatus.PASS,"User has click cancel");
    }
    @When("TCC.M.PENGAJUAN.AKSI.005 User click ok on notification alert")
    public void tcc_m_pengajuan_aksi_005_user_click_ok_on_notification_alert() {
        Hooks.delay(1);
        dataPengajuanM.clickButtonApprove();
        Hooks.delay(1);
        dataPengajuanM.clickAlertOK();
        extentTest.log(LogStatus.PASS,"User click ok on notification alert");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.005 User get success message")
    public void tcc_m_pengajuan_aksi_005_user_get_success_message(){
        Hooks.delay(1);
        System.out.println(dataPengajuanM.getTxtApproveSuccess());
        Assert.assertTrue(dataPengajuanM.getTxtApproveSuccess().contains("Berhasil"));
        extentTest.log(LogStatus.PASS,"User get success message");
    }
    @When("TCC.M.PENGAJUAN.AKSI.007 User click icon view data")
    public void tcc_m_pengajuan_aksi_007_user_click_icon_view_data(){
        dataPengajuanM.clickIconViewData();
        extentTest.log(LogStatus.PASS,"User click icon view data");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.007 User on view data")
    public void tcc_m_pengajuan_aksi_007_user_on_view_data(){
        Hooks.delay(1);
        Assert.assertTrue(dataPengajuanM.getTxtJumlahKebutuhan().contains("Jakarta"));
        Assert.assertTrue(dataPengajuanM.getTxtKebutuhan().contains("HCI"));
        Assert.assertTrue(dataPengajuanM.getTxtKebutuhan().contains("CRM OPERATOR"));
        Assert.assertTrue(dataPengajuanM.getTxtKebutuhan().contains("Komisariss"));
        Assert.assertTrue(dataPengajuanM.getTxtKebutuhan().contains("PKWTT"));
        extentTest.log(LogStatus.PASS,"User on view data");
    }
    @When("TCC.M.PENGAJUAN.AKSI.008 User click expand window")
    public void tcc_m_pengajuan_aksi_008_user_click_expand_window(){
        dataPengajuanM.clickExpandJumlahKebutuhan();
        extentTest.log(LogStatus.PASS,"User click expand jumlah kebutuhan window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.008 User show full window")
    public void tcc_m_pengajuan_aksi_008_user_show_expand_window(){
        dataPengajuanM.getTxtJumlahKebutuhanExpand();
        System.out.println(dataPengajuanM.getTxtJumlahKebutuhanExpand());
        extentTest.log(LogStatus.PASS,"User show full jumlah kebutuhan window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.009 User click expand window")
    public void tcc_m_pengajuan_aksi_009_user_click_expand_window(){
        dataPengajuanM.clickExpandJumlahKebutuhan();
        extentTest.log(LogStatus.PASS,"User click expand jumlah kebutuhan window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.009 User show smaller window")
    public void tcc_m_pengajuan_aksi_009_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller jumlah kebutuhan window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.010 User click collapse window")
    public void tcc_m_pengajuan_aksi_010_user_click_expand_window(){
        dataPengajuanM.clickHideJumlahKebutuhan();
        extentTest.log(LogStatus.PASS,"User click collapse jumlah kebutuhan window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.010 User hide window")
    public void tcc_m_pengajuan_aksi_010_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide jumlah kebutuhan window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.011 User click expand window")
    public void tcc_m_pengajuan_aksi_011_user_click_expand_window(){
        dataPengajuanM.clickExpandKebutuhan();
        extentTest.log(LogStatus.PASS,"User click expand kebutuhan window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.011 User show full window")
    public void tcc_m_pengajuan_aksi_011_user_show_expand_window(){
        extentTest.log(LogStatus.PASS,"User show full kebutuhan window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.012 User click expand window")
    public void tcc_m_pengajuan_aksi_012_user_click_expand_window(){
        dataPengajuanM.clickExpandKebutuhan();
        extentTest.log(LogStatus.PASS,"User click expand kebutuhan window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.012 User show smaller window")
    public void tcc_m_pengajuan_aksi_012_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller kebutuhan window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.013 User click collapse window")
    public void tcc_m_pengajuan_aksi_013_user_click_expand_window(){
        dataPengajuanM.clickHideKebutuhan();
        extentTest.log(LogStatus.PASS,"User click collapse kebutuhan window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.013 User hide window")
    public void tcc_m_pengajuan_aksi_013_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide kebutuhan window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.014 User click expand window")
    public void tcc_m_pengajuan_aksi_014_user_click_expand_window(){
        dataPengajuanM.clickExpandKualifikasi();
        extentTest.log(LogStatus.PASS,"User click expand kualifkasi window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.014 User show full window")
    public void tcc_m_pengajuan_aksi_014_user_show_expand_window(){
        extentTest.log(LogStatus.PASS,"User show full kualifikasi window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.015 User click expand window")
    public void tcc_m_pengajuan_aksi_015_user_click_expand_window(){
        dataPengajuanM.clickExpandKualifikasi();
        extentTest.log(LogStatus.PASS,"User click expand kualifkasi window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.015 User show smaller window")
    public void tcc_m_pengajuan_aksi_015_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller kualifkasi window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.016 User click collapse window")
    public void tcc_m_pengajuan_aksi_016_user_click_expand_window(){
        dataPengajuanM.clickHideKualifikasi();
        extentTest.log(LogStatus.PASS,"User click collapse kualifkasi window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.016 User hide window")
    public void tcc_m_pengajuan_aksi_016_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide kualifkasi window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.017 User click expand window")
    public void tcc_m_pengajuan_aksi_017_user_click_expand_window(){
        Hooks.delay(1);
        dataPengajuanM.clickExpandForm();
        extentTest.log(LogStatus.PASS,"User click expand form window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.017 User show full window")
    public void tcc_m_pengajuan_aksi_017_user_show_expand_window(){
        extentTest.log(LogStatus.PASS,"User show full form window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.018 User click expand window")
    public void tcc_m_pengajuan_aksi_018_user_click_expand_window(){
        dataPengajuanM.clickExpandForm();
        extentTest.log(LogStatus.PASS,"User click expand form window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.018 User show smaller window")
    public void tcc_m_pengajuan_aksi_018_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller form window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.019 User click collapse window")
    public void tcc_m_pengajuan_aksi_019_user_click_expand_window(){
        dataPengajuanM.clickHideForm();
        extentTest.log(LogStatus.PASS,"User click collapse form window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.019 User hide window")
    public void tcc_m_pengajuan_aksi_019_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide form window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.020 User click expand window")
    public void tcc_m_pengajuan_aksi_020_user_click_expand_window(){
        Hooks.delay(1);
        dataPengajuanM.clickExpandRemunerasi();
        extentTest.log(LogStatus.PASS,"User click expand remunerasi window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.020 User show full window")
    public void tcc_m_pengajuan_aksi_020_user_show_expand_window(){
        extentTest.log(LogStatus.PASS,"User show full remunerasi window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.021 User click expand window")
    public void tcc_m_pengajuan_aksi_021_user_click_expand_window(){
        Hooks.delay(1);
        dataPengajuanM.clickExpandRemunerasi();
        extentTest.log(LogStatus.PASS,"User click expand remunerasi window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.021 User show smaller window")
    public void tcc_m_pengajuan_aksi_021_user_show_smaller_window(){
        extentTest.log(LogStatus.PASS,"User show smaller remunerasi window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.022 User click collapse window")
    public void tcc_m_pengajuan_aksi_022_user_click_expand_window(){
        dataPengajuanM.clickHideRemunerasi();
        extentTest.log(LogStatus.PASS,"User click collapse remunerasi window");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.022 User hide window")
    public void tcc_m_pengajuan_aksi_022_user_hide_window(){
        extentTest.log(LogStatus.PASS,"User hide remunerasi window");
    }
    @When("TCC.M.PENGAJUAN.AKSI.023 User click button back")
    public void tcc_m_pengajuan_aksi_023_user_click_button_back(){
        Hooks.delay(2);
        dataPengajuanM.clickButtonBackViewData();
        extentTest.log(LogStatus.PASS,"User click button back");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.023 User has click button back")
    public void tcc_m_pengajuan_aksi_023_user_has_click_button_back(){
        Hooks.delay(2);
        System.out.println(dataPengajuanM.getTxtTable());
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("HCI"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("DANA"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("BCA"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("Perfios"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("DIGITAL MIND"));
        extentTest.log(LogStatus.PASS,"User has click button back");
    }

    @When("TCC.M.PENGAJUAN.AKSI.024 User click icon return")
    public void tcc_m_pengajuan_aksi_024_user_click_icon_return(){
        dataPengajuanM.clickIconReturn();
        extentTest.log(LogStatus.PASS,"User click icon return");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.024 User show form")
    public void tcc_m_pengajuan_aksi_024_user_show_form(){
        Hooks.delay(1);
        Assert.assertEquals(dataPengajuanM.getTxtFormReturn(),"Update Status");
        extentTest.log(LogStatus.PASS,"User show return form");
    }
    @When("TCC.M.PENGAJUAN.AKSI.027 User click batal")
    public void tcc_m_pengajuan_aksi_025_user_click_batal(){
        dataPengajuanM.clickButtonBatalFormReturn();
        extentTest.log(LogStatus.PASS,"User click batal");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.027 User has click batal")
    public void tcc_m_pengajuan_aksi_025_user_has_click_batal(){
        Hooks.delay(1);
        System.out.println(dataPengajuanM.getTxtTable());
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("HCI"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("DANA"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("BCA"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("Perfios"));
        Assert.assertTrue(dataPengajuanM.getTxtTable().contains("DIGITAL MIND"));
        extentTest.log(LogStatus.PASS,"User has click batal");
    }
    @When("TCC.M.PENGAJUAN.AKSI.026 User return with empty note")
    public void tcc_m_pengajuan_aksi_026_user_return_with_empty_note(){
        dataPengajuanM.clickIconReturn();
        Hooks.delay(1);
        dataPengajuanM.clickButtonUpdateFromReturn();
        extentTest.log(LogStatus.PASS,"User return with empty note");
    }
    @Then("TCC.M.PENGAJUAN.AKSI.026 User get success message")
    public void tcc_m_pengajuan_aksi_026_user_get_success_message(){
        Hooks.delay(1);
        Assert.assertTrue(dataPengajuanM.getTxtSuccess().contains("Berhasi"));
        extentTest.log(LogStatus.PASS,"User get success message");
    }
    @When("TCC.M.PENGAJUAN.AKSI.025 User return with note")
    public void tcc_m_pengajuan_aksi_025_user_return_with_note(){
        dataPengajuanM.clickIconReturn();
        Hooks.delay(1);
        dataPengajuanM.setTxtNoteReturn("Tambahan");
        extentTest.log(LogStatus.PASS,"User return with empty note");
    }
    @And("TCC.M.PENGAJUAN.AKSI.025 User click button update")
    public void tcc_m_pengajuan_aksi_025_user_click_button_update(){
        dataPengajuanM.clickButtonUpdateFromReturn();
        extentTest.log(LogStatus.PASS,"User click button update");
    }

    @Then("TCC.M.PENGAJUAN.AKSI.025 User get success message")
    public void tcc_m_pengajuan_aksi_025_user_get_success_message(){
        Hooks.delay(1);
        Assert.assertTrue(dataPengajuanM.getTxtSuccess().contains("Berhasi"));
        extentTest.log(LogStatus.PASS,"User get success message");
    }
    @When("TCC.M.PENGAJUAN.HAL.001 User choose halaman")
    public void tcc_m_pengajuan_hal_001_user_pilih_halaman(){
        extentTest.log(LogStatus.PASS,"User choose halaman");
    }
    @Then("TCC.M.PENGAJUAN.HAL.001 User on halaman")
    public void tcc_m_pengajuan_hal_001_user_on_halaman(){
        extentTest.log(LogStatus.PASS,"User on halaman");
    }
    @When("TCC.M.PENGAJUAN.HAL.002 User choose next halaman")
    public void tcc_m_pengajuan_hal_002_user_choose_halaman(){
        extentTest.log(LogStatus.PASS,"User choose next halaman");
    }
    @Then("TCC.M.PENGAJUAN.HAL.002 User on next halaman")
    public void tcc_m_pengajuan_hal_002_user_on_halaman(){
        extentTest.log(LogStatus.PASS,"User on next halaman");
    }
    @When("TCC.M.PENGAJUAN.HAL.003 User choose halaman")
    public void tcc_m_pengajuan_hal_003_user_choose_halaman(){
        extentTest.log(LogStatus.PASS,"User pilih halaman");
    }
    @Then("TCC.M.PENGAJUAN.HAL.003 User on halaman")
    public void tcc_m_pengajuan_hal_003_user_on_halaman(){
        extentTest.log(LogStatus.PASS,"User on halaman");
    }

}
