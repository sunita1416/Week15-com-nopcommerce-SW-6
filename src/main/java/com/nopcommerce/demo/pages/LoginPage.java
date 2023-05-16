package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;
    public String getWelcomeText(){
        log.info("Get welcome text " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
        log.info("Enter " + email + emailField.toString());
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
        log.info("Enter " + password + passwordField.toString());
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Click on " + loginButton.toString());
    }
    public String getErrorMessage(){
        log.info("Get Message " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
    public void clickOnLogout(){
        clickOnElement(logOutLink);
        log.info("Click on " + logOutLink.toString());
    }
}
