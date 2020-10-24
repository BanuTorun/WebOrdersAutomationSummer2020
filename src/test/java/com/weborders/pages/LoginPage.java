package com.weborders.pages;

import com.weborders.utilitiest.ConfigurationReader;
import com.weborders.utilitiest.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id="ct100_MainContent_username")
    private WebElement usernameElement;

    @FindBy(id="ct100_MainContent_password")
    private WebElement passwordElement;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(){
        String username= ConfigurationReader.getProperty("username");
        String password= ConfigurationReader.getProperty("password");

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password , Keys.ENTER);
    }
}
