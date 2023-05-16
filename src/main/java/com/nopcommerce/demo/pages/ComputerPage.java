package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "products-orderby")
    WebElement dropDownLink;
    @FindBy(xpath = "//h2[@class='product-title']")
    List <WebElement> listLink;
    public void selectFromDropDown(String value){
        selectByVisibleTextFromDropDown(dropDownLink,value);
        log.info("Select from " + dropDownLink.toString());
    }
    public List getList() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Get list " + listLink.toString());
        List<WebElement> list=getListOfElements(listLink);
        List<String> orignalList= new ArrayList<>();
        for(WebElement e:list){
            orignalList.add(e.getText());
        }
        return orignalList;
    }
    public boolean isSorted() throws InterruptedException {
        List<String> sortedList= getList();
        sortedList.sort(Comparator.reverseOrder());
        return getList().equals(sortedList);
    }


}
