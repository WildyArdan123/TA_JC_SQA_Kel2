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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchAbsenPoint {
    WebDriver driver = DriverSingleton.getDriver(BrowserType.CHROME);
    AbsenPointPage absenPointPage = new AbsenPointPage(driver);
    LoginPage loginPage = new LoginPage(driver);


//    @BeforeTest
//    public void adminLogin(){
//        System.out.println("Admin Berhasil Login");
//        driver.get("https://magang.dikahadir.com/authentication/login");
//        loginPage.login("admin@hadir.com", "admin@hadir");
//    }

//    @Given("Admin Sudah Berhasil Login")
//    public void adminInDashboard(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        String expected = "Validator 1";
//        String actual = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[2]/div/div/h2")).getText();
//
//        Assert.assertEquals(actual,expected);
//    }

//    @And("Klik Menu Management")
//    public void goToMenuManagement(){
//        absenPointPage.klikManagementMenu();
//    }

//    @And("Klik Menu Absen Point")
//    public void goToMenuAbsenPoint(){
//        absenPointPage.klikAbsenPointMenu();
//    }

    @When("Masukan {string} Pada Kolom Search")
    public void inputSearchAbsenPoint(String nama) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.setSearchAbsenPoint(nama);
    }

    @And("Klik Search Button")
    public void klikSearchButton() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        absenPointPage.klikSearchAbsenPoint();
    }

    @Then("{string} Berhasil di tampilkan")
    public void verifySeachAbsenPoint(String expectedDataSearch) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        String actualDataAdd = absenPointPage.verifyElementSearch();

        Assert.assertEquals(actualDataAdd,expectedDataSearch);
    }

//    @AfterTest
//    public void closeDriver(){
//        driver.quit();
//    }
}
