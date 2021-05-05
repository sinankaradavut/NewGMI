@US_016_MoneyTransfer
Feature: Money transfer should be available

  Background:
    And click user icon
    And click Sign in
    When user customer login

  Scenario: Customer Should transfer money
    And click my operations
    And click transfer page
    And choose the sending account
    And choose the receiver account
    And type the balance and cent
    And type description
    And click make transfer button
