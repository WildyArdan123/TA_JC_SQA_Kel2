package com.dikahadir.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenPointPage {
    WebDriver driver;

    @FindBy(xpath = "//p[normalize-space()='Management']")
    WebElement managementMenu;
    @FindBy(xpath = "//p[normalize-space()='Absen Point']")
    WebElement absenpointMenu;
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    WebElement tambahkanButton;
    @FindBy(xpath = "//input[@id='name']")
    WebElement fillNama;
    @FindBy(xpath = "//input[@id='latitude']")
    WebElement fillLatitude;
    @FindBy(xpath = "//input[@id='longitude']")
    WebElement fillLongtitude;
    @FindBy(xpath = "//input[@id='max_radius']")
    WebElement fillMaxRadius;
    @FindBy(xpath = "//input[@id='description']")
    WebElement fillDescription;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement tambahButton;
    @FindBy(xpath = "//input[@id='search']")
    WebElement searchAbsenPoint;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonSearchAbsenPoint;
    @FindBy(xpath = "//h6[normalize-space()='TestLocation1']")
    WebElement textNameAbsenPoint;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Test Desc'])[1]/following::*[name()='svg'][1]")
    WebElement threePointButton;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement simpanButton;
    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li")
    WebElement editElement;
    @FindBy(xpath = "//h6[normalize-space()='TestLocation11']")
    WebElement textEditNameAbsenPoint;
    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    WebElement rowAbsenPoint;

    public AbsenPointPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void klikManagementMenu(){
        managementMenu.click();
    }

    public void klikAbsenPointMenu(){
        absenpointMenu.click();
    }

    public void klikTambahkanAbsenPointButton(){
        tambahkanButton.click();
    }

    public void inputNama(String nama){
        fillNama.sendKeys(nama);
    }

    public void inputLatitude(String latitude){
        fillLatitude.sendKeys(latitude);
    }

    public void inputLongtitude(String longtitude){
        fillLongtitude.sendKeys(longtitude);
    }

    public void inputMaxRadius(String radius){
        fillMaxRadius.sendKeys(radius);
    }

    public void inputDescription(String desc){
        fillDescription.sendKeys(desc);
    }

    public void klikTambah(){
        tambahButton.click();
    }

    public String setSearchAbsenPoint(String search){
        searchAbsenPoint.sendKeys(search);
        return searchAbsenPoint.getText();
    }


    public void klikSearchAbsenPoint(){
        buttonSearchAbsenPoint.click();
    }

    public String verifyElementSearch(){
        return textNameAbsenPoint.getText();
    }
    public String verifyNameEdit(){
        return textEditNameAbsenPoint.getText();
    }

    public void klikResetButton(){
        resetButton.click();
    }

    public void klikTitikTiga(){
        threePointButton.click();
    }

    public void klikSimpanButton(){
        simpanButton.click();
    }

    public void klikEditelement(){
        editElement.click();
    }

    public String verifyRowAbsenPoint(){
        return rowAbsenPoint.getText();
    }

}
