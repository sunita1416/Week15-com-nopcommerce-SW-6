package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@name='Gender' and @value='F']")
    WebElement femaleRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameLink;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameLink;

    @FindBy(xpath = "//input[contains(@id,'E')]")
    WebElement emailLink;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement passwordLink;

    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmPasswordLink;
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registerMessage;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueLink;

    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement checkoutGuestLink;
    @CacheLookup
    @FindBy(xpath = "//a[starts-with(text(),'Reg')]")
    WebElement registerLink;

    public void selectGender(){
        clickOnElement(femaleRadio);
        log.info("Click on " + femaleRadio.toString());
    }
    public void enterFirstname(String name){
        sendTextToElement(firstNameLink,name);
        log.info("Enter " + name + firstNameLink.toString());
    }
    public void enterLastname(String name){
        sendTextToElement(lastNameLink,name);
        log.info("Enter " + name + lastNameLink.toString());
    }
    public void enterEmail(String email){
        sendTextToElement(emailLink,email);
        log.info("Enter " + email + emailLink.toString());
    }
    public void enterPassword(String password){
        sendTextToElement(passwordLink,password);
        log.info("Enter " + password + passwordLink.toString());
    }
    public void enterConfirmPassword(String password){
        sendTextToElement(confirmPasswordLink,password);
        log.info("Enter " + password + confirmPasswordLink.toString());
    }
    public void clickOnRegister(){
        clickOnElement(registerButton);
        log.info("Click on " + registerButton.toString());
    }
    public String getRegisterMessage(){
        log.info("Get message " + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }
    public void clickOnContinue(){
        clickOnElement(continueLink);
        log.info("Click on " + continueLink.toString());
    }
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
        log.info("Click on " + loginLink.toString());
    }
    public void clickCheckoutAsGuest(){
        clickOnElement(checkoutGuestLink);
        log.info("Click on " + checkoutGuestLink.toString());
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        log.info("Click on " + registerLink.toString());
    }
}
