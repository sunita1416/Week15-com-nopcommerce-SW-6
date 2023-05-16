package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.UUID;

public class ElectronicSteps {
    static String email= "random-" + UUID.randomUUID().toString() + "@example.com";
    @When("^I mouse hover on electronics$")
    public void iMouseHoverOnElectronics() {
        new TopMenuPage().mouseHoverOnElectronic();
    }

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String menu) {
        new TopMenuPage().selectMenu(menu);
    }

    @Then("^User should navigated to cellphone page using \"([^\"]*)\"$")
    public void userShouldNavigatedToCellphonePageUsing(String expected) throws InterruptedException {
        Assert.assertEquals(new TopMenuPage().getHeadingText(),expected,"User is not navigated");
    }

    @When("^I click on List view$")
    public void iClickOnListView() {
        new ElectronicPage().selectListView();
    }

    @And("^I Click on product name “Nokia Lumia”$")
    public void iClickOnProductNameNokiaLumia() throws InterruptedException {
        new ElectronicPage().selectPhone();
    }

    @Then("^I Verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String expected) throws InterruptedException {
        Assert.assertEquals(new ElectronicPage().getHeading(),expected,"Navigation is not successful");
    }

    @And("^I Verify the price using \"([^\"]*)\"$")
    public void iVerifyThePriceUsing(String expected) {
        Assert.assertEquals(new ElectronicPage().getPrice(),expected,"Price is not correct");
    }

    @And("^I Change quantity to \"([^\"]*)\"$")
    public void iChangeQuantityTo(String qty) {
        new ElectronicPage().changeQuantity(qty);
    }

    @And("^I Click on “ADD TO CART” tab$")
    public void iClickOnADDTOCARTTab() throws InterruptedException {
        new BuildYourOwnComputerPage().addToCart();
    }

    @And("^I Verify the quantity is \"([^\"]*)\"$")
    public void iVerifyTheQuantityIs(String expected) {
        Assert.assertEquals(new ElectronicPage().getQuantity(),expected,"Quantity is not matching");
    }

    @And("^I Click on “REGISTER” tab$")
    public void iClickOnREGISTERTab() {
        new RegisterPage().clickOnRegister();
    }

    @And("^I Fill the mandatory fields$")
    public void iFillTheMandatoryFields() {
        new RegisterPage().enterFirstname("SP");
        new RegisterPage().enterLastname("Chauhan");
        new RegisterPage().enterEmail(email);
        new RegisterPage().enterPassword("SPc@1234");
        new RegisterPage().enterConfirmPassword("SPc@1234");
    }

    @And("^I Click on “REGISTER” Button$")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegister();
    }

    @And("^I Verify the message \"([^\"]*)\" on registration page$")
    public void iVerifyTheMessageOnRegistrationPage(String expected) {
        Assert.assertEquals(new RegisterPage().getRegisterMessage(),expected,"Registration is not successful");
    }

    @And("^I Click on “CONTINUE” tab$")
    public void iClickOnCONTINUETab() {
        new RegisterPage().clickOnContinue();
    }

    @And("^I Click on Radio Button “Second Day Air”$")
    public void iClickOnRadioButtonSecondDayAir() {
        new BillingPage().selectShipping2();
    }

    @And("^I Select “Visa” From Select credit card dropdown$")
    public void iSelectVisaFromSelectCreditCardDropdown() {
        new BillingPage().selectCard(0);
    }

    @When("^I Click on “Logout” link$")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogout();
    }
    @Then("^I Verify the URL is \"([^\"]*)\"$")
    public void iVerifyTheURLIs(String expected) {
        Assert.assertEquals(new ElectronicPage().getPageURL(),expected,"Logout is not successful");
    }

    @And("^I Login to website$")
    public void iLoginToWebsite() {
        new RegisterPage().clickOnLoginLink();
        new LoginPage().enterEmailId(email);
        new LoginPage().enterPassword("Maitri@123");
        new LoginPage().clickOnLoginButton();
    }

    @And("^I Fill the rest mandatory field$")
    public void iFillTheRestMandatoryField() {
        new BillingPage().selectCountry("United Kingdom");
        new BillingPage().enterCity("London");
        new BillingPage().enterAddress("19, Kellett Road");
        new BillingPage().enterPostcode("UB10 0AB");
        new BillingPage().enterPhoneNumber("7424513808");
    }
}

