package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressFilteringData",
        features = {
//                "src/test/resources/features/admin/Login/login.feature",
                "src/test/resources/features/admin/AbsenPoint/FilteringData.feature",
        },
        glue = {
//                "com.belajarcucumber.hooks",
                "com.definition",
        },
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}