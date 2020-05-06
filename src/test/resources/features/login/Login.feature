@Android @Login
Feature: Login

  Scenario: login with correct username and password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "agung.smp1@gmail.com" on email form
    And User input password "takawur27" on password form
    And User click signIn button
    Then user see main page