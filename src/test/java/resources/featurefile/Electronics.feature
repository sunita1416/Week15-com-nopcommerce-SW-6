Feature: Electronic Test
  As a user I want to check electronic page

  @smoke @regression
  Scenario: User should be navigated to CellPhone page successfully
    Given I am on homepage
    When I mouse hover on electronics
    And I select "Cell phones"
    Then User should navigated to cellphone page using "Cell phones"

    @sanity @regression
    Scenario: User should able to add and place order successfully
      Given I am on homepage
      When I mouse hover on electronics
      And I select "Cell phones"
      Then User should navigated to cellphone page using "Cell phones"
      When I click on List view
      And I Click on product name “Nokia Lumia”
      Then I Verify the text "Nokia Lumia 1020"
      And I Verify the price using "$349.00"
      And I Change quantity to "2"
      And I Click on “ADD TO CART” tab
      Then I Verify the success Message "The product has been added to your shopping cart" on Top green Bar
      And  I close the bar clicking on the cross button.
      And I MouseHover on Shopping cart
      And I Click on GO TO CART button.
      Then I Verify the message "Shopping cart"
      And I Verify the quantity is "2"
      And I Verify the Total "$698.00"
      When I click on checkbox of I agree with the terms of service
      And I Click on CHECKOUT
      Then I Verify the Text "Welcome, Please Sign In!"
      And I Click on “REGISTER” tab
      Then I Verify the text "Register"
      And I Fill the mandatory fields
      And I Click on “REGISTER” Button
      And I Verify the message "Your registration completed" on registration page
      And I Click on “CONTINUE” tab
      Then I Verify the message "Shopping cart"
      And I Login to website
      When I click on checkbox of I agree with the terms of service
      And I Click on CHECKOUT
      And I Fill the rest mandatory field
      And I Click CONTINUE
      And I Click on Radio Button “Second Day Air”
      And I Click on CONTINUE
      And I Select Radio Button “Credit Card”
      And I click on Payment Continue
      And I Select “Visa” From Select credit card dropdown
      And I Fill all the details
      And I click on next Payment Continue
      Then I Verify Payment Method is "Credit Card"
      And I Verify Shipping Method is "2nd Day Air"
      And I Verify Total is "$698.00"
      And I Click on CONFIRM
      Then I Verify the Text head "Thank you"
      Then I Verify the Success message "Your order has been successfully processed!"
      And I Click on CONTINUE Button
      Then I Verify the text using "Welcome to our store"
      When I Click on “Logout” link
      Then I Verify the URL is "https://demo.nopcommerce.com/"