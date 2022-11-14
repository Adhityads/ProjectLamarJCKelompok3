package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //button
    @FindBy(xpath = "//a[normalize-space()='Recruitment Request']")
    WebElement menuRecruitmentRequest;
    @FindBy(xpath = "//a[@class='nav-link active']")
    WebElement menuDataPengajuan;
    @FindBy(id = "filterStatus")
    WebElement clickFilter;

    @FindBy(xpath = "//*[@id=\"filterStatus\"]/option")
    List<WebElement> listbtnFilter;
    @FindBy(xpath = "//button[@id='btn-filter']")
    WebElement btnFilter;



    //-----------------------------------------------------------------------------------------------//

    //Text
    @FindBy (xpath = "//*[@id=\"content\"]/h1")
    WebElement txtRecruitmentRequest;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/ul/li")
    List<WebElement> txtDataPengajuan;
    @FindBy(id = "table_info")
    WebElement txtFilterApprove;


    //Menu
    public void MenuRecruitment(){
        menuRecruitmentRequest.click();
    }
    public void MenuDataPengajuan(){
        menuDataPengajuan.click();
    }
    public void FilterByApprove(){
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        clickFilter.click();
        //wait.until(ExpectedConditions.elementToBeClickable(listbtnFilter.get(1)));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        listbtnFilter.get(1).click();
        btnFilter.click();
    }

    //------------------------------------------------------------------------------------------------//

    //Validasi
    public String getTxtRecruitmentRequest(){
        return txtRecruitmentRequest.getAttribute("textContent");
    }
    public String getTxtDataPengajuan() {
        return txtDataPengajuan.get(0).getAttribute("innerText");
    }
    public String getTxtFilter() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return txtFilterApprove.getText();
    }




}
