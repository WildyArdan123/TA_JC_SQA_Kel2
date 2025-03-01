package com.definition;

import com.dikahadir.driver.DriverSingleton;
import com.dikahadir.driver.utils.BrowserType;
import com.dikahadir.pages.AbsenPointPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DeleteAbsenPoint {
    WebDriver driver = DriverSingleton.getDriver(BrowserType.CHROME);
    AbsenPointPage absenPointPage = new AbsenPointPage(driver);

    @And("Klik Delete")
    public void deleteDataAbsenPoint() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        WebElement deleteButton = driver.findElement(By.xpath("//div[@id='card-actions-menu']/div[3]/ul/li[2]"));
        deleteButton.click();
    }

    @And("Klik Button Ya")
    public void klikYaOnDeleteDataAbsenPoint() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        WebElement yaDeleteButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        yaDeleteButton.click();
    }

    @Then("Data Sudah Tidak di Temukan")
    public String validasiDataTidakDiTemukan() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        String expectedRowAbsenPoint = "0-0 of 0";
        String actualRowAbsenPoint = absenPointPage.verifyRowAbsenPoint();

        Assert.assertEquals(actualRowAbsenPoint, expectedRowAbsenPoint);
        return expectedRowAbsenPoint;
    }
}
