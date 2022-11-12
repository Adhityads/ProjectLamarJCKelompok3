package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenUrl {
    private WebDriver driver;

    public OpenUrl() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div[1]")
    WebElement txtUrl;
    @FindBy(xpath = "//*[@id=\"container\"]/h1")
    WebElement txtUrlF;

    public String getTxtUrl(){
        return txtUrl.getText();
    }
    public String getTxtUrlF(){
        return txtUrlF.getText();
    }
}

