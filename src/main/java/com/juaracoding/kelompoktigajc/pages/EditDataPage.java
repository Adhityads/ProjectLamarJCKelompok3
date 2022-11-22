package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditDataPage {
        private WebDriver driver;

        public EditDataPage() {
            this.driver = DriverSingleton.getDriver();
            PageFactory.initElements(driver, this);
        }
        // Button
        @FindBy(xpath = "//tr[@class='odd']//td[contains(text(),'1')]")
        WebElement btnPlusMines;
        @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[6]/a")
        WebElement btnRequtmentRequest;
        @FindBy(xpath = " //span[@class='dtr-data']//span[@class='fas fa-edit']")
        WebElement btnEdit;
        @FindBy(xpath = "//span[@class='dtr-data']//a[@title='Edit Data']")
        WebElement btnEdit2;
        @FindBy(xpath = "//a[@class='btn btn-danger pull-right']")
        WebElement btnBack;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-light mt-3']//i[@class='fa fa-expand']")
        WebElement btnXKebutuhan;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-light mt-3 panel-expand']//i[@class='fa fa-expand']")
        WebElement btnJmlKKecil;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-light mt-3']//i[@class='fa fa-minus']")
        WebElement btnCJmlhKebutuhan;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-success mt-3']//i[@class='fa fa-expand']")
        WebElement btnKebutuhanB;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-success mt-3 panel-expand']//i[@class='fa fa-expand']")
        WebElement btnKebutuhanK;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-success mt-3']//i[@class='fa fa-minus']")
        WebElement btnKebutuhanC;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-danger mt-3']//a[@class='btn btn-xs btn-icon btn-circle btn-default']")
        WebElement btnKualifikasiB;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-danger mt-3 panel-expand']//i[@class='fa fa-expand']")
        WebElement btnKualifikasiK;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-danger mt-3']//i[@class='fa fa-minus']")
        WebElement btnKualifikasiC;
        @FindBy(xpath = "//div[@class='panel panel-secondary mt-3']//i[@class='fa fa-expand']")
        WebElement btnFormB;
        @FindBy(xpath = "//div[@class='panel panel-secondary mt-3 panel-expand']//i[@class='fa fa-expand']")
        WebElement btnFormK;
        @FindBy(xpath = "//div[@class='panel panel-secondary mt-3']//i[@class='fa fa-minus']")
        WebElement btnFormC;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-warning mt-3']//i[@class='fa fa-expand']")
        WebElement btnRemunerasiB;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-warning mt-3 panel-expand']//i[@class='fa fa-expand']")
        WebElement btnRemunerasiK;
        @FindBy(xpath = "//div[@class='panel panel-inverse panel-warning mt-3']//i[@class='fa fa-minus']")
        WebElement btnRemunerasiC;
        @FindBy(xpath = "//span[@class='d-sm-block d-none'][normalize-space()='Data Pengajuan']")
        WebElement btnTombolDataPengajuan;
        @FindBy(xpath = "//span[@id='select2-Project_Name-container']")
        WebElement btnNamaProjek;
        @FindBy(xpath = "//input[@id='Client_Name']")
        WebElement btnClientName;
        @FindBy(xpath = "//input[@id='Project_Type']")
        WebElement btnKerjaSama;
        @FindBy(xpath = "//span[@id='select2-Position_Name-container']")
        WebElement btnNamaPosisi;
        @FindBy(xpath = "//span[@id='select2-Contract_Status-container']")
        WebElement btnStatusKontrak;
        @FindBy(xpath = "//span[@id='select2-Working_Hours-container']")
        WebElement btnJamKerja;
        @FindBy(xpath = "//span[@id='select2-Gender-container']")
        WebElement btnGender;
        @FindBy(xpath = "//span[@id='select2-English_Skills-container']")
        WebElement btnKBahInggris;
        @FindBy(xpath = "//span[@id='select2-Education-container']")
        WebElement btnEducation;
        @FindBy(xpath = "//span[@id='select2-Division-container']")
        WebElement btnDivisi;
        @FindBy(xpath = "//span[@id='select2-Departement-container']")
        WebElement btnDepart;
        @FindBy(xpath = "//span[@id='select2-Unit-container']")
        WebElement btnUnit;
        @FindBy(xpath = "//span[@id='select2-Level-container']")
        WebElement btnLevel;
        @FindBy(xpath = "//span[@id='select2-Upliner-container']")
        WebElement btnUpliner;


        //text
        @FindBy(xpath = "//h3[normalize-space()='Form Update']")
        WebElement txtFormUpdate;
        @FindBy(xpath = "//span[@class='d-sm-block d-none'][normalize-space()='Data Pengajuan']")
        WebElement txtDataPengajuan;
        @FindBy(xpath = "//h4[normalize-space()='Jumlah Kebutuhan']")
        WebElement txtJumlah;
        @FindBy(xpath = "//h4[normalize-space()='Kebutuhan']")
        WebElement txtKebutuhan;
        @FindBy(xpath = " //h4[normalize-space()='Kualifikasi']")
        WebElement txtKualifikasi;
        @FindBy(xpath = "//h4[normalize-space()='Form']")
        WebElement txtForm;
        @FindBy(xpath = "//h4[normalize-space()='Remunerasi & Benefits']")
        WebElement txtRemunerasi;
        @FindBy(xpath = "//span[@id='select2-Project_Name-container']")
        WebElement txtNamaProjek;
        @FindBy(xpath = "//input[@id='Client_Name']")
        WebElement txtClientName;
        @FindBy(xpath = "//input[@id='Project_Type']")
        WebElement txtKerjaSama;
        @FindBy(xpath = "//span[@id='select2-Position_Name-container']")
         WebElement txtNamaPosisi;
        @FindBy(xpath = "//span[@id='select2-Contract_Status-container']")
        WebElement txtStatusKontrak;
        @FindBy(xpath = "//span[@id='select2-Working_Hours-container']")
        WebElement txtJamKerja;
        @FindBy(xpath = "//span[@id='select2-Gender-container']")
        WebElement txtGender;
        @FindBy(xpath = "//span[@id='select2-English_Skills-container']")
        WebElement txtKBahInggris;
        @FindBy(xpath = "//span[@id='select2-Education-container']")
        WebElement txtEducation;
        @FindBy(xpath = "//span[@id='select2-Division-container']")
        WebElement txtDivisi;
        @FindBy(xpath = "//span[@id='select2-Departement-container']")
        WebElement txtDepart;
        @FindBy(xpath = "//span[@id='select2-Unit-container']")
        WebElement txtUnit;
        @FindBy(xpath = "//span[@id='select2-Level-container']")
        WebElement txtLevel;
        @FindBy(xpath = "//span[@id='select2-Upliner-container']")
        WebElement txtUpliner;

        //Input
        @FindBy( xpath = "//input[@role='textbox']")
        WebElement InputText;

        @FindBy( xpath = "//*[@id=\"add_form_kebutuhan\"]/div/div[1]/div/span")
        WebElement BtnPenempatan;

        @FindBy( xpath = "//*[@id=\"add_form_kebutuhan\"]/div/div[1]/div/span")
        WebElement txtPenempatan;
        @FindBy( xpath = "//li[@role='treeitem']")
        WebElement txtNotFound;


        //Menu
        public void clickBtnPlusMinus() { btnPlusMines.click();
        }
        public void clickBtnRequtmentRequest() { btnRequtmentRequest.click();
        }
        public void clickBtnEdit() { btnEdit.click();
        }
        public void clickBtnBack() { btnBack.click();
        }
        public void clickBtnXKebutuhan() { btnXKebutuhan.click();
        }
        public void clickBtnXKebtuhanK() { btnJmlKKecil.click();
        }
        public void clickBtnCJmlhKebutuhan() { btnCJmlhKebutuhan.click();
        }
        public void clickBtnKebutuhanB() { btnKebutuhanB.click();
        }
        public void clickBtnKebutuhanK() { btnKebutuhanK.click();
        }
        public void clickBtnKebutuhanC() { btnKebutuhanC.click();
        }
        public void clickBtnKualifikasiB() { btnKualifikasiB.click();
        }
        public void clickBtnKualifikasiK() { btnKualifikasiK.click();
        }
        public void clickBtnKualifikasiC() { btnKualifikasiC.click();
        }
        public void clickBtnFormB() { btnFormB.click();
        }
        public void clickBtnFormK() { btnFormK.click();
        }
        public void clickBtnFormC() { btnFormC.click();
        }
        public void clickBtnRemunerasiB() { btnRemunerasiB.click();
        }
        public void clickBtnRemunerasiK() { btnRemunerasiK.click();
        }
        public void clickBtnRemunerasiC() { btnRemunerasiC.click();
        }
        public void clickBtnTombolDataPengajuan() { btnTombolDataPengajuan.click();
        }
        public void InputText (String textMasuk) {
                this.InputText.click();
                this.InputText.sendKeys(textMasuk);
        }
        public void clickBtnPenempatan() { BtnPenempatan.click();
        }
        public void clickBtnNamaProjek() { btnNamaProjek.click();
        }
        public void clickBtnClientName() { btnClientName.click();
        }
        public void clickBtnKerjaSama() { btnKerjaSama.click();
        }
        public void clickBtnNamaPosisi() { btnNamaPosisi.click();
        }
        public void clickBtnStatusKontrak() { btnStatusKontrak.click();
        }
        public void clickBtnJamKerja() { btnJamKerja.click();
        }
        public void clickBtnGender() { btnGender.click();
        }
        public void clickBtnEducation() { btnEducation.click();
        }
        public void clickBtnKBahInggris() { btnKBahInggris.click();
        }
        public void clickBtnDivisi() { btnDivisi.click();
        }
        public void clickBtnDepart() { btnDepart.click();
        }
        public void clickBtnUnit() { btnUnit.click();
        }
        public void clickBtnLevel() { btnLevel.click();
        }
        public void clickBtnUpliner() { btnUpliner.click();
        }

        //Validasi
        public String getTxtFormUpdate(){
            return txtFormUpdate.getText();
        }
        public String getTxtJumlah(){
            return txtJumlah.getText();
        }
        public String getTxtKebutuhan(){
            return txtKebutuhan.getText();
        }
        public String getTxtKualifiaksi(){
            return txtKualifikasi.getText();
        }
        public String getTxtForm(){
            return txtForm.getText();
        }
        public String getTxtDataPengajuan(){
            return txtDataPengajuan.getText();
        }
        public String getTxtRemunerasi(){
            return txtRemunerasi.getText();
        }
        public String getTxtPenempatan() {
                return txtPenempatan.getText();
        }
        public String getTxtNotFound() {
                return txtNotFound.getText();
        }
        public String getTxtNamaProjek() {
                return txtNamaProjek.getText();
        }
        public String getTxtClientName() {
                return txtClientName.getText();
        }
        public String getTxtKerjaSama() {
                return txtKerjaSama.getText();
        }
        public String getTxtNamaPosisi() {
        return txtNamaPosisi.getText();
    }
        public String getTxtStatusKontrak() {
        return txtStatusKontrak.getText();
    }
        public String getTxtJamKerja() {
        return txtJamKerja.getText();
    }
        public String getTxtGender() {
        return txtGender.getText();
    }
        public String getTxtEducation() {
        return txtEducation.getText();
    }
        public String getTxtKBahInggris() {
        return txtKBahInggris.getText();
    }
        public String getTxtDivisi() {
        return txtDivisi.getText();
    }
        public String getTxtDepart() {
        return txtDepart.getText();
    }
        public String getTxtUnit() {
        return txtUnit.getText();
    }
    public String getTxtLevel() {
        return txtLevel.getText();
    }
    public String getTxtUpliner() {
        return txtUpliner.getText();
    }
    }
