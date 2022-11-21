package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.logging.XMLFormatter;

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
    @FindBy(xpath = "//*[@id=\"content\"]/h1/a")
    WebElement btnTambah;
    @FindBy(xpath = "//*[@id=\"add_form_kebutuhan\"]/div/div[1]/div/select")
    WebElement penempatan;
    @FindBy(xpath = "//*[@id=\"add_form_kebutuhan\"]/div/div[2]/div/input")
    WebElement jumlahKebutuhan;
    @FindBy(xpath = "//*[@id=\"select2-Project_Name-container\"]")
    WebElement projectName;
    @FindBy(xpath = "//*[@id=\"Active_Date\"]")
    WebElement tanggalAktif;
    @FindBy(xpath = "//*[@id=\"Expired_Date\"]")
    WebElement tanggalBerakhir;
    @FindBy(xpath = "//*[@id=\"select2-Position_Name-container\"]")
    WebElement namaPosisi;
    @FindBy(xpath = "//*[@id=\"select2-Contract_Status-container\"]")
    WebElement statusKontrak;
    @FindBy(xpath = "//*[@id=\"Working_Days\"]")
    WebElement hariKerja;
    @FindBy(xpath = "//*[@id=\"select2-Working_Hours-container\"]")
    WebElement jamKerja;
    @FindBy(xpath = "//*[@id=\"Job_Description\"]")
    WebElement jobDesc;
    @FindBy(xpath = "//*[@id=\"file\"]")
    WebElement chooseFile;
    @FindBy(xpath = "//*[@id=\"select2-Gender-container\"]")
    WebElement gender;
    @FindBy(xpath = "//*[@id=\"select2-Education-container\"]")
    WebElement education;
    @FindBy(xpath = "//*[@id=\"Min_Age\"]")
    WebElement usiaMin;
    @FindBy(xpath = "//*[@id=\"Max_Age\"]")
    WebElement usiaMax;
    @FindBy(xpath = "//*[@id=\"Appearances\"]")
    WebElement penampilan;
    @FindBy(xpath = "//*[@id=\"Experiences\"]")
    WebElement pengalaman;
    @FindBy(xpath = "//*[@id=\"select2-English_Skills-container\"]")
    WebElement english;
    @FindBy(xpath = "//*[@id=\"Others_Ability\"]")
    WebElement komputer;
    @FindBy(xpath = "//*[@id=\"Others_Qualifications\"]")
    WebElement lainnya;
    @FindBy(xpath = "//*[@id=\"select2-Division-container\"]")
    WebElement divisi;
    @FindBy(xpath = "//*[@id=\"select2-Departement-container\"]")
    WebElement department;
    @FindBy(xpath = "//*[@id=\"select2-Unit-container\"]")
    WebElement unit;
    @FindBy(xpath = "//*[@id=\"select2-Unit-container\"]")
    WebElement level;
    @FindBy(xpath = "//*[@id=\"select2-Upliner-container\"]")
    WebElement upliner;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/div[4]/div/div/div[2]/div[1]/div[2]/input")
    WebElement btnAdd;
    @FindBy(xpath = "//*[@id=\"note2\"]")
    WebElement nominal;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/button")
    WebElement btnSubmitForm;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/a")
    WebElement btnBackForm;




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
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/div[1]/div")
    WebElement txtJumlahKebutuhan;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/div[2]/div[1]")
    WebElement txtKebutuhan;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/div[2]/div[2]")
    WebElement txtKualfikasi;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/div[3]/div")
    WebElement txtForm;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/div[4]/div")
    WebElement txtRemunerasi;


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
    public void clickResetSearch(){
        btnResetSearch.click();
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
    public void clickBtnTambah(){
        btnTambah.click();
    }
    public void setPenempatan() {
        WebElement elementSelectPenempatan = penempatan;
        Select penempatan = new Select(elementSelectPenempatan);
        penempatan.selectByIndex(3);
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
    public String getTxtJumlahKebutuhan(){
        return txtJumlahKebutuhan.getText();
    }
    public String getTxtKebutuhan(){
        return txtKebutuhan.getText();
    }
    public String getTxtKualifikasi(){
        return txtKualfikasi.getText();
    }
    public String getTxtForm(){
        return txtForm.getText();
    }
    public String getTxtRemunerasi(){
        return txtRemunerasi.getText();
    }



}
