package com.definition;

import com.dikahadir.driver.DriverSingleton;
import com.dikahadir.driver.utils.BrowserType;
import com.dikahadir.pages.AbsenPointPage;
import com.dikahadir.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class NegativeAddLocationPoint {
    WebDriver driver = DriverSingleton.getDriver(BrowserType.CHROME);
    AbsenPointPage absenPointPage = new AbsenPointPage(driver);
    LoginPage loginPage = new LoginPage(driver);


//    @Before
//    public void adminLogin(){
//        System.out.println("Admin Berhasil Login");
//        driver.get("https://magang.dikahadir.com/authentication/login");
//        loginPage.login("admin@hadir.com", "admin@hadir");
//    }

    @Then("Berhasil Menampilkan {string}")
    public void verifyInvalidAddAbsenPoint(String expectedValidationMessage) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        WebElement ele = driver.findElement(By.id("name"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
                String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;", ele);

        Assert.assertEquals(validationMessage,expectedValidationMessage);

        WebElement batalButton = driver.findElement(By.xpath("(//button[@type='button'])[22]"));
        batalButton.click();

    }
}
