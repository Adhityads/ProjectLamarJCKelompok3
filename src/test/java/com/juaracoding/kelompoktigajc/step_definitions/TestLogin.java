package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.LoginPage;
import com.juaracoding.kelompoktigajc.pages.OpenUrl;
import com.juaracoding.kelompoktigajc.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.HookTestStep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();
    private OpenUrl openUrl = new OpenUrl();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User enter empty username and password")
    public void user_enter_empty_username_and_password(){
        loginPage.login("","");
        extentTest.log(LogStatus.PASS,"User enter empty username and password");
    }
    @And("User click login button")
    public void user_click_login_button(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS,"User clicked login button");
    }
    @Then("User get message required")
    public void user_get_message_required(){
        Assert.assertEquals(loginPage.getTxtUsernameRequired(),"true");
        Assert.assertEquals(loginPage.getTxtPasswordRequired(),"true");
        extentTest.log(LogStatus.PASS,"User get message required");
    }

    @When("User bd enter valid username and password")
    public void user_enter_username_and_password(){
        loginPage.login("bd","12345678");
        extentTest.log(LogStatus.PASS,"User enter valid username and password");
    }
    @And("User bd click button login")
    public void user_click_button_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS,"User click button login");
    }
    @Then("User bd login success")
    public void user_bd_login_success(){
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtLoginSuccess(),"Dashboard");
        extentTest.log(LogStatus.PASS,"User login Success");
    }
    @When("TCC.LOGIN.005")
    public void user_bd_enter_valid_uppercase_username(){
        loginPage.login("BD","12345678");
        extentTest.log(LogStatus.PASS,"User enter valid uppercase username");
    }

    @When("TCC.LOGIN.004")
    public void tcc_login_004(){
        loginPage.login("bda","123456");
        extentTest.log(LogStatus.PASS,"User enter invalid username and password");
    }

    @Then("User bd login fail")
    public void user_bd_login_fail(){
        Hooks.delay(1);
        Assert.assertTrue(loginPage.getTxtGagalLogin().contains("Gagal! Username or Password Incorrect"));
        extentTest.log(LogStatus.PASS,"User bd login fail");
    }
    @When("TCC.LOGIN.007")
    public void user_bd_logout(){
        loginPage.logout();
        extentTest.log(LogStatus.PASS,"User bd click logout");
    }
    @Then("User bd has log out")
    public void user_bd_has_log_out(){
        Hooks.delay(1);
        Assert.assertEquals(openUrl.getTxtUrl(),"User Login");
        extentTest.log(LogStatus.PASS, "User bd logout success");
    }
}
