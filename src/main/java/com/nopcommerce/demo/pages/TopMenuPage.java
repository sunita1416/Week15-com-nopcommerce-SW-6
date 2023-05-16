package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    public TopMenuPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Computers")
    public WebElement computerLink;
    @CacheLookup
    @FindBy(linkText = "Electronics")
    public WebElement electronicLink;

    @FindBy(xpath = "//h1")
    WebElement headingText;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a")
    List<WebElement> options;
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeText;
    public void selectMenu(String menu){
        List<WebElement> list=getListOfElements(options);
        for(WebElement e:list){
            if(e.getText().equalsIgnoreCase(menu)){
                e.click();
                break;
            }
        }
        log.info("Select from " + options.toString());
    }
    public String getHeadingText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get text " + headingText.toString());
        return getTextFromElement(headingText);
    }
    public String getWelcomeText(){
        log.info("Get text " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public void mouseHoverOnComputer(){
        mouseHoverToElement(computerLink);
        log.info("Mouse Hover " + computerLink.toString());
    }
    public void mouseHoverOnElectronic(){
        mouseHoverToElement(electronicLink);
        log.info("Mouse Hover " + electronicLink.toString());
    }
}
