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

    @FindBy(xpath = "//*[@id=\"dataTable-setup\"]/tbody/tr[4]/td[8]/center/div/a[3]")
    WebElement iconReturn;
    @FindBy(xpath = "//*[@id=\"Modal_Return\"]/div/div/div/h5")
    WebElement txtFormReturn;
    @FindBy(xpath = "//*[@id=\"batal\"]")
    WebElement buttonBatalFormReturn;
    @FindBy(xpath = "//*[@id=\"Modal_Return\"]/div/div/form/div[2]/button[1]")
    WebElement buttonUpdateFormReturn;
    @FindBy(xpath = "//*[@id=\"note\"]")
    WebElement txtNoteReturn;
    @FindBy(xpath = "//*[@id=\"alert\"]")
    WebElement txtSuccess;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div")
    WebElement txtJumlahKebutuhanExpand;



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

    public void clickIconReturn(){
        iconReturn.click();
    }
    public String getTxtFormReturn(){
        return txtFormReturn.getText();
    }
    public void clickButtonBatalFormReturn(){
        buttonBatalFormReturn.click();
    }
    public void clickButtonUpdateFromReturn(){
        buttonUpdateFormReturn.click();
    }
    public void setTxtNoteReturn(String note){
        txtNoteReturn.sendKeys(note);
    }
    public String getTxtSuccess(){
        return txtSuccess.getText();
    }
    public String getTxtJumlahKebutuhanExpand(){
        return txtJumlahKebutuhanExpand.getAttribute("panel-expand");
    }

}
