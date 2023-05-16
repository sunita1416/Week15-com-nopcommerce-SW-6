package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//button[normalize-space()='Add to cart'])[1]")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorLink;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement RAMLink;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//li/label")
    List<WebElement> hDDRadios;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']//li/label")
    List<WebElement> oSRadios;
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li/label")
    List<WebElement> softwareCheckBoxes;
    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement priceLink;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement successMessageLink;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeLink;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    public WebElement shoppingCartLink;
    @FindBy(xpath = "(//button[normalize-space()='Go to cart'])[1]")
    WebElement goToCartLink;

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addToCartButton);
        log.info("Click on : " + addToCartButton.toString());
    }
    public void mouseHoverOnShoppingCart() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElement(shoppingCartLink);
        log.info("Mouse hover on : " + shoppingCartLink.toString());
    }
    public void selectProcessor(String processor){
        selectByVisibleTextFromDropDown(processorLink,processor);
        log.info("Select " + processorLink.toString());
    }
    public void selectRAM(String value){
        selectByVisibleTextFromDropDown(RAMLink,value);
        log.info("Select " + RAMLink.toString());
    }
    public void selectHddRadio(String hddB){
        for (WebElement hdd : hDDRadios) {
            if (hdd.getText().equals(hddB)) {
                clickOnElement(hdd);
                log.info("Select " + hDDRadios.toString());
                break;
            }
        }
    }
    public void selectOs(String oss){
        for (WebElement os : oSRadios) {
            if (os.getText().equals(oss)) {
                clickOnElement(os);
                log.info("Select " + oSRadios.toString());
                break;
            }
        }
    }
    public void selectSoftware(String softwareName) {
        for (WebElement software : softwareCheckBoxes) {
            if (software.getText().equals(softwareName)) {
                clickOnElement(software);
                log.info("Select " + softwareCheckBoxes.toString());
                break;
            }
        }
    }
    public String getPrice() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get price " + priceLink.toString());
        return getTextFromElement(priceLink);
    }
    public String getSuccessMessage() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get message " + successMessageLink.toString());
        return getTextFromElement(successMessageLink);
    }
    public void closeMessage(){
        clickOnElement(closeLink);
        log.info("Click on " + closeLink.toString());
    }
    public void clickOnGoToCart(){
        clickOnElement(goToCartLink);
        log.info("Click on " + goToCartLink.toString());
    }

}
