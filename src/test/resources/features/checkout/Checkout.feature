@Android @Checkout
Feature: Checkout

  Background:
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "agung.smp1@gmail.com" on email form
    And User input password "takawur27" on password form
    And User click signIn button
    And user see main page

  Scenario: User create checkout 1 item, 1 quantity
    When User click "Expresso" on favourite menu 1 times
    And User see the "Expresso" on shopping cart
    And User click charge button on shopping cart
    And User choose cash option with exact amount to be paid
    And User click charge button on checkout pop-up
    Then User see the receipt page
    And User click No thank you button

  Scenario: User create checkout 1 item, 4 quantity
    When User click "Black coffee" on favourite menu 4 times
    And User see the "Black coffee" on shopping cart
    And User click charge button on shopping cart
    And User choose cash option with exact amount to be paid
    And User click charge button on checkout pop-up
    Then User see the receipt page
    And User click No thank you button


  Scenario: User create checkout 4 item, 1 quantity each
    When User click "Expresso" on favourite menu 1 times
    And User see the "Expresso" on shopping cart
    And User click "Green Tea Latte" on favourite menu 1 times
    And User see the "Green Tea Latte" on shopping cart
    And User click "Cappucino" on favourite menu 1 times
    And User see the "Cappucino" on shopping cart
    And User click "Mochacino" on favourite menu 1 times
    And User see the "Mochacino" on shopping cart
    And User click charge button on shopping cart
    And User choose cash option with exact amount to be paid
    And User click charge button on checkout pop-up
    Then User see the receipt page
    And User click No thank you button

  Scenario: User create checkout 4 item, 5 quantity each
    When User click "Expresso" on favourite menu 5 times
    And User see the "Expresso" on shopping cart
    And User click "Green Tea Latte" on favourite menu 5 times
    And User see the "Green Tea Latte" on shopping cart
    And User click "Cappucino" on favourite menu 5 times
    And User see the "Cappucino" on shopping cart
    And User click "Mochacino" on favourite menu 5 times
    And User see the "Mochacino" on shopping cart
    And User click charge button on shopping cart
    And User choose cash option with exact amount to be paid
    And User click charge button on checkout pop-up
    Then User see the receipt page
    And User click No thank you button
