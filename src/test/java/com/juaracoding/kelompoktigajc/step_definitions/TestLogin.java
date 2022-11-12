package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.LoginPage;
import com.juaracoding.kelompoktigajc.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

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
    @When("User bd enter valid uppercase username")
    public void user_bd_enter_valid_uppercase_username(){
        loginPage.login("BD","12345678");
        extentTest.log(LogStatus.PASS,"User enter valid uppercase username");
    }
}
