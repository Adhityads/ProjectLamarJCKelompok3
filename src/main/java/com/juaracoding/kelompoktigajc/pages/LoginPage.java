package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void Delay(int lama){
        try {
            Thread.sleep(1000*lama);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement txtLogin;
    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement txtLoginSuccess;

    public void login(String username, String password) {
        this.username.click();
        this.username.sendKeys(username);
        this.password.click();
        this.password.sendKeys(password);
    }
    public void clickBtnLogin() {
        btnLogin.click();
    }
    public String getTxtLogin(){
        return txtLogin.getText();
    }
    public String getTxtLoginSuccess(){
        Delay(1);
        return txtLoginSuccess.getText();
    }
}
