package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.LoginPage;
import com.juaracoding.kelompoktigajc.pages.OpenUrl;
import com.juaracoding.kelompoktigajc.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestOpenUrl {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private OpenUrl openUrl = new OpenUrl();

    public TestOpenUrl() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User open invalid url")
    public void user_open_invalid_url() {
        driver.get("https://dev.ptdika.com/lamar2/login2");
        Hooks.delay(2);
        openUrl.getTxtUrlF();
        extentTest.log(LogStatus.PASS, "User Go to invalid URL");
    }
    @Then("User on invalid url")
    public void user_on_invalid_url(){
        Assert.assertEquals(openUrl.getTxtUrlF(),"404 Page Not Found");
        extentTest.log(LogStatus.PASS,"User on invalid URL");
    }
    @When("User open valid url")
    public void user_open_valid_url(){
        driver.get(Constants.URL);
        Hooks.delay(1);
        openUrl.getTxtUrl();
        extentTest.log(LogStatus.PASS, "User Go to valid URL");
    }
    @Then("User on valid url")
    public void user_on_valid_url(){
        Assert.assertEquals(openUrl.getTxtUrl(),"User Login");
        extentTest.log(LogStatus.PASS,"User on valid URL");
    }
}
