package com.juaracoding.kelompoktigajc.pages;

import com.juaracoding.kelompoktigajc.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HalamanPengajuanPage {
    private WebDriver driver;

    public HalamanPengajuanPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    // Button
    @FindBy(xpath = "//a[normalize-space()='2']")
    WebElement btnDituju;
    @FindBy(xpath = "//a[normalize-space()='Previous']")
    WebElement btnPrevious;
    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement btnNext;



    //text
    @FindBy(xpath = "//td[normalize-space()='11']")
    WebElement txtHalamanTerakhir;
    @FindBy(xpath = "//td[normalize-space()='1']")
    WebElement txtHalamanPertama;

    //Menu
    public void clickBtnDituju() { btnDituju.click();
    }
    public void clickBtnPrevious() { btnPrevious.click();
    }
    public void clickBtnNext() { btnNext.click();
    }


    //Validasi
    public String getTxtHalamanTerakhir(){
        return txtHalamanTerakhir.getText();
    }
    public String getTxtHalamanPertama(){
        return txtHalamanPertama.getText();
    }
}

