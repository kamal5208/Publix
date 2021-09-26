Feature: Test Review and Checkout functionalities

  Scenario: Check Review and Checkout  working as expected

    Given a user is on the home page
    When user mouse hover on Shop Online
    When user click on In-Store Pickup
    When user click on Seafood
    When user click on Live Small Lobster Wild
    And click on ADD TO ORDER
    When user click on REVIEW and CHECKOUT
    Then user is on the Confirm Your Store





