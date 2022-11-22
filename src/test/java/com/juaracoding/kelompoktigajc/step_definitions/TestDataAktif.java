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
import io.cucumber.java.et.Ja;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        extentTest.log(LogStatus.PASS,"User view data hide");
    }

    @When("TCC.BD.DATAAKTIF.AKSI.003 User click icon view data")
    public void tcc_bd_dataaktif_aksi_003_user_click_icon_view_data(){
        dataAktif.clickButtonPlus();
        Hooks.delay(1);
        dataAktif.clickIconViewDataBd();
        extentTest.log(LogStatus.PASS,"User click icon view data");
    }
    @Then("TCC.BD.DATAAKTIF.AKSI.003 User on view data")
    public void tcc_bd_dataaktif_aksi_003_user_on_view_data(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktif.getTxtJumlahKebutuhan().contains("Jumlah Kebutuhan"));
        Assert.assertTrue(dataAktif.getTxtJumlahKebutuhan().contains("Penempatan"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Kebutuhan"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Project Name"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Client Name"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Jenis Kerjasama"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Tanggal Aktif"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Tanggal Berakhir"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Nama Posisi"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Others"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Status Kontrak"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Hari Kerja"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Jam Kerja"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Job Description"));
        Assert.assertTrue(dataAktif.getTxtKebutuhan().contains("Project Knowledge"));
        Assert.assertTrue(dataAktif.getTxtKualifikasi().contains("Kualifikasi"));
        Assert.assertTrue(dataAktif.getTxtKualifikasi().contains("Gender"));
        Assert.assertTrue(dataAktif.getTxtKualifikasi().contains("Education"));
        Assert.assertTrue(dataAktif.getTxtKualifikasi().contains("Usia"));
        Assert.assertTrue(dataAktif.getTxtKualifikasi().contains("Penampilan"));
        Assert.assertTrue(dataAktif.getTxtKualifikasi().contains("Pengalaman"));
        Assert.assertTrue(dataAktif.getTxtKualifikasi().contains("Kemampuan B. Inggris"));
        Assert.assertTrue(dataAktif.getTxtKualifikasi().contains("Kemampuan Komputer"));
        Assert.assertTrue(dataAktif.getTxtKualifikasi().contains("Kualifikasi lainnya"));
        Hooks.scroll(800);
        Assert.assertTrue(dataAktif.getTxtFormFrom().contains("Form"));
        Assert.assertTrue(dataAktif.getTxtFormFrom().contains("Divisi"));
        Assert.assertTrue(dataAktif.getTxtFormFrom().contains("Departement"));
        Assert.assertTrue(dataAktif.getTxtFormFrom().contains("Unit"));
        Assert.assertTrue(dataAktif.getTxtFormFrom().contains("Level"));
        Assert.assertTrue(dataAktif.getTxtFormFrom().contains("Upliner"));
        Assert.assertTrue(dataAktif.getTxtRemunerasi().contains("Remunerasi"));
        dataAktif.clickButtonBackViewData();
        extentTest.log(LogStatus.PASS,"User on view data");
    }

    @When("TCC.BD.DATAAKTIF.AKSI.004 User click icon download data")
    public void tcc_bd_dataaktif_aksi_004_user_click_icon_download_data(){
        Hooks.delay(1);
        dataAktif.clickButtonPlus();
        Hooks.delay(1);
        dataAktif.clickIconDownloadDataBd();
        extentTest.log(LogStatus.PASS,"User click icon download data");
    }
    @Then("TCC.BD.DATAAKTIF.AKSI.004 User has download data")
    public void tcc_bd_dataaktif_aksi_004_user_has_download_data(){
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS,"User has download data");
    }

    @When("TCC.BD.DATAAKTIF.AKSI.005 User click icon update status")
    public void tcc_bd_dataaktif_aksi_005_user_click_icon_update_status(){
        Hooks.delay(1);
        dataAktif.clickButtonPlusDua();
        Hooks.delay(2);
        dataAktif.clickIconUpdateStatusBd();
        extentTest.log(LogStatus.PASS,"User click icon update status");
    }
    @Then("TCC.BD.DATAAKTIF.AKSI.005 User on update status")
    public void tcc_bd_dataaktif_aksi_005_user_on_update_status(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktif.getTxtUpdateStatus().contains("Update Data"));
        Assert.assertTrue(dataAktif.getTxtUpdateStatus().contains("Status"));
        Assert.assertTrue(dataAktif.getTxtUpdateStatus().contains("Note"));
        extentTest.log(LogStatus.PASS,"User on update status");
    }

    @When("TCC.BD.DATAAKTIF.AKSI.007 User fill empty status")
    public void tcc_bd_dataaktif_aksi_007_user_fill_empty_update_status(){
        Hooks.delay(2);
        dataAktif.updateStatusStatusEmpty();
        extentTest.log(LogStatus.PASS,"User fill empty status");
    }
    @And("TCC.BD.DATAAKTIF.AKSI.007 User click button update")
    public void tcc_bd_dataaktif_aksi_007_user_click_button_update(){
        dataAktif.clickButtonUpdateStatusUpdate();
        extentTest.log(LogStatus.PASS,"User click button update");
    }
    @Then("TCC.BD.DATAAKTIF.AKSI.007 User get required message")
    public void tcc_bd_dataaktif_aksi_007_user_get_required_message(){
        Assert.assertEquals(dataAktif.getTxtStatus(),"true");
        extentTest.log(LogStatus.PASS,"User get reuired message");
    }

    @When("TCC.BD.DATAAKTIF.AKSI.006 User click update status")
    public void tcc_bd_dataaktif_aksi_006_user_fill_valid_update_status(){
        Hooks.delay(1);
        dataAktif.updateStatusStatusValid();
        extentTest.log(LogStatus.PASS,"User fill valid update status");
    }
    @And("TCC.BD.DATAAKTIF.AKSI.006 User click button update")
    public void tcc_bd_dataaktif_aksi_006_user_click_button_update(){
        dataAktif.clickButtonUpdateStatusUpdate();
        extentTest.log(LogStatus.PASS,"User click button update");
    }
    @Then("TCC.BD.DATAAKTIF.AKSI.006 User get success message")
    public void tcc_bd_dataaktif_aksi_006_user_get_success_message(){
        Hooks.delay(1);
        Assert.assertEquals(dataAktif.getTxtUpdateStatusValid(),"DONE");
        extentTest.log(LogStatus.PASS,"User success update status");
    }

    @When("TCC.BD.DATAAKTIF.AKSI.008 User click icon repeat data")
    public void tcc_bd_dataaktif_aksi_008_user_click_icon_repeat_data(){
        Hooks.delay(1);
        dataAktif.clickIconRepeatDataBd();
        extentTest.log(LogStatus.PASS,"User click icon repeat data");
    }
    @Then("TCC.BD.DATAAKTIF.AKSI.008 User on repeat data")
    public void tcc_bd_dataaktif_aksi_008_user_on_repeat_data(){
        Hooks.delay(2);
        System.out.println(dataAktif.getTxtRepeatData());
        Assert.assertTrue(dataAktif.getTxtRepeatData().contains("Form Repeat"));
        Assert.assertTrue(dataAktif.getTxtRepeatDataJumlahKebutuhan().contains("Bekasi"));
        Assert.assertTrue(dataAktif.getTxtRepeatDataKebutuhan().contains("CRM OPERATOR"));
        Assert.assertTrue(dataAktif.getTxtRepeatDataKebutuhan().contains("HCI"));
        Assert.assertTrue(dataAktif.getTxtRepeatDataKebutuhan().contains("Design Grafis"));
        Assert.assertTrue(dataAktif.getTxtRepeatDataKebutuhan().contains("MAGANG"));
        Assert.assertTrue(dataAktif.getTxtRepeatDataKebutuhan().contains("Shift"));
        Assert.assertTrue(dataAktif.getTxtRepeatDataKualifikasi().contains("DIPLOMA"));
        Hooks.scroll(800);
        dataAktif.clickButtonBackRepeatData();
    }

    @When("TCC.BD.DATAAKTIF.AKSI.009 User click icon poster")
    public void tcc_bd_dataaktif_aksi_009_user_click_icon_poster(){
        dataAktif.clickMenuDataAktifDua();
        Hooks.delay(1);
        dataAktif.clickButtonPlus();
        Hooks.delay(1);
        dataAktif.clickIconPosterBd();
        extentTest.log(LogStatus.PASS,"User click icon download poster");
    }
    @Then("TCC.BD.DATAAKTIF.AKSI.009 User has click icon poster")
    public void tcc_bd_dataaktif_aksi_009_user_on_icon_poster(){
        extentTest.log(LogStatus.PASS, "User has click icon poster");
    }

    @When("TCC.BD.DATAAKTIF.HAL.001 User choose halaman 2")
    public void tcc_bd_dataaktif_hal_001_user_choose_halaman(){
        Hooks.scroll(100);
        dataAktif.clickButtonHal();
        extentTest.log(LogStatus.PASS,"User choose halaman 2");
    }
    @Then("TCC.BD.DATAAKTIF.HAL.001 User on halaman 2")
    public void tcc_bd_dataaktif_hal_001_user_on_halaman_2(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktif.getTxtHal().contains("11 to 20"));
        extentTest.log(LogStatus.PASS,"User on halaman 2");
    }
    @When("TCC.BD.DATAAKTIF.HAL.002 User choose next halaman")
    public void tcc_bd_dataaktif_hal_002_user_choose_next_halaman(){
        Hooks.scroll(100);
        dataAktif.clickButtonHalNext();
        extentTest.log(LogStatus.PASS,"User choose next halaman");
    }
    @Then("TCC.BD.DATAAKTIF.HAL.002 User on halaman 3")
    public void tcc_bd_dataaktif_hal_002_user_on_halaman_3(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktif.getTxtHal().contains("21 to 30"));
        extentTest.log(LogStatus.PASS,"User on halaman 3");
    }
    @When("TCC.BD.DATAAKTIF.HAL.003 User choose previous halaman")
    public void tcc_bd_dataaktif_hal_003_user_choose_previous_halaman(){
        Hooks.scroll(100);
        dataAktif.clickButtonHalPrev();
        extentTest.log(LogStatus.PASS,"User choose previous halaman");
    }
    @Then("TCC.BD.DATAAKTIF.HAL.003 User on halaman 2")
    public void tcc_bd_dataaktif_hal_003_user_on_halaman_2(){
        Hooks.delay(1);
        Assert.assertTrue(dataAktif.getTxtHal().contains("11 to 20"));
        extentTest.log(LogStatus.PASS,"User on halaman 2");
    }

}
