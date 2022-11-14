package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DataAktif {
    private WebDriver driver;
    String searchValue;

    public DataAktif() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[6]/a")
    WebElement menuRecruitment;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/ul/li[2]/a/span[2]")
    WebElement menuDataAktif;

    @FindBy(xpath = "//*[@id=\"filterStatus\"]")
    WebElement filter;

    @FindBy(xpath = "//*[@id=\"btn-filter\"]")
    WebElement buttonFilter;

    @FindBy(xpath = "//*[@id=\"btn-reset\"]")
    WebElement buttonReset;

    @FindBy(xpath = "//*[@id=\"table_length\"]/label/select")
    WebElement showentries;

    @FindBy(xpath = "//*[@id=\"table_filter\"]/label/input")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"btnSearch\"]/i")
    WebElement buttonSearch;

    @FindBy(xpath = "//*[@id=\"btnRefresh\"]/i")
    WebElement buttonRefresh;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody")
    WebElement txtSearch;


    public void clickMenuRecruitment(){
        menuRecruitment.click();
    }
    public void clickMenuDataAktif(){
        menuDataAktif.click();
    }
    public void filterByStatusActive(){
        WebElement elementSelectFilter= filter;
        Select filter = new Select(elementSelectFilter);
        filter.selectByIndex(1);
    }
    public void filterByStatusDone(){
        WebElement elementSelectFilter= filter;
        Select filter = new Select(elementSelectFilter);
        filter.selectByIndex(2);
    }
    public void filterByStatusClosed(){
        WebElement elementSelectFilter= filter;
        Select filter = new Select(elementSelectFilter);
        filter.selectByIndex(3);
    }
    public void filterByStatusHold(){
        WebElement elementSelectFilter= filter;
        Select filter = new Select(elementSelectFilter);
        filter.selectByIndex(4);
    }
    public void clickButtonFilter(){
        buttonFilter.click();
    }
    public void clickButtonReset(){
        buttonReset.click();
    }
    public String getTxtFilterByStatus(){
        return filter.getText();
    }
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
    public void searchvalid(String searchValue){
        search.sendKeys(searchValue);
        searchValue = this.searchValue;
    }
    public void clickButtonSearch(){
        buttonSearch.click();
    }
    public void clickButtonRefresh(){
        buttonRefresh.click();
    }
    public String getTxtSearch(){
        return txtSearch.getText();
    }
    public String getSearchValue(){
        return searchValue;
    }
}
