package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApproveRRF {
    private WebDriver driver;

    public ApproveRRF() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[5]/a")
    WebElement menuApproveRRF;

    @FindBy(xpath = "//*[@id=\"content\"]")
    WebElement txtMenuApproveRRF;

    public void clickMenuApproveRRF(){
        menuApproveRRF.click();
    }

    public String getTxtMenuApproveRRF(){
        return txtMenuApproveRRF.getText();
    }
}
