package com.definition;

import com.dikahadir.driver.DriverSingleton;
import com.dikahadir.driver.utils.BrowserType;
import com.dikahadir.pages.AbsenPointPage;
import com.dikahadir.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class ResetAbsenPoint {
    WebDriver driver = DriverSingleton.getDriver(BrowserType.CHROME);
    AbsenPointPage absenPointPage = new AbsenPointPage(driver);
    LoginPage loginPage = new LoginPage(driver);


//    @Before
//    public void adminLogin(){
//        System.out.println("Admin Berhasil Login");
//        driver.get("https://magang.dikahadir.com/authentication/login");
//        loginPage.login("admin@hadir.com", "admin@hadir");
//    }

    @And("Klik Reset Button")
    public void adminKlikResetButton() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikResetButton();
    }

    @Then("Kolom Search Kembali Kosong")
    public void verifyNullSearchKolom() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
     String actualKolomSearch = absenPointPage.setSearchAbsenPoint("");

     Assert.assertTrue(actualKolomSearch.trim().isEmpty());
    }
}
