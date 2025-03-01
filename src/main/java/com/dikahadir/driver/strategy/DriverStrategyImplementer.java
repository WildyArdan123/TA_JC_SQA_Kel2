package com.dikahadir.driver.strategy;

import com.dikahadir.driver.managers.ChromeDriverManager;
import com.dikahadir.driver.managers.FirefoxDriverManager;
import com.dikahadir.driver.utils.BrowserType;
import org.openqa.selenium.WebDriver;

public class DriverStrategyImplementer {
    public WebDriver setStrategy(String strategy){
        switch (strategy){
            case BrowserType.CHROME:
                return ChromeDriverManager.make();
            case BrowserType.FIREFOX:
                return FirefoxDriverManager.make();
            default:
                return ChromeDriverManager.make();

        }
    }
}
