Feature: Test order subs works after login the publix account

  Scenario: Check user can see the In Store pickup order subs after successfully login

    Given a user is on the home page
    When click on LOGIN button
    When user enters emailAddress "kamaluctg@gmail.com" and password "Abcd1981"
    And click on LOG IN button
    When user click on Order Subs
    Then user is on the In Store Pickup Oder Subs

