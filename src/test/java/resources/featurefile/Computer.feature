Feature: Computer test

  As a user I want to test Desktop product

  @sanity @regression

    Scenario: User can arrange products in alphabetical order
    Given I am on homepage
    When I mouse hover on Computer menu
    And I click on "Desktops"
    And I select Sort By position "Name: Z to A"
    Then Verify that Product will arrange in Descending order

    @smoke @regression
      Scenario: User can add product to the shopping cart
      Given I am on homepage
      When I mouse hover on Computer menu
      And I click on "Desktops"
      And I select Sort By position "Name: Z to A"
      And Click on Add To cart
      Then I verify that user navigated to build your computer page using "Build your own computer"
      When I Select "2.2 GHz Intel Pentium Dual-Core E2200"
      And I Select RAM "8GB [+$60.00]"
      And I Select HDD radio "400 GB [+$100.00]"
      And I Select OS radio "Vista Premium [+$60.00]"
      And I Check Check-box "Total Commander [+$5.00]"
      Then I Verify the price "$1,475.00"
      When I Click on ADD TO CART Button.
      Then I Verify the success Message "The product has been added to your shopping cart" on Top green Bar
      And  I close the bar clicking on the cross button.
      And I MouseHover on Shopping cart
      And I Click on GO TO CART button.
      Then I Verify the message "Shopping cart"
      When I Change the Qty to "2"
      And I Click on Update shopping cart
      Then I Verify the Total "$2,950.00"
      When I click on checkbox of I agree with the terms of service
      And I Click on CHECKOUT
      Then I Verify the Text "Welcome, Please Sign In!"
      When I Click on CHECKOUT AS GUEST Tab
      And I Fill the all mandatory field
      And I Click CONTINUE
      And I Click on Radio Button “Next Day Air”
      And I Click on CONTINUE
      And I Select Radio Button “Credit Card”
      And I click on Payment Continue
      And I Select “Master card” From Select credit card dropdown
      And I Fill all the details
      And I click on next Payment Continue
      Then I Verify Payment Method is "Credit Card"
      And I Verify Shipping Method is "Next Day Air"
      And I Verify Total is "$2,950.00"
      And I Click on CONFIRM
      Then I Verify the Text head "Thank you"
      Then I Verify the Success message "Your order has been successfully processed!"
      And I Click on CONTINUE Button
      Then I Verify the text using "Welcome to our store"