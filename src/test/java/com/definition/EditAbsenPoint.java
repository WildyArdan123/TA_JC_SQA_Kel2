package com.definition;

import com.dikahadir.driver.DriverSingleton;
import com.dikahadir.driver.utils.BrowserType;
import com.dikahadir.pages.AbsenPointPage;
import com.dikahadir.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class EditAbsenPoint {
    WebDriver driver = DriverSingleton.getDriver(BrowserType.CHROME);
    AbsenPointPage absenPointPage = new AbsenPointPage(driver);
    LoginPage loginPage = new LoginPage(driver);


//    @Before
//    public void adminLogin(){
//        System.out.println("Admin Berhasil Login");
//        driver.get("https://magang.dikahadir.com/authentication/login");
//        loginPage.login("admin@hadir.com", "admin@hadir");
//    }

    @And("Klik Button Titik Tiga")
    public void klikButtonTitikTiga() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikTitikTiga();
    }

    @And("Klik Edit")
    public void klikEditElement() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikEditelement();
    }

    @And("Masukan Nama Baru")
    public void inputNamaBaru() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.inputNama("1");
    }

    @And("Klik Button Simpan")
    public void klikButtonSimpan() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikSimpanButton();
    }

    @Then("Berhasil Menampilkan Data Baru {string}")
    public void verifyEditData(String expectedNewData) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        String actualDataAdd = absenPointPage.verifyNameEdit();

        Assert.assertEquals(actualDataAdd,expectedNewData);
    }
}
