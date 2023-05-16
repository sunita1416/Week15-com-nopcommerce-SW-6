package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityLink;
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCartLink;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement priceLink;

    @FindBy(id = "termsofservice")
    WebElement termsAndConditionLink;

    @FindBy(id = "checkout")
    WebElement checkoutLink;
    public String setShoppingCartText(){
        log.info("Get text " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }
    public void changeQuantity(String quantity){
        quantityLink.sendKeys(Keys.BACK_SPACE);
        sendTextToElement(quantityLink,quantity);
        log.info("Change quantity " + quantityLink.toString());
    }
    public void updateCart(){
        clickOnElement(updateCartLink);
        log.info("click on " + updateCartLink.toString());
    }
    public String getPrice() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get price " + priceLink.toString());
        return getTextFromElement(priceLink);
    }
    public void termsAndCondition(){
        clickOnElement(termsAndConditionLink);
        log.info("Click on " + termsAndConditionLink.toString());
    }
    public void goCheckout(){
        clickOnElement(checkoutLink);
        log.info("click on " + checkoutLink.toString());
    }
}
