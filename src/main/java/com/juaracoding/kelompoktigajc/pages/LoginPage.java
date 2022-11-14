package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import io.cucumber.messages.types.Hook;
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
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement txtLoginSuccess;
    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement txtUsernameRequired;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement txtPasswordRequired;
    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div/div")
    WebElement txtGagalLogin;

    @FindBy(xpath = "//*[@id=\"header\"]/ul/li/a")
    WebElement buttonProfil;

    @FindBy(xpath = "//*[@id=\"header\"]/ul/li/div/a")
    WebElement buttonLogout;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }
    public void clickBtnLogin() {
        btnLogin.click();
    }
    public String getTxtLoginSuccess(){
        return txtLoginSuccess.getText();
    }
    public String getTxtUsernameRequired(){
       return txtUsernameRequired.getAttribute("required");
    }
    public String getTxtPasswordRequired(){
        return txtPasswordRequired.getAttribute("required");
    }
    public String getTxtGagalLogin(){
        return txtGagalLogin.getText();
    }
    public void logout(){
        buttonProfil.click();
        buttonLogout.click();
    }
}
