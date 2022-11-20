package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.LoginPage;
import com.juaracoding.kelompoktigajc.pages.RecruitmentPage;
import com.juaracoding.kelompoktigajc.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
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
    //-------------------------------------------------------------------------------------//
    @When("User click data pengajuan")
    public void user_click_data_pengajuan(){
        recruitmentPage.MenuDataPengajuan();
        extentTest.log(LogStatus.PASS,"User click data pengajuan");
    }
    @Then("User show data pengajuan")
    public void user_show_data_pengajuan(){
        //System.out.println(recruitmentPage.getTxtDataPengajuan());
        Assert.assertEquals(recruitmentPage.getTxtDataPengajuan(), "Data Pengajuan");
        extentTest.log(LogStatus.PASS,"User show data pengajuan");
    }
    //-------------------------------------------------------------------------------------//


//    @When("User click filter status approve")
//    public void user_click_filter_status_approve(){
//        recruitmentPage.FilterByApprove();
//        extentTest.log(LogStatus.FAIL,"User click filter status approve");
//    }
//    @Then("User show data approve")
//    public void user_show_data_approve(){
//        //System.out.println(recruitmentPage.getTxtFilter());
//        Assert.assertEquals(recruitmentPage.getTxtFilterApprove(),"No matching records found");
//        extentTest.log(LogStatus.FAIL,"User show data approve");
//    }
    @When("User click filter status pending")
    public void user_click_filter_status_pending(){
        recruitmentPage.FilterByPending();
        extentTest.log(LogStatus.PASS,"User click filter status pending");
    }
    @Then("User show data pending")
    public void user_show_data_pending(){
        System.out.println(recruitmentPage.getTxtFilter());
        //Assert.assertEquals(recruitmentPage.getTxtFilter(),"PENDING");
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("PENDING"));
        extentTest.log(LogStatus.PASS,"User show data pending");
    }
    @When("User click filter status return")
    public void user_click_filter_status_return(){
        recruitmentPage.FilterByReturn();
        extentTest.log(LogStatus.PASS,"User click filter status return");
    }
    @Then("User show data return")
    public void user_show_data_return(){
        System.out.println(recruitmentPage.getTxtFilter());
        //Assert.assertEquals(recruitmentPage.getTxtFilter(),"RETURN");
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("RETURN"));
        extentTest.log(LogStatus.PASS,"User show data return");
    }
    @When("User click filter status cancel")
    public void user_click_filter_status_cancel(){
        recruitmentPage.FilterByCancel();
        extentTest.log(LogStatus.PASS,"User click filter status cancel");
    }
    @Then("User show data cancel")
    public void user_show_data_cancel(){
        System.out.println(recruitmentPage.getTxtFilter());
        //Assert.assertEquals(recruitmentPage.getTxtFilter(),"CANCEL");
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("CANCEL"));
        extentTest.log(LogStatus.PASS,"User show data cancel");
    }
    @When("User click filter status default")
    public void user_click_filter_status_default(){
        recruitmentPage.FilterByDefault();
        extentTest.log(LogStatus.PASS,"User click filter status default");
    }
    @Then("User show data default")
    public void user_show_data_default(){
        System.out.println(recruitmentPage.getTxtFilter());
        //Assert.assertEquals(recruitmentPage.getTxtFilter(),"PENDING");
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("PENDING"));
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("RETURN"));
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("CANCEL"));
        extentTest.log(LogStatus.PASS,"User show data default");
    }

    @When("User Click input data search valid")
    public void user_click_input_data_search_valid(){
        recruitmentPage.klikInputSeach();
        extentTest.log(LogStatus.PASS,"User Click input data search valid");
    }
    @And("User input data and Click search valid")
    public void user_input_data_and_click_search_valid(){
        recruitmentPage.inputValidSearch("ka");
        extentTest.log(LogStatus.PASS,"User input data and Click search valid");
    }
    @Then("User Show data search valid")
    public void user_show_data_search_valid(){
        System.out.println(recruitmentPage.getTxtFilter());
//        Assert.assertEquals(recruitmentPage.getTxtFilter(),"RETRUN");
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("RETURN"));
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("PENDING"));
        Assert.assertTrue(recruitmentPage.getTxtFilter().contains("CANCEL"));
        extentTest.log(LogStatus.PASS,"User Show data search valid");
    }

    @When("User Click input data search invalid")
    public void user_click_input_data_search_invalid(){
        recruitmentPage.klikInputSeach();
        extentTest.log(LogStatus.PASS,"User Click input data search invalid");
    }
    @And("User input data and Click search invalid")
    public void user_input_data_and_click_search_invalid(){
        recruitmentPage.inputInvalidSearch("@#");
        extentTest.log(LogStatus.PASS,"User input data and Click search invalid");
    }

    @Then("User Show data search invalid")
    public void user_show_data_search_invalid(){
        System.out.println(recruitmentPage.getTxtFilterApprove());
        Assert.assertEquals(recruitmentPage.getTxtFilterApprove(),"No matching records found");
        extentTest.log(LogStatus.PASS,"User Show data search invalid");
    }
    @When("User click show entries sepuluh")
    public void User_click_show_entries_sepuluh(){
        recruitmentPage.showDataSepuluhDataPengajuan();
        extentTest.log(LogStatus.PASS,"User click show entries sepuluh");
    }
    @Then("User show sepuluh entries")
    public void user_show_sepuluh_entries() {
        System.out.println(recruitmentPage.getIntTxtShowEntries());
        Assert.assertTrue(recruitmentPage.getIntTxtShowEntries()==10);
        extentTest.log(LogStatus.PASS, "User show sepuluh entries");
    }
    @When("User click show entries dualima")
    public void User_click_show_entries_dualima(){
        recruitmentPage.showDatadualimaDataPengajuan();
        extentTest.log(LogStatus.PASS,"User click show entries dualima");
    }
    @Then("User show dualima entries")
    public void user_show_dualima_entries() {
        System.out.println(recruitmentPage.getIntTxtShowEntries());
        Assert.assertTrue(recruitmentPage.getIntTxtShowEntries()==25);
        extentTest.log(LogStatus.PASS, "User show dualima entries");
    }

    @When("User click show entries limapuluh")
    public void User_click_show_entries_limapuluh(){
        recruitmentPage.showDatalimapuluhDataPengajuan();
        extentTest.log(LogStatus.PASS,"User click show entries limapuluh");
    }
    @Then("User show limapuluh entries")
    public void user_show_limapuluh_entries() {
        System.out.println(recruitmentPage.getIntTxtShowEntries());
        Assert.assertTrue(recruitmentPage.getIntTxtShowEntries()==50);
        extentTest.log(LogStatus.PASS, "User show limapuluh entries");
    }
    @When("User click show entries seratus")
    public void User_click_show_entries_seratus(){
        recruitmentPage.showDataseratusDataPengajuan();
        extentTest.log(LogStatus.PASS,"User click show entries seratus");
    }
    @Then("User show seratus entries")
    public void user_show_seratus_entries() {
        System.out.println(recruitmentPage.getIntTxtShowEntries());
        Assert.assertTrue(recruitmentPage.getIntTxtShowEntries()==100);
        extentTest.log(LogStatus.PASS, "User show seratus entries");
    }

}
