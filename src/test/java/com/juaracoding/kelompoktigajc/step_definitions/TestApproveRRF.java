package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.ApproveRRF;
import com.juaracoding.kelompoktigajc.pages.LoginPage;
import com.juaracoding.kelompoktigajc.pages.OpenUrl;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestApproveRRF {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private ApproveRRF approveRRF = new ApproveRRF();

    public TestApproveRRF() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        }

    @When("TCC.M.APPROVERRF.001 User click menu approve RRF")
    public void tcc_m_approverrf_001_user_click_menu_approve_rrf(){
        approveRRF.clickMenuApproveRRF();
        extentTest.log(LogStatus.PASS,"User click menu approve RRF");
    }
    @Then("TCC.M.APPROVERRF.001 User on menu approve RRF")
    public void tcc_m_approverrf_001_user_on_menu_approve_rrf(){
        Hooks.delay(2);
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Approve RRF"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Data Pengajuan"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Data Aktif"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("No"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Data"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Jenis Kerjasama"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Jumlah Kebutuhan"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Nama BD"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Tanggal dibuat"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Status"));
        Assert.assertTrue(approveRRF.getTxtMenuApproveRRF().contains("Aksi"));
        extentTest.log(LogStatus.PASS,"User on menu Approve RRF");
    }


}
