package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage() {
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

    @FindBy(xpath = "//div[@class='widget widget-stats bg-success']//a[contains(text(),'View Detail')]")
    WebElement viewDataTujuh;
    @FindBy(xpath = "//div[@class='widget widget-stats bg-warning']//a[contains(text(),'View Detail')]")
    WebElement viewDataSepuluh;
    @FindBy(xpath = "//div[@class='widget widget-stats bg-secondary']//a[contains(text(),'View Detail')]")
    WebElement viewDataEmpatBelas;
    @FindBy(xpath = "//a[@class='btn btn-sm btn-danger']")
    WebElement btnBack;


    @FindBy(xpath = "//*[@id=\"dataTable-detail-offering\"]/tbody/tr/td")
    WebElement txtDetailData;

    public void viewDetailDataTujuh(){
        viewDataTujuh.click();
        Delay(5);

    }
    public void viewDetailDataSepuluh(){
        btnBack.click();
        viewDataSepuluh.click();
        Delay(5);

    }

    public void viewDetailDataEmpatBelas(){
        btnBack.click();
        viewDataEmpatBelas.click();
        Delay(5);
    }

    public String getTxtDetailData(){
        Delay(1);
        return txtDetailData.getText();
    }


}
