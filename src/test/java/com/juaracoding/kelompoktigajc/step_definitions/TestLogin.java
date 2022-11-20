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

    @When("User go to web login")
    public void user_go_to_web_login_demoqa(){
        driver.get(Constants.URL);
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS,"User Go to web login");
    }
    @And("User enter username and password")
    public void user_enter_username_and_password(){
        loginPage.login("bd","12345678");
        extentTest.log(LogStatus.PASS,"User enter username and password");
    }
    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS,"User click button login");
    }
    @Then("User login success")
    public void user_login_success(){
        extentTest.log(LogStatus.PASS,"User login Success");
    }
}
