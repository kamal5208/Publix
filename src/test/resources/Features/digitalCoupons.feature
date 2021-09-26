Feature: Test Digital Coupons functionalities

  Scenario: Check Digital Coupons is popup while click on Savings

    Given a user is on the home page
    When user click on Digital Coupons
    When user click on Printable Coupons
    Then user is on Printable coupons page
