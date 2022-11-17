package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DataPengajuanM {
    private WebDriver driver;

    public DataPengajuanM() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"dataTable-setup\"]/tbody")
    WebElement txtTable;

    @FindBy(xpath = "//*[@id=\"dataTable-setup_length\"]/label/select")
    WebElement showentries;

    @FindBy(xpath = "//*[@id=\"dataTable-setup_filter\"]/label/input")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"btnSearch\"]")
    WebElement buttonSearch;
    @FindBy(xpath = "//*[@id=\"btnRefresh\"]")
    WebElement buttonRefresh;

    @FindBy(xpath = "//*[@id=\"dataTable-setup\"]/tbody/tr[1]/td[8]/center/div/a[1]")
    WebElement buttonApprove;

    @FindBy(xpath = "//*[@id=\"alert\"]")
    WebElement txtApproveSuccess;

    @FindBy(xpath = "//*[@id=\"dataTable-setup\"]/tbody/tr[1]/td[8]/center/div/a[2]")
    WebElement iconViewData;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div")
    WebElement txtJumlahKebutuhan;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[2]")
    WebElement txtKebutuhan;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[3]")
    WebElement txtKualifikasi;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[3]/div")
    WebElement txtFormFrom;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[4]/div")
    WebElement txtRemunerasi;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/div[1]/div/a[2]")
    WebElement hideJumlahKebutuhan;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/div[1]/div/a[1]")
    WebElement expandJumlahKebutuhan;



    public void showentriessepuluh(){
        WebElement elementSelectShowentries= showentries;
        Select showentries = new Select(elementSelectShowentries);
        showentries.selectByIndex(0);
    }
    public void showentriesduapuluhlima(){
        WebElement elementSelectShowentries= showentries;
        Select showentries = new Select(elementSelectShowentries);
        showentries.selectByIndex(1);
    }
    public void showentrieslimapuluh(){
        WebElement elementSelectShowentries= showentries;
        Select showentries = new Select(elementSelectShowentries);
        showentries.selectByIndex(2);
    }
    public void showentriesseratus(){
        WebElement elementSelectShowentries= showentries;
        Select showentries = new Select(elementSelectShowentries);
        showentries.selectByIndex(3);
    }
    public String getTxtTable(){
        return txtTable.getText();
    }
    public int getTxtTableRow(){
        List<WebElement> rows = txtTable.findElements(By.tagName("tr"));
        int row = rows.size();
        return row;
    }
    public void search(String value){
        search.sendKeys(value);
    }
    public void clickButtonSearch(){
        buttonSearch.click();
    }
    public void clickButtonRefresh(){
        buttonRefresh.click();
    }
    public void clickButtonApprove(){
        buttonApprove.click();
    }
    public void clickAlertOK(){
        driver.switchTo().alert().accept();
    }
    public void clickAlertCancel(){
        driver.switchTo().alert().dismiss();
    }
    public String getTxtAlert(){
        return driver.switchTo().alert().getText();
    }
    public String getTxtApproveSuccess(){
        return txtApproveSuccess.getText();
    }
    public void clickIconViewData(){
        iconViewData.click();
    }
    public String getTxtJumlahKebutuhan(){
        return txtJumlahKebutuhan.getText();
    }
    public String getTxtKebutuhan(){
        return txtKebutuhan.getText();
    }
    public String getTxtKualifikasi(){
        return txtKualifikasi.getText();
    }
    public String getTxtFormFrom(){
        return txtFormFrom.getText();
    }
    public String getTxtRemunerasi(){
        return txtRemunerasi.getText();
    }

    public void clickHideJumlahKebutuhan(){
        hideJumlahKebutuhan.click();
    }
    public void clickExpandJumlahKebutuhan(){
        expandJumlahKebutuhan.click();
    }

}
