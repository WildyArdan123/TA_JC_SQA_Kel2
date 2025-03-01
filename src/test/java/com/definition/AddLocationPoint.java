package com.definition;

import com.dikahadir.driver.DriverSingleton;
import com.dikahadir.driver.utils.BrowserType;
import com.dikahadir.pages.AbsenPointPage;
import com.dikahadir.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AddLocationPoint {
    WebDriver driver = DriverSingleton.getDriver(BrowserType.CHROME);
    AbsenPointPage absenPointPage = new AbsenPointPage(driver);
    LoginPage loginPage = new LoginPage(driver);


    @Before
    public void adminLogin(){
        System.out.println("Admin Berhasil Login");
        driver.get("https://magang.dikahadir.com/authentication/login");
        loginPage.login("admin@hadir.com", "admin@hadir");
    }

    @Given("Admin Sudah Berhasil Login")
    public void adminInDashboard(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String expected = "Validator 1";
        String actual = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[2]/div/div/h2")).getText();

        Assert.assertEquals(actual,expected);
    }

    @And("Klik Menu Management")
    public void goToMenuManagement() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikManagementMenu();
    }

    @And("Klik Menu Absen Point")
    public void goToMenuAbsenPoint() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikAbsenPointMenu();
    }

    @And("Klik Tambahkan")
    public void klikTambahkan() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikTambahkanAbsenPointButton();
    }

    @When("Masukan Nama")
    public void mamsukanNama() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.inputNama("TestLocation1");
    }
    @And("Masukan Latitude")
    public void masukanLatitude() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.inputLatitude("111");
    }

    @And("Masukan Longtitude")
    public void masukanLongtitude() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.inputLongtitude("2221");
    }

    @And("Masukan Maksimal Radius")
    public void masukanRadius() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.inputMaxRadius("100");
    }

    @And("Masukan Description")
    public void masukanDesc() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.inputDescription("Test Desc");
    }

    @And("Klik Button Tambah")
    public void klikTambahAbsenPoint() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikTambah();
    }

    @And("Search Data Yang Baru di Tambahkan")
    public void searchNewDataAbsenPoint() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.setSearchAbsenPoint("TestLocation1");
    }

    @And("Klik Button Search")
    public void klikSearchAbsenPoint() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikSearchAbsenPoint();
    }

    @Then("Menampilkan {string} Yang Baru di Tambahkan")
    public void verifyDataAddAbsenPoint(String expectedDataAdd) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        String actualDataAdd = absenPointPage.verifyElementSearch();

        Assert.assertEquals(actualDataAdd,expectedDataAdd);
    }
//    @After
//    public void closeDriver(){
//        driver.quit();
//    }
}
