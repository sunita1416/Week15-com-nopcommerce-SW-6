Feature: Top menu test
  As a User I want to test my Top Menu

  @smoke @regression
  Scenario:As a User I want to navigate at GiftCard page
    Given I am home page
    When I click on "Gift Cards" from top menu
    Then Verify that User is navigated to Gift card page Using "Gift Cards"