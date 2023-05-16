package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on Computer Menu\\.$")
    public void iMouseHoverOnComputerMenu() {
        new TopMenuPage().mouseHoverOnComputer();
    }

    @And("^I Click on \"([^\"]*)\"$")
    public void iClickOn(String menu) {
        new TopMenuPage().selectMenu(menu);
    }

    @And("^I Select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String sort) {
        new ComputerPage().selectFromDropDown(sort);
    }

    @Then("^Verify that Product will arrange in Descending order$")
    public void verifyThatProductWillArrangeInDescendingOrder() throws InterruptedException {
        Assert.assertTrue(new ComputerPage().isSorted(),"Products are not sorted in reverse order");
    }

    @And("^Click on Add To Cart$")
    public void clickOnAddToCart() throws InterruptedException {
        new BuildYourOwnComputerPage().addToCart();
    }

    @Then("^I Verify that user navigated to build your computer page using \"([^\"]*)\"$")
    public void iVerifyThatUserNavigatedToBuildYourComputerPageUsing(String expected) throws InterruptedException {
        Assert.assertEquals(new TopMenuPage().getHeadingText(),expected,"User is not navigated to Build your Computer page");
    }

    @When("^I Select \"([^\"]*)\"$")
    public void iSelect(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }
    @And("^I Select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("^I Select HDD radio \"([^\"]*)\"$")
    public void iSelectHDDRadio(String hdd) {
        new BuildYourOwnComputerPage().selectHddRadio(hdd);
    }

    @And("^I Select OS radio \"([^\"]*)\"$")
    public void iSelectOSRadio(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("^I Check Check-box \"([^\"]*)\"$")
    public void iCheckCheckBox(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @Then("^I Verify the price \"([^\"]*)\"$")
    public void iVerifyThePrice(String expected) throws InterruptedException {
        Assert.assertEquals(new BuildYourOwnComputerPage().getPrice(),expected,"Price is not matching");
    }

    @When("^I Click on ADD TO CART Button\\.$")
    public void iClickOnADDTOCARTButton() throws InterruptedException {
        new BuildYourOwnComputerPage().addToCart();
    }

    @Then("^I Verify the success Message \"([^\"]*)\" on Top green Bar$")
    public void iVerifyTheSuccessMessageOnTopGreenBar(String expected) throws InterruptedException {
        Assert.assertEquals(new BuildYourOwnComputerPage().getSuccessMessage(),expected,"Product is not added to cart successfully");
    }

    @And("^I close the bar clicking on the cross button\\.$")
    public void iCloseTheBarClickingOnTheCrossButton() {
        new BuildYourOwnComputerPage().closeMessage();
    }

    @And("^I MouseHover on Shopping cart$")
    public void iMouseHoverOnShoppingCart() throws InterruptedException {
        new BuildYourOwnComputerPage().mouseHoverOnShoppingCart();
    }

    @And("^I Click on GO TO CART button\\.$")
    public void iClickOnGOTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnGoToCart();
    }

    @Then("^I Verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String expected) {
        Assert.assertEquals(new ShoppingCartPage().setShoppingCartText(),expected,"User is not navigated to shopping cart page");
    }

    @When("^I Change the Qty to \"([^\"]*)\"$")
    public void iChangeTheQtyTo(String qty) throws InterruptedException {
        Thread.sleep(500);
        new ShoppingCartPage().changeQuantity(qty);
    }

    @And("^I Click on Update shopping cart$")
    public void iClickOnUpdateShoppingCart() {
        new ShoppingCartPage().updateCart();
    }

    @Then("^I Verify the Total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String expected) throws InterruptedException {
        Assert.assertEquals(new ShoppingCartPage().getPrice(),expected,"Cart price is not updated");
    }

    @When("^I click on checkbox of I agree with the terms of service$")
    public void iClickOnCheckboxOfIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().termsAndCondition();
    }

    @And("^I Click on CHECKOUT$")
    public void iClickOnCHECKOUT() {
        new ShoppingCartPage().goCheckout();
    }

    @Then("^I Verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(String expected) throws InterruptedException {
        Assert.assertEquals(new TopMenuPage().getHeadingText(),expected,"User is not navigated");
    }
    @When("^I Click on CHECKOUT AS GUEST Tab$")
    public void iClickOnCHECKOUTASGUESTTab() {
        new RegisterPage().clickCheckoutAsGuest();
    }

    @And("^I Fill the all mandatory field$")
    public void iFillTheAllMandatoryField() {
        new BillingPage().enterFirstname("SP");
        new BillingPage().enterLastname("Chauhan");
        new BillingPage().enterEmail("SPC@gmail.com");
        new BillingPage().selectCountry("United Kingdom");
        new BillingPage().enterCity("London");
        new BillingPage().enterAddress("19, Kellett Road");
        new BillingPage().enterPostcode("UB10 0AB");
        new BillingPage().enterPhoneNumber("7424513808");
    }

    @And("^I Click on CONTINUE$")
    public void iClickOnCONTINUE() throws InterruptedException {
        new BillingPage().clickOnContinue();
    }

    @And("^I Click on Radio Button “Next Day Air”$")
    public void iClickOnRadioButtonNextDayAir() {
        new BillingPage().selectShipping();
    }

    @And("^I Select Radio Button “Credit Card”$")
    public void iSelectRadioButtonCreditCard() {
        new BillingPage().clickCreditCard();
    }

    @And("^I Select “Master card” From Select credit card dropdown$")
    public void iSelectMasterCardFromSelectCreditCardDropdown() {
        new BillingPage().selectPaymentMethod();
    }

    @And("^I Fill all the details$")
    public void iFillAllTheDetails() {
        new BillingPage().selectCard(1);
        new BillingPage().enterCardHolderName("Prime Testing");
        new BillingPage().enterCardNumber("5109105105105300");
        new BillingPage().selectExpiryMonth(5);
        new BillingPage().selectExpiryYear(3);
        new BillingPage().enterCVV("227");
    }
    @Then("^I Verify Payment Method is \"([^\"]*)\"$")
    public void iVerifyPaymentMethodIs(String expected) {
        Assert.assertTrue(new BillingPage().getPaymentText().contains(expected),"Payment method is not matching");
    }
    @And("^I Verify Shipping Method is \"([^\"]*)\"$")
    public void iVerifyShippingMethodIs(String expected) {
        Assert.assertTrue(new BillingPage().getShippingText().contains(expected),"Shipping methode is not matching");
    }
    @And("^I Verify Total is \"([^\"]*)\"$")
    public void iVerifyTotalIs(String expected) {
        Assert.assertTrue(new BillingPage().getPriceText().contains(expected),"Price is not matching");
    }
    @And("^I Click on CONFIRM$")
    public void iClickOnCONFIRM() throws InterruptedException {
        new BillingPage().clickConfirm();
    }

    @Then("^I Verify the text using \"([^\"]*)\"$")
    public void iVerifyTheTextUsing(String expected) {
        Assert.assertEquals(new TopMenuPage().getWelcomeText(),expected,"User is not navigated");
    }

    @And("^I click on Payment Continue$")
    public void iClickOnPaymentContinue() throws InterruptedException {
        new BillingPage().clickPaymentContinue();
    }

    @Then("^I Verify the Text head \"([^\"]*)\"$")
    public void iVerifyTheTextHead(String expected) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(new BillingPage().getHeadText(),expected,"Not confirmed");
    }

    @Then("^I Verify the Success message \"([^\"]*)\"$")
    public void iVerifyTheSuccessMessage(String expected) {
        Assert.assertEquals(new BillingPage().getSuccessText(),expected,"Order is not processed");
    }

    @And("^I Click CONTINUE$")
    public void iClickCONTINUE() throws InterruptedException {
        new BillingPage().clickContinue();
    }

    @And("^I click on next Payment Continue$")
    public void iClickOnNextPaymentContinue() {
        new BillingPage().clickOnPaymentContinue();
    }

    @And("^I Click on CONTINUE Button$")
    public void iClickOnCONTINUEButton() {
        new BillingPage().clickOnContinueButton();
    }
}

