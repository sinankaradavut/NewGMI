@US14
Feature: Date should be created on the time of account creation
  Background:
    And click user icon
    And click Sign in
    When user employee login
    And user clicks myOperations link

  @US14_TC01
  Scenario: TC1401 manage accounts date selection today test
    Given user clicks manageAccounts link
    And user clicks createANewAccount link
    And user sends an earlier date
    And user verifies date is an early date
    Then admin signOut

  @US14_TC02
  Scenario: TC1402 manage accounts date selection positive test
    Given user clicks manageAccounts link
    And user clicks createANewAccount link
    And user account send a date "12132020" and click tab
    And user account send a time "1600" and user click tab
    And user account click tab
    And user account verifies valid data entry to Create Date box
    Then admin signOut

  @US14_TC03
  Scenario: TC1403 manage customers date selection positive test
    Given user clicks manageCostomers link
    And user clicks createNewCustomer link
    And user customer send a date "12132020" and click tab
    And user customer send a time "1600" and user click tab
    And user customer click tab
    And user customer verifies valid data entry to Create Date box
    Then admin signOut

  @US14_TC04
  Scenario: TC1404 manage customers user selection positive test
    Given user clicks manageCostomers link
    And user clicks createNewCustomer link
    And user customer click user box and select a user
    And user customer verifies valid selection of user
    Then admin signOut

  @US14_TC05
  Scenario: TC1405 manage customers Zelle box selection test
    Given user clicks manageCostomers link
    And user clicks createNewCustomer link
    And user customer click Zelle Enrolled box
    And user customer verifies that there is no allert message related to Zelle box
    Then admin signOut
