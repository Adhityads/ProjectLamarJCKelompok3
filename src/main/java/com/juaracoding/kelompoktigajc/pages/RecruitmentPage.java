package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage() {
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
    @FindBy(xpath = "//button[@id='btn-reset']")
    WebElement btnReset;
    @FindBy(xpath = "//*[@id=\"table_filter\"]/label/input")
    WebElement clickSearch;
    @FindBy(xpath = "//*[@id=\"btnSearch\"]")
    WebElement btnSearch;
    @FindBy(xpath = "//span[@id='btnRefresh']")
    WebElement btnResetSearch;
    @FindBy(xpath = "//select[@name='table_length']")
    WebElement clickShowEntries;



    //-----------------------------------------------------------------------------------------------//

    //Text
    @FindBy (xpath = "//*[@id=\"content\"]/h1")
    WebElement txtRecruitmentRequest;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/ul/li")
    List<WebElement> txtDataPengajuan;
    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr/td")
    WebElement txtFilterApprove;
    @FindBy(xpath = "//*[@id=\"table\"]/tbody")
    WebElement txtFilter;


    //-----------------------------------------------------------------------------------------------//

    //Menu
    public void MenuRecruitment(){
        menuRecruitmentRequest.click();
    }
    public void MenuDataPengajuan(){
        menuDataPengajuan.click();
    }
    public void FilterByDefault(){
        clickFilter.click();
        Delay(2);
        listbtnFilter.get(0).click();
        btnFilter.click();
    }
    public void FilterByApprove(){
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(listbtnFilter.get(1)));
        clickFilter.click();
        Delay(2);
        listbtnFilter.get(1).click();
        btnFilter.click();
    }
    public void FilterByPending(){
        clickFilter.click();
        Delay(2);
        listbtnFilter.get(2).click();
        btnFilter.click();
    }
    public void FilterByReturn(){
        clickFilter.click();
        Delay(2);
        listbtnFilter.get(3).click();
        btnFilter.click();
    }
    public void FilterByCancel(){
        clickFilter.click();
        Delay(2);
        listbtnFilter.get(4).click();
        btnFilter.click();
    }
    public void klikInputSeach(){
        btnReset.click();
        clickSearch.click();
    }
    public void inputValidSearch(String searchValid){
        Delay(2);
        clickSearch.sendKeys(searchValid);
        btnSearch.click();
    }
    public void inputInvalidSearch(String searchInvalid){
        Delay(2);
        clickSearch.sendKeys(searchInvalid);
        btnSearch.click();
    }
    public void showDataSepuluhDataPengajuan(){
        btnResetSearch.click();
        Delay(2);
        WebElement elementSelectShowentries = clickShowEntries;
        Select showentries = new Select(elementSelectShowentries);
        showentries.selectByIndex(0);
    }
    public void showDatadualimaDataPengajuan(){
        Delay(2);
        WebElement elementSelectShowentries = clickShowEntries;
        Select showentries = new Select(elementSelectShowentries);
        showentries.selectByIndex(1);
    }
    public void showDatalimapuluhDataPengajuan(){
        Delay(2);
        WebElement elementSelectShowentries = clickShowEntries;
        Select showentries = new Select(elementSelectShowentries);
        showentries.selectByIndex(2);
    }
    public void showDataseratusDataPengajuan(){
        Delay(2);
        WebElement elementSelectShowentries = clickShowEntries;
        Select showentries = new Select(elementSelectShowentries);
        showentries.selectByIndex(3);
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
        Delay(2);
        return txtFilter.getText();
    }
    public String getTxtFilterApprove() {
        Delay(2);
        return txtFilterApprove.getText();
    }
    public int getIntTxtShowEntries(){
        Delay(2);
        List<WebElement> rows = txtFilter.findElements(By.tagName("tr"));
        int row = rows.size();
        return row;
    }



}
