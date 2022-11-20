package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.HalamanPengajuanPage;
import com.juaracoding.kelompoktigajc.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHalamanPengajuan {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private HalamanPengajuanPage HalamanPengajuanPage = new HalamanPengajuanPage();

    public TestHalamanPengajuan() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //TCC.BD.HALAMAN.001 Pindah ke halaman yang dituju
    @When("TCC.BD.HALAMAN.001 menekan tombol requitment request")
    public void user_menekan_requitmen_request() {
        extentTest.log(LogStatus.PASS, "menekan tombol requitment request");
    }

    @And("TCC.BD.HALAMAN.001 menekan halaman yang dituju")
    public void user_menekan_halaman_dituju() {
        HalamanPengajuanPage.clickBtnDituju();
        extentTest.log(LogStatus.PASS, " menekan halaman yang dituju");
    }

    @Then("TCC.BD.HALAMAN.001 menampilkan halaman yang dituju")
    public void user_pindah_halaman_yang_dituju() {
        Assert.assertEquals(HalamanPengajuanPage.getTxtHalamanTerakhir(), "11");
        extentTest.log(LogStatus.PASS, "menampilkan halaman yang dituju");
    }

    //TCC.BD.HALAMAN.003 Pindah ke halaman Previous
    @When("TCC.BD.HALAMAN.003 menekan halaman Previous")
    public void user_menekan_halaman_previous() {
        HalamanPengajuanPage.clickBtnPrevious();
        extentTest.log(LogStatus.PASS, "menekan halaman Previous");
    }

    @Then("TCC.BD.HALAMAN.003 menampilkan halaman Previous")
    public void user_pindah_halaman_sebelumnya() {
        Assert.assertEquals(HalamanPengajuanPage.getTxtHalamanPertama(), "1");
        extentTest.log(LogStatus.PASS, "menampilkan halaman Previous");
    }

    //TCC.BD.HALAMAN.002 Pindah ke halaman next
    @When("TCC.BD.HALAMAN.002 menekan halaman next")
    public void user_menekan_halaman_next(){
        HalamanPengajuanPage.clickBtnNext();
        extentTest.log(LogStatus.PASS, "menekan halaman next");
    }
    @Then("TCC.BD.HALAMAN.002 menampilkan halaman next")
    public void user_pindah_halaman_setelahnya(){
        Assert.assertEquals(HalamanPengajuanPage.getTxtHalamanTerakhir(),"11");
        extentTest.log(LogStatus.PASS,"menampilkan halaman next");
    }
}