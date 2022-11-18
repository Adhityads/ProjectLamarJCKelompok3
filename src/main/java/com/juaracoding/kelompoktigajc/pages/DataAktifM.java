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
}
