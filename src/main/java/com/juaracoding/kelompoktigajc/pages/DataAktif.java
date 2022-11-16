package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
    WebElement txtTable;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[1]/td[1]")
    WebElement buttonPlus;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[2]/td/ul/li/span[1]")
    WebElement txtAksi;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[2]/td/ul/li/span[2]/a[1]")
    WebElement iconViewDataBd;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[2]/td/ul/li/span[2]/a[2]")
    WebElement iconDownloadDataBd;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[2]/td/ul/li/span[2]/a[3]")
    WebElement iconUpdateStatusBd;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[2]/td/ul/li/span[2]/a[4]")
    WebElement iconRepeatDataBd;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[2]/td/ul/li/span[2]/a[5]")
    WebElement iconPosterBd;

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

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a[2]")
    WebElement buttonBackViewData;

    @FindBy(xpath = "//*[@id=\"Modal_Edit\"]/div/div")
    WebElement txtUpdateStatus;

    @FindBy(xpath = "//*[@id=\"Modal_Edit\"]/div/div/form/div[2]/button[1]")
    WebElement buttonUpdateStatusUpdate;

    @FindBy(xpath = "//*[@id=\"batal\"]")
    WebElement buttonUpdateStatusBatal;

    @FindBy(xpath = "//*[@id=\"status\"]")
    WebElement updateStatusStatus;

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
    public void searchInput(String searchValue){
        search.sendKeys(searchValue);
    }
    public void clickButtonSearch(){
        buttonSearch.click();
    }
    public void clickButtonRefresh(){
        buttonRefresh.click();
    }
    public String getTxtTable(){
        return txtTable.getText();
    }
    public int getTxtTableRow(){
        List<WebElement> rows = txtTable.findElements(By.tagName("tr"));
        int row = rows.size();
        return row;
    }
    public void clickButtonPlus(){
        buttonPlus.click();
    }
    public String getTxtAksi(){
        return txtAksi.getText();
    }
    public int getIntAksi(){
        List<WebElement> intAksi = txtAksi.findElements(By.tagName("span"));
        int i = intAksi.size();
        return i;
    }

    public void clickIconViewDataBd(){
        iconViewDataBd.click();
    }
    public void clickIconDownloadDataBd(){
        iconDownloadDataBd.click();
    }
    public void clickIconUpdateStatusBd(){
        iconUpdateStatusBd.click();
    }
    public void clickIconRepeatDataBd(){
        iconRepeatDataBd.click();
    }
    public void clickIconPosterBd(){
        iconPosterBd.click();
    }
    public void clickButtonBackViewData(){
        buttonBackViewData.click();
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
    public String getTxtUpdateStatus(){
        return txtUpdateStatus.getText();
    }
    public void clickButtonUpdateStatusUpdate(){
        buttonUpdateStatusUpdate.click();
    }
    public void clickButtonUpdateStatusBatal(){
        buttonUpdateStatusBatal.click();
    }
    public void updateStatusStatus(){
        WebElement elementSelectStatus = updateStatusStatus;
        Select status = new Select(elementSelectStatus);
        status.selectByIndex(0);
    }
    public String getTxtStatus(){
        return updateStatusStatus.getAttribute("required");
    }
}