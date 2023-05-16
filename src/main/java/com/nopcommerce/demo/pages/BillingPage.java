package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage extends Utility {
    private static final Logger log = LogManager.getLogger(BillingPage.class.getName());

    public BillingPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCodeLink;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberLink;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueLink;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement shippingLink;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement shippingLink2;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardLink;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentMethodLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement cardLink;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement cardMonthLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement cardYearLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCVVLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement creditCardTextLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[starts-with(text(),'$')]")
    WebElement totalText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']//h1[text()='Thank you']")
    WebElement headText;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement nextStep;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentNextStep;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoNextLink;

    public void enterFirstname(String name){
        sendTextToElement(firstNameLink,name);
        log.info("Enter First name : " + firstNameLink.toString());
    }
    public void enterLastname(String name){
        sendTextToElement(lastNameLink,name);
        log.info("Enter Last name : " + lastNameLink.toString());
    }
    public void enterEmail(String email){
        sendTextToElement(emailLink,email);
        log.info("Enter Email : " + emailLink.toString());
    }
    public void selectCountry(String country){
        selectByVisibleTextFromDropDown(countryLink,country);
        log.info("Select country : " + countryLink.toString());
    }
    public void enterCity(String city){
        sendTextToElement(cityLink,city);
        log.info("Enter City : " + cityLink.toString());
    }
    public void enterAddress(String address){
        sendTextToElement(addressLink,address);
        log.info("Enter address : " + addressLink.toString());
    }
    public void enterPostcode(String postcode){
        sendTextToElement(postCodeLink,postcode);
        log.info("Enter post code : " + postCodeLink.toString());
    }
    public void enterPhoneNumber(String number){
        sendTextToElement(phoneNumberLink,number);
        log.info("Enter phone number : " + phoneNumberLink.toString());
    }
    public void clickContinue() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(continueLink);
        log.info("Click on Continue : " + continueLink.toString());
    }
    public void selectShipping(){
        clickOnElement(shippingLink);
        log.info("Click on : " + shippingLink.toString());
    }
    public void clickCreditCard(){
        clickOnElement(creditCardLink);
        log.info("Click on : " + creditCardLink.toString());
    }
    public void selectPaymentMethod(){
        clickOnElement(paymentMethodLink);
        log.info("Select payment method : " + paymentMethodLink.toString());
    }
    public void selectCard(int index){
        selectByIndexFromDropDown(cardLink,index);
        log.info("Select from : " + cardLink.toString());
    }
    public void enterCardHolderName(String name){
        sendTextToElement(cardHolderNameLink,name);
        log.info("Enter Cardholder name : " + cardHolderNameLink.toString());
    }
    public void enterCardNumber(String number){
        sendTextToElement(cardNumberLink,number);
        log.info("Enter Card number : " + cardNumberLink.toString());
    }
    public void selectExpiryMonth(int month){
        selectByIndexFromDropDown(cardMonthLink,month);
        log.info("Enter month : " + cardMonthLink.toString());
    }
    public void selectExpiryYear(int year){
        selectByIndexFromDropDown(cardYearLink,year);
        log.info("Enter Year : " + cardYearLink.toString());
    }
    public void enterCVV(String cvv){
        sendTextToElement(cardCVVLink,cvv);
        log.info("Enter CVV : " + cardCVVLink.toString());
    }
    public String getPaymentText(){
        log.info("Get text : " + creditCardTextLink.toString());
        return getTextFromElement(creditCardTextLink);
    }
    public String getShippingText(){
        log.info("Get text : " + shippingMethodText.toString());
        return getTextFromElement(shippingMethodText);
    }
    public String getPriceText(){
        log.info("Get text : " + totalText.toString());
        return getTextFromElement(totalText);
    }
    public void clickConfirm() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(confirmButton);
        log.info("Click on : " + confirmButton.toString());
    }
    public String getHeadText(){
        log.info("Get heading text : " + headText.toString());
        return getTextFromElement(headText);
    }
    public String getSuccessText(){
        log.info("Get success text : " + successText.toString());
        return getTextFromElement(successText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        log.info("Click on : " + continueButton.toString());
    }
    public void clickOnContinue(){
        clickOnElement(nextStep);
        log.info("Click on next step : " + nextStep.toString());
    }
    public void clickPaymentContinue() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(paymentNextStep);
        log.info("Click on : " + paymentNextStep.toString());
    }
    public void clickOnPaymentContinue(){
        clickOnElement(paymentInfoNextLink);
        log.info("Click on : " + paymentInfoNextLink.toString());
    }
    public void selectShipping2(){
        clickOnElement(shippingLink2);
        log.info("Select : " + shippingLink2.toString());
    }

}
