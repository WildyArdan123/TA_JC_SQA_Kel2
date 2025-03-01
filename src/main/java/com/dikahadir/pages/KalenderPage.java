package com.dikahadir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KalenderPage {
    WebDriver driver;

    @FindBy(xpath = "//p[normalize-space()='Management']")
    WebElement managementMenu;
    @FindBy(xpath = "//p[normalize-space()='Kalender']")
    WebElement kalenderMenu;
    @FindBy(xpath = "//input[@id='name']")
    WebElement inputNamaKalender;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement buttonTambahKalender;
    @FindBy(xpath = "(//button[@type='button'])[5]")
    WebElement buttonTambahkanKalender;
    @FindBy(xpath = "//input[@id='search']")
    WebElement inputSearchKalender;
    @FindBy(xpath = "//h6[normalize-space()='Cuti Bersama']")
    WebElement validationNameKalender;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    WebElement buttonResetKalender;


    public KalenderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
