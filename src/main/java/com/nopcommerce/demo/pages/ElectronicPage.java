package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicPage extends Utility {
        private static final Logger log = LogManager.getLogger(ElectronicPage.class.getName());
        public ElectronicPage() {
            PageFactory.initElements(driver, this);
        }
    @CacheLookup
    @FindBy(xpath = "//a[@title='List']")
    WebElement listViewLink;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement phoneLink;
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement headText;
    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement priceText;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantityLink;
    @CacheLookup
    @FindBy(xpath = "(//input[@value])[2]")
    WebElement getQuantity;

    public void selectListView(){
        clickOnElement(listViewLink);
        log.info("Click on " + listViewLink.toString());
    }
    public void selectPhone() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(phoneLink);
        log.info("Click on " + phoneLink.toString());
    }
    public String getHeading() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get Heading " + headText.toString());
        return getTextFromElement(headText);
    }
    public String getPrice(){
        log.info("Get price " + priceText.toString());
        return getTextFromElement(priceText);
    }
    public void changeQuantity(String quantity){
        quantityLink.sendKeys(Keys.BACK_SPACE);
        sendTextToElement(quantityLink,quantity);
        log.info("Change " + quantityLink.toString());
    }
    public String getQuantity(){
        log.info("Get " + getQuantity.toString());
        return getQuantity.getAttribute("value");
    }
    public String getPageURL(){
        return driver.getCurrentUrl();
    }

}
