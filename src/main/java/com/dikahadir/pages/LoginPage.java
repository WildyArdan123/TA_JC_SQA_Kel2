package com.dikahadir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "email")
    WebElement emailElement;

    @FindBy(id = "password")
    WebElement passwordElemenet;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div[2]/div/div/h2")
    WebElement dashboardValid;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String email, String pass){
        emailElement.sendKeys(email);
        passwordElemenet.sendKeys(pass);
        loginButton.click();
    }




}
