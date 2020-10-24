package com.weborders.utilitiest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    //reference variable,pointer on object
    //if reference variable does not point any object it will have a null value
    //whenever we type new class()- we create a new object
    // reference type can be class, parent class, or interface implemented by class or parent class
    //since web driver is an interface implemented by remote WebDriver class
    //and RemoteWebDriver is a parent of ChromeDriver,FirefoxDriver, etc... classes
    // we can specific reference type as a webDriver
    //it helps to define object type in arun time (poliymorphism)
    private static WebDriver driver;

    private Driver() {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser="chrome";
            switch(browser){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
            }
        }
        return driver;
    }
}
