@testing
Feature: Login using the My Account menu item with the following credentials

  Scenario Outline: Login using the My Account menu item with the following credentials
Given I login using "<userName>" and "<pass>"

#Go to Shop on the Menu bar
And I Order a HP Smart Tank
And I Select Check out
Then Select Place your order and print the order number

  Examples:
    | userName | pass     |
    | TestUser | Tester5027# |