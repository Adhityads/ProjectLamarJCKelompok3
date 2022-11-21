package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DataAktifM {
    private WebDriver driver;

    public DataAktifM() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/ul/li[2]/a/span[2]")
    WebElement menuDataAktif;
    @FindBy(xpath = "//*[@id=\"dataTable-setup-aktif\"]/tbody")
    WebElement txtTable;
    @FindBy(xpath = "//*[@id=\"dataTable-setup-aktif_length\"]/label/select")
    WebElement showentries;
    @FindBy(xpath = "//*[@id=\"dataTable-setup-aktif_filter\"]/label/input")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"btnSearch\"]")
    WebElement buttonSearch;
    @FindBy(xpath = "//*[@id=\"btnRefresh\"]")
    WebElement buttonRefresh;

    @FindBy(xpath = "//*[@id=\"dataTable-setup-aktif\"]/tbody/tr[1]/td[8]/center/div/a[1]")
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
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[2]/div/div[1]/div/a[2]")
    WebElement hideKebutuhan;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[2]/div/div[1]/div/a[1]")
    WebElement expandKebutuhan;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[3]/div/div[1]/div/a[1]")
    WebElement expandKualifikasi;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[3]/div/div[1]/div/a[2]")
    WebElement hideKualifikasi;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[3]/div/div/div[1]/div/a[1]")
    WebElement expandForm;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[3]/div/div/div[1]/div/a[2]")
    WebElement hideForm;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[4]/div/div/div[1]/div/a[1]")
    WebElement expandRemunerasi;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[4]/div/div/div[1]/div/a[2]")
    WebElement hideRemunerasi;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a[2]")
    WebElement buttonBackViewData;
    @FindBy(xpath = "//*[@id=\"dataTable-setup-aktif\"]/tbody/tr[1]/td[8]/center/div/a[2]")
    WebElement iconDownloadData;
    @FindBy(xpath = "//*[@id=\"dataTable-setup-aktif_paginate\"]/ul/li[3]/a")
    WebElement buttonHal;
    @FindBy(xpath = "//*[@id=\"dataTable-setup-aktif_next\"]/a")
    WebElement buttonHalNext;
    @FindBy(xpath = "//*[@id=\"dataTable-setup-aktif_previous\"]/a")
    WebElement buttonHalPrev;
    @FindBy(xpath = "//*[@id=\"dataTable-setup-aktif_info\"]")
    WebElement txtHal;

    public void clickMenuDataAktif(){
        menuDataAktif.click();
    }
    public String getTxtTable(){
        return txtTable.getText();
    }
    public int getTxtTableRow(){
        List<WebElement> rows = txtTable.findElements(By.tagName("tr"));
        int row = rows.size();
        return row;
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
    public void search(String value){
        search.sendKeys(value);
    }
    public void clickButtonSearch(){
        buttonSearch.click();
    }
    public void clickButtonRefresh(){
        buttonRefresh.click();
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
    public void clickHideKebutuhan(){
        hideKebutuhan.click();
    }
    public void clickExpandKebutuhan(){
        expandKebutuhan.click();
    }
    public void clickHideKualifikasi(){
        hideKualifikasi.click();
    }
    public void clickExpandKualifikasi(){
        expandKualifikasi.click();
    }
    public void clickExpandForm(){
        expandForm.click();
    }
    public void clickHideForm(){
        hideForm.click();
    }
    public void clickExpandRemunerasi(){
        expandRemunerasi.click();
    }
    public void clickHideRemunerasi(){
        hideRemunerasi.click();
    }
    public void clickButtonBackViewData(){
        buttonBackViewData.click();
    }
    public void clickIconDownloadData(){
        iconDownloadData.click();
    }
    public void clickButtonHal(){
        buttonHal.click();
    }
    public void clickButtonHalNext(){
        buttonHalNext.click();
    }
    public void clickButtonHalPrev(){
        buttonHalPrev.click();
    }
    public String getTxtHal(){
        return txtHal.getText();
    }

}
