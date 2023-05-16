package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("^I am home page$")
    public void iAmHomePage() {
    }

    @When("^I click on \"([^\"]*)\" from top menu$")
    public void iClickOnFromTopMenu(String menu) {
        new TopMenuPage().selectMenu(menu);
    }

    @Then("^Verify that User is navigated to Gift card page Using \"([^\"]*)\"$")
    public void verifyThatUserIsNavigatedToGiftCardPageUsing(String name) throws InterruptedException {
        Assert.assertEquals(new TopMenuPage().getHeadingText(),name,"User is not navigated");
    }
}
