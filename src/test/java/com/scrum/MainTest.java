package com.scrum;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"}, format = {"pretty",
        "html:target/reports/cucumber/html",
        "json:target/cucumber.json", "usage:target/usage.jsonx", "junit:target/junit.xml"},
        tags = {"@done"})
public class MainTest {

    @BeforeClass
    public static void setUp() {
        WebDriverSingleton.getInstance();
    }


    @AfterClass
    public static void tearDown() {
        WebDriverSingleton.getInstance().quit();
    }

}


