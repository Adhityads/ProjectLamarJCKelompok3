package com.juaracoding.kelompoktigajc.step_definitions;

import com.juaracoding.kelompoktigajc.pages.EditDataPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestEditData {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private EditDataPage EditDataPage = new EditDataPage();

    public TestEditData() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //TCC.BD.AKSI.EDIT.001 Edit data
    @When("TCC.BD.AKSI.EDIT.001 menekan tombol Requtment Request")
    public void user_menekan_tombol_kembali() {
        EditDataPage.clickBtnRequtmentRequest();
        extentTest.log(LogStatus.PASS, "menekan tombol RequtmentRequest");
    }
    @And("TCC.BD.AKSI.EDIT.001 menekan tombol +")
    public void user_menekan_tombol() {
        EditDataPage.clickBtnPlusMinus();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "menekan tombol + ");
    }
    @And("TCC.BD.AKSI.EDIT.001 menekan tombol edit data")
    public void user_menekan_tombol_editData() {
        EditDataPage.clickBtnEdit();
        extentTest.log(LogStatus.PASS, "menekan tombol edit data");
    }
    @Then("TCC.BD.AKSI.EDIT.001 menampilkan form update")
    public void user_menampilkan_form_update() {
        Assert.assertEquals(EditDataPage.getTxtFormUpdate(), "Form Update");
        extentTest.log(LogStatus.PASS, "menampilkan form update");
    }

    //TCC.BD.AKSI.EDIT.004 tombol expend Jumlah Kebutuhan
    @When("TCC.BD.AKSI.EDIT.004 menekan tombol expend")
    public void user_menekan_tombol_expend_jumalah_kebutuhan_diperbesar() {
        EditDataPage.clickBtnXKebutuhan();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.004 Menampilkan form jumlah kebutuhan diperbesar")
    public void user_menampilkan_form_jumlah_kebutuhan_diperbesar() {
        Assert.assertEquals(EditDataPage.getTxtJumlah(),"Jumlah Kebutuhan");
        extentTest.log(LogStatus.PASS,"Menampilkan form jumlah kebutuhan diperbesar");
    }

    //TCC.BD.AKSI.EDIT.005 tombol expend Jumlah Kebutuhan
    @When("TCC.BD.AKSI.EDIT.005 menekan tombol expend")
    public void user_menekan_tombol_expend_jumlah_kebutuhan_diperkecil() {
        EditDataPage.clickBtnXKebtuhanK();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.005 Menampilkan form jumlah kebutuhan diperkecil")
    public void user_menampilkan_form_jumlah_kebutuhan_diperkecil() {
        Assert.assertEquals(EditDataPage.getTxtJumlah(),"Jumlah Kebutuhan");
        extentTest.log(LogStatus.PASS,"Menampilkan form jumlah kebutuhan diperkecil");
    }

    //TCC.BD.AKSI.EDIT.006 tombol collapse Jumlah Kebutuhan
    @When("TCC.BD.AKSI.EDIT.006 menekan tombol collapse")
    public void user_menekan_tombol_collapse_jumlah_kebutuhan() {
        EditDataPage.clickBtnCJmlhKebutuhan();
        extentTest.log(LogStatus.PASS, "menekan tombol collapse");
    }
    @Then("TCC.BD.AKSI.EDIT.006 Menyembunyikan form jumlah kebutuhan")
    public void user_menyembunyikan_jumlah_kebutuhan() {
        Assert.assertEquals(EditDataPage.getTxtJumlah(),"Jumlah Kebutuhan");
        extentTest.log(LogStatus.PASS,"Menyembunyikan form jumlah kebutuhan");
    }

    //TCC.BD.AKSI.EDIT.014 tombol expend Kebutuhan
    @When("TCC.BD.AKSI.EDIT.014 menekan tombol expend")
    public void user_menekan_tombol_expend_Kebutuhan_besar() {
        EditDataPage.clickBtnKebutuhanB();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.014 Menampilkan form kebutuhan diperbesar")
    public void user_menampilkan_form_kebutuhan_diperbesar() {
        Assert.assertEquals(EditDataPage.getTxtKebutuhan(),"Kebutuhan");
        extentTest.log(LogStatus.PASS,"Menampilkan form kebutuhan diperbesar");
    }

    //TCC.BD.AKSI.EDIT.015 tombol expend Kebutuhan
    @When("TCC.BD.AKSI.EDIT.015 menekan tombol expend")
    public void user_menekan_tombol_expend_kebutuhan_kecil() {
        EditDataPage.clickBtnKebutuhanK();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.015 Menampilkan form kebutuhan diperkecil")
    public void user_menampilkan_form_kebutuhan_diperkecil() {
        Assert.assertEquals(EditDataPage.getTxtKebutuhan(),"Kebutuhan");
        extentTest.log(LogStatus.PASS,"Menampilkan form kebutuhan diperkecil");
    }

    //TCC.BD.AKSI.EDIT.016 tombol collapse Kebutuhan
    @When("TCC.BD.AKSI.EDIT.016 menekan tombol collapse")
    public void user_menekan_tombol_collapse_kebutuhan() {
        EditDataPage.clickBtnKebutuhanC();
        extentTest.log(LogStatus.PASS, "menekan tombol collapse");
    }
    @Then("TCC.BD.AKSI.EDIT.016 Menyembunyikan form kebutuhan")
    public void user_menyembunyikan_kebutuhan() {
        Assert.assertEquals(EditDataPage.getTxtKebutuhan(),"Kebutuhan");
        extentTest.log(LogStatus.PASS,"Menyembunyikan form kebutuhan");
    }

    //TCC.BD.AKSI.EDIT.049 tombol expend Kualifikasi
    @When("TCC.BD.AKSI.EDIT.049 menekan tombol expend")
    public void user_menekan_tombol_expend_Kualifikasi_besar() {
        EditDataPage.clickBtnKualifikasiB();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.049 Menampilkan form kualifikasi diperbesar")
    public void user_menampilkan_form_Kualifikasi_diperbesar() {
        Assert.assertEquals(EditDataPage.getTxtKualifiaksi(),"Kualifikasi");
        extentTest.log(LogStatus.PASS,"Menampilkan form Kualifikasi diperbesar");
    }

    //TCC.BD.AKSI.EDIT.050 tombol expend Kualifikasi
    @When("TCC.BD.AKSI.EDIT.050 menekan tombol expend")
    public void user_menekan_tombol_expend_Kualifikasi_kecil() {
        EditDataPage.clickBtnKualifikasiK();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.050 Menampilkan form kualifikasi diperkecil")
    public void user_menampilkan_form_Kualifikasi_diperkecil() {
        Assert.assertEquals(EditDataPage.getTxtKualifiaksi(),"Kualifikasi");
        extentTest.log(LogStatus.PASS,"Menampilkan form kualifikasi diperkecil");
    }

    //TCC.BD.AKSI.EDIT.051 tombol collapse Kualifikasi
    @When("TCC.BD.AKSI.EDIT.051 menekan tombol collapse")
    public void user_menekan_tombol_collapse_Kualifikasi() {
        EditDataPage.clickBtnKualifikasiC();
        extentTest.log(LogStatus.PASS, "menekan tombol collapse");
    }
    @Then("TCC.BD.AKSI.EDIT.051 Menyembunyikan form kualifikasi")
    public void user_menyembunyikan_kualifikasi() {
        Assert.assertEquals(EditDataPage.getTxtKualifiaksi(),"Kualifikasi");
        extentTest.log(LogStatus.PASS,"Menyembunyikan form Kualifikasi");
    }

    //TCC.BD.AKSI.EDIT.084 tombol expend form
    @When("TCC.BD.AKSI.EDIT.084 menekan tombol expend")
    public void user_menekan_tombol_expend_form_besar() {
        EditDataPage.clickBtnFormB();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.084 Menampilkan form diperbesar")
    public void user_menampilkan_form_diperbesar() {
        Assert.assertEquals(EditDataPage.getTxtForm(),"Form");
        extentTest.log(LogStatus.PASS,"Menampilkan form diperbesar");
    }

    //TCC.BD.AKSI.EDIT.085 tombol expend form
    @When("TCC.BD.AKSI.EDIT.085 menekan tombol expend")
    public void user_menekan_tombol_expend_form_kecil() {
        EditDataPage.clickBtnFormK();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.085 Menampilkan form diperkecil")
    public void user_menampilkan_form_diperkecil() {
        Assert.assertEquals(EditDataPage.getTxtForm(),"Form");
        extentTest.log(LogStatus.PASS,"Menampilkan form diperkecil");
    }

    //TCC.BD.AKSI.EDIT.086 tombol collapse form
    @When("TCC.BD.AKSI.EDIT.086 menekan tombol collapse")
    public void user_menekan_tombol_collapse_form() {
        EditDataPage.clickBtnFormC();
        extentTest.log(LogStatus.PASS, "menekan tombol collapse");
    }
    @Then("TCC.BD.AKSI.EDIT.086 Menyembunyikan form")
    public void user_menyembunyikan_form() {
        Assert.assertEquals(EditDataPage.getTxtForm(),"Form");
        extentTest.log(LogStatus.PASS,"Menyembunyikan form");
    }

    //TCC.BD.AKSI.EDIT.107 tombol expend remunerasi
    @When("TCC.BD.AKSI.EDIT.107 menekan tombol expend")
    public void user_menekan_tombol_expend_remunerasi_besar() {
        EditDataPage.clickBtnRemunerasiB();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.107 Menampilkan form remunerasi diperbesar")
    public void user_menampilkan_form_remunerasi_diperbesar() {
        Assert.assertEquals(EditDataPage.getTxtRemunerasi(),"Remunerasi & Benefits");
        extentTest.log(LogStatus.PASS,"Menampilkan form remunerasi diperbesar");
    }

    //TCC.BD.AKSI.EDIT.108 tombol expend remunerasi
    @When("TCC.BD.AKSI.EDIT.108 menekan tombol expend")
    public void user_menekan_tombol_expend_remunerasi_kecil() {
        EditDataPage.clickBtnRemunerasiK();
        extentTest.log(LogStatus.PASS, "menekan tombol expend");
    }
    @Then("TCC.BD.AKSI.EDIT.108 Menampilkan form remunerasi diperkecil")
    public void user_menampilkan_form_remunerasi_diperkecil() {
        Assert.assertEquals(EditDataPage.getTxtRemunerasi(),"Remunerasi & Benefits");
        extentTest.log(LogStatus.PASS,"Menampilkan form remunerasi diperkecil");
    }

    //TCC.BD.AKSI.EDIT.109 tombol collapse remunerasi
    @When("TCC.BD.AKSI.EDIT.109 menekan tombol collapse")
    public void user_menekan_tombol_collapse_remunerasi() {
        EditDataPage.clickBtnRemunerasiC();
        extentTest.log(LogStatus.PASS, "menekan tombol collapse");
    }
    @Then("TCC.BD.AKSI.EDIT.109  Menyembunyikan form remunerasi")
    public void user_menyembunyikan_form_remunerasi() {
        Assert.assertEquals(EditDataPage.getTxtRemunerasi(),"Remunerasi & Benefits");
        extentTest.log(LogStatus.PASS,"Menyembunyikan form remunerasi");
    }


    //TCC.BD.AKSI.EDIT.003 Tombol Back
    @When("TCC.BD.AKSI.EDIT.003 menekan tombol back")
    public void user_menekan_tombol_back() {
        EditDataPage.clickBtnBack();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "menekan tombol back");
    }
    @Then("TCC.BD.AKSI.EDIT.003 Kembali ke halaman sebelumnya")
    public void user_kembali_halaman_sebelumnya() {
        System.out.println(EditDataPage.getTxtDataPengajuan());
        Assert.assertEquals(EditDataPage.getTxtDataPengajuan(),"Data Pengajuan");
        extentTest.log(LogStatus.PASS,"Kembali ke halaman sebelumnya");
    }

    //TCC.BD.AKSI.EDIT.007 Edit data  jumlah kebutuhan Penempatan Validasi
    @When("TCC.BD.AKSI.EDIT.007 menekan data pengajuan")
    public void user_menekan_tombol_data_pengajuan() {
        EditDataPage.clickBtnTombolDataPengajuan();
        extentTest.log(LogStatus.PASS, "menekan data pengajuan");
    }
    @And("TCC.BD.AKSI.EDIT.007 menekan tombol +")
    public void user_menekan_tombol_kedua() {
        EditDataPage.clickBtnPlusMinus();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "menekan tombol +");
    }
    @And("TCC.BD.AKSI.EDIT.007 menekan edit data")
    public void user_menekan_edit() {
        EditDataPage.clickBtnEdit();
        extentTest.log(LogStatus.PASS,"menekan edit data");
    }
    @Then("TCC.BD.AKSI.EDIT.007 jumlah kebutuhan Penempatan otomatis terisi")
    public void jumlah_kebutuhan_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtPenempatan());
        Hooks.delay(5);
        Assert.assertEquals(EditDataPage.getTxtPenempatan(),"Bandung");
        extentTest.log(LogStatus.PASS,"jumlah kebutuhan Penempatan otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.009 Edit data jumlah kebutuhan Penempatan invalid
    @When("TCC.BD.AKSI.EDIT.009 menekan data penempatan")
    public void user_menekan_tombol_penempatan() {
        EditDataPage.clickBtnPenempatan();
        EditDataPage.InputText("Manado");
        extentTest.log(LogStatus.PASS,"menekan kota manado");
    }
    @Then("TCC.BD.AKSI.EDIT.009 ada tulisan No Result Found")
    public void penempatan_no_result_found() {
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"ada tulisan No Result Found");
    }

    //TCC.BD.AKSI.EDIT.017 Edit data - kebutuhan project name
    @When("TCC.BD.AKSI.EDIT.017 menekan data projek name validasi")
    public void user_menekan_tombol_projek_name() {
        EditDataPage.clickBtnNamaProjek();
        extentTest.log(LogStatus.PASS, "menekan data projek name validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.017 projek name otomatis terisi")
    public void projek_name_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtNamaProjek());
        Assert.assertEquals(EditDataPage.getTxtNamaProjek(),"Sales Agent || HCI");
        extentTest.log(LogStatus.PASS,"projek name otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.018 Edit data - kebutuhan project name ubah
    @When("TCC.BD.AKSI.EDIT.018 menekan data projek name")
    public void user_menekan_tombol_projek_name_ubah() {
        EditDataPage.clickBtnNamaProjek();
        extentTest.log(LogStatus.PASS, "menekan data projek name");
    }
    @Then("TCC.BD.AKSI.EDIT.018 projek name tidak bisa diubah")
    public void projek_name_tidak_bisa_diubah() {
        System.out.println(EditDataPage.getTxtNamaProjek());
        Hooks.delay(5);
        Assert.assertEquals(EditDataPage.getTxtNamaProjek(),"Sales Agent || HCI");
        extentTest.log(LogStatus.PASS,"projek name tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.019 Edit data - kebutuhan client name
    @When("TCC.BD.AKSI.EDIT.019 menekan data client name")
    public void user_menekan_client_name() {
        EditDataPage.clickBtnClientName();
        extentTest.log(LogStatus.PASS, "menekan data client name");
    }
    @Then("TCC.BD.AKSI.EDIT.019 clien name otomatis terisi")
    public void client_name_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtClientName());
        Hooks.delay(5);
        Assert.assertEquals(EditDataPage.getTxtClientName(),"");
        extentTest.log(LogStatus.PASS,"clien name otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.020 Edit data - kebutuhan jenis kerja sama
    @When("TCC.BD.AKSI.EDIT.020 menekan data jenis kerja sama")
    public void user_menekan_jenis_kerja_sama() {
        EditDataPage.clickBtnKerjaSama();
        extentTest.log(LogStatus.PASS, "menekan data jenis kerja sama");
    }
    @Then("TCC.BD.AKSI.EDIT.020 jenis kerja sama otomatis terisi")
    public void jenis_kerja_sama_otomatis_terisi(){
        System.out.println(EditDataPage.getTxtKerjaSama());
        Assert.assertEquals(EditDataPage.getTxtKerjaSama(),"");
        extentTest.log(LogStatus.PASS,"jenis kerja sama otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.025 Edit data - kebutuhan nama posisi
    @When("TCC.BD.AKSI.EDIT.025 menekan data nama posisi validasi")
    public void user_menekan_tombol_nama_posisi() {
        EditDataPage.clickBtnNamaPosisi();
        extentTest.log(LogStatus.PASS, "menekan data nama posisi validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.025 nama posisi otomatis terisi")
    public void nama_posisi_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtNamaPosisi());
        Assert.assertEquals(EditDataPage.getTxtNamaPosisi(),"RSM");
        extentTest.log(LogStatus.PASS,"nama posisi otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.027 Edit data - kebutuhan edit invalid nama posisi
    @When("TCC.BD.AKSI.EDIT.027 masukkan nama posisi invalid")
    public void masukkan_nama_posisi_invalid() {
        EditDataPage.InputText("CEO");
        extentTest.log(LogStatus.PASS,"masukkan nama posisi invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.027 nama posisi otomatis terisi")
    public void nama_posisi_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"nama posisi tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.029 Edit data - kebutuhan status kontrak
    @When("TCC.BD.AKSI.EDIT.029 menekan data status kontrak validasi")
    public void user_menekan_tombol_status_kontrak() {
        EditDataPage.clickBtnStatusKontrak();
        extentTest.log(LogStatus.PASS, "menekan data status kontrak validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.029 status kontrak otomatis terisi")
    public void status_kontrak_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtStatusKontrak());
        Assert.assertEquals(EditDataPage.getTxtStatusKontrak(),"MAGANG");
        extentTest.log(LogStatus.PASS,"status kontrak otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.031 Edit data - kebutuhan edit invalid status kontrak
    @When("TCC.BD.AKSI.EDIT.031 masukkan status kontrak invalid")
    public void masukkan_status_kontrak_invalid() {
        EditDataPage.InputText("Mahasiswa");
        extentTest.log(LogStatus.PASS,"masukkan nama posisi invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.031 status kontrak otomatis terisi")
    public void status_kontrak_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"status kontrak tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.037 Edit data - kebutuhan jam kerja
    @When("TCC.BD.AKSI.EDIT.037 menekan data jam kerja validasi")
    public void user_menekan_tombol_jam_kerja() {
        EditDataPage.clickBtnJamKerja();
        extentTest.log(LogStatus.PASS, "menekan data jam kerja validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.037 jam kerja otomatis terisi")
    public void jam_kerja_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtJamKerja());
        Assert.assertEquals(EditDataPage.getTxtJamKerja(),"Non-Shift");
        extentTest.log(LogStatus.PASS,"jam kerja otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.039 Edit data - kebutuhan edit invalid jam kerja
    @When("TCC.BD.AKSI.EDIT.039 masukkan jam kerja invalid")
    public void masukkan_jam_kerja_invalid() {
        EditDataPage.InputText("lembur");
        extentTest.log(LogStatus.PASS,"masukkan jam kerja invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.039 jam kerja otomatis terisi")
    public void jam_kerja_tidak_bisa_diubah() {
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"jam kerja tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.052 Edit data - kebutuhan gender
    @When("TCC.BD.AKSI.EDIT.052 menekan data gender validasi")
    public void user_menekan_tombol_gender() {
        EditDataPage.clickBtnGender();
        extentTest.log(LogStatus.PASS, "menekan data gender validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.052 gender otomatis terisi")
    public void gender_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtGender());
        Assert.assertEquals(EditDataPage.getTxtGender(),"Any");
        extentTest.log(LogStatus.PASS,"gender otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.054 Edit data - kebutuhan edit invalid gender
    @When("TCC.BD.AKSI.EDIT.054 masukkan gender invalid")
    public void masukkan_gender_invalid() {
        EditDataPage.InputText("Bencong");
        extentTest.log(LogStatus.PASS,"masukkan gender invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.054 gender otomatis terisi")
    public void gender_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"gender tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.056 Edit data - kebutuhan education
    @When("TCC.BD.AKSI.EDIT.056 menekan data education validasi")
    public void user_menekan_tombol_education() {
        EditDataPage.clickBtnEducation();
        extentTest.log(LogStatus.PASS, "menekan data education validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.056 education otomatis terisi")
    public void education_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtEducation());
        Assert.assertEquals(EditDataPage.getTxtEducation(),"SMA");
        extentTest.log(LogStatus.PASS,"education otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.058 Edit data - kebutuhan edit invalid education
    @When("TCC.BD.AKSI.EDIT.058 masukkan education invalid")
    public void masukkan_education_invalid() {
        EditDataPage.InputText("TK");
        extentTest.log(LogStatus.PASS,"masukkan education invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.058 education otomatis terisi")
    public void education_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"education tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.074 Edit data - kebutuhan bahasa inggris
    @When("TCC.BD.AKSI.EDIT.074 menekan data bahasa inggris validasi")
    public void user_menekan_tombol_bahasa_inggris() {
        EditDataPage.clickBtnKBahInggris();
        extentTest.log(LogStatus.PASS, "menekan data bahasa inggris validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.074 bahasa inggris otomatis terisi")
    public void bahasa_inggris_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtKBahInggris());
        Assert.assertEquals(EditDataPage.getTxtKBahInggris(),"Basic");
        extentTest.log(LogStatus.PASS,"bahasa inggris otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.076 Edit data - kebutuhan edit invalid bahasa inggris
    @When("TCC.BD.AKSI.EDIT.076 masukkan bahasa inggris invalid")
    public void masukkan_bahasa_inggris_invalid() {
        EditDataPage.InputText("Bagus");
        extentTest.log(LogStatus.PASS,"masukkan bahasa inggris invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.076 bahasa inggris otomatis terisi")
    public void bahasa_inggris_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"bahasa inggris tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.087 Edit data - kebutuhan Divisi
    @When("TCC.BD.AKSI.EDIT.087 menekan divisi validasi")
    public void user_menekan_tombol_divisi() {
        EditDataPage.clickBtnDivisi();
        extentTest.log(LogStatus.PASS, "menekan data divisi validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.087 divisi otomatis terisi")
    public void divisi_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtDivisi());
        Assert.assertEquals(EditDataPage.getTxtDivisi(),"Operational");
        extentTest.log(LogStatus.PASS,"divisi otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.089 Edit data - kebutuhan edit invalid divisi
    @When("TCC.BD.AKSI.EDIT.089 masukkan divisi invalid")
    public void masukkan_divisi_invalid() {
        EditDataPage.InputText("Pembantu");
        extentTest.log(LogStatus.PASS,"masukkan divisi invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.089 divisi otomatis terisi")
    public void divisi_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"divisi tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.091 Edit data - kebutuhan department
    @When("TCC.BD.AKSI.EDIT.091 menekan department validasi")
    public void user_menekan_tombol_department() {
        EditDataPage.clickBtnDepart();
        extentTest.log(LogStatus.PASS, "menekan data department validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.091 department otomatis terisi")
    public void department_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtDepart());
        Assert.assertEquals(EditDataPage.getTxtDepart(),"General Affair");
        extentTest.log(LogStatus.PASS,"department otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.093 Edit data - kebutuhan edit invalid department
    @When("TCC.BD.AKSI.EDIT.093 masukkan department invalid")
    public void masukkan_department_invalid() {
        EditDataPage.InputText("Satu pintu");
        extentTest.log(LogStatus.PASS,"masukkan department invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.093 department otomatis terisi")
    public void department_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"department tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.095 Edit data - kebutuhan unit
    @When("TCC.BD.AKSI.EDIT.095 menekan unit validasi")
    public void user_menekan_tombol_unit() {
        EditDataPage.clickBtnUnit();
        extentTest.log(LogStatus.PASS, "menekan data unit validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.095 unit otomatis terisi")
    public void unit_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtUnit());
        Assert.assertEquals(EditDataPage.getTxtUnit(),"Personal Loan");
        extentTest.log(LogStatus.PASS,"unit otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.097 Edit data - kebutuhan edit invalid unit
    @When("TCC.BD.AKSI.EDIT.097 masukkan unit invalid")
    public void masukkan_unit_invalid() {
        EditDataPage.InputText("lima");
        extentTest.log(LogStatus.PASS,"masukkan unit invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.097 unit otomatis terisi")
    public void unit_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"unit tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.099 Edit data - Edit data - kebutuhan Level
    @When("TCC.BD.AKSI.EDIT.099 menekan level validasi")
    public void user_menekan_tombol_Level() {
        EditDataPage.clickBtnLevel();
        extentTest.log(LogStatus.PASS, "menekan data Level validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.099 level otomatis terisi")
    public void Level_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtLevel());
        Assert.assertEquals(EditDataPage.getTxtLevel(),"Mobile Sales");
        extentTest.log(LogStatus.PASS,"Level otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.101 Edit data - kebutuhan edit invalid level
    @When("TCC.BD.AKSI.EDIT.101 masukkan level invalid")
    public void masukkan_Level_invalid() {
        EditDataPage.InputText("rendah");
        extentTest.log(LogStatus.PASS,"masukkan Level invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.101 level otomatis terisi")
    public void Level_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"Level tidak bisa diubah");
    }

    //TCC.BD.AKSI.EDIT.103 Edit data - Edit data - kebutuhan upliner
    @When("TCC.BD.AKSI.EDIT.103 menekan upliner validasi")
    public void user_menekan_tombol_upliner() {
        EditDataPage.clickBtnUpliner();
        extentTest.log(LogStatus.PASS, "menekan data upliner validasi");
    }
    @Then("TCC.BD.AKSI.EDIT.103 upliner otomatis terisi")
    public void upliner_otomatis_terisi() {
        System.out.println(EditDataPage.getTxtUpliner());
        Assert.assertEquals(EditDataPage.getTxtUpliner(),"D6170473-ACHMAD FAIZAL");
        extentTest.log(LogStatus.PASS,"upliner otomatis terisi");
    }

    //TCC.BD.AKSI.EDIT.105 Edit data - kebutuhan edit invalid upliner
    @When("TCC.BD.AKSI.EDIT.105 masukkan upliner invalid")
    public void masukkan_upliner_invalid() {
        EditDataPage.InputText("Jessy Dimpudus");
        extentTest.log(LogStatus.PASS,"masukkan upliner invalid");
    }
    @Then("TCC.BD.AKSI.EDIT.105 upliner otomatis terisi")
    public void upliner_tidak_bisa_diubah() {
        Hooks.delay(5);
        System.out.println(EditDataPage.getTxtNotFound());
        Assert.assertEquals(EditDataPage.getTxtNotFound(),"No results found");
        extentTest.log(LogStatus.PASS,"upliner tidak bisa diubah");
    }
}