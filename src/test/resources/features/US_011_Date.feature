@US11_Date
Feature: Date

  Background:
    Given go to web page
    And click DropDownMenu
    And click first signin
    And click enter username
    And click enter password
    And click secondsignin
    And click MyOperation Dropdown
    And click manage customer
    And click creat new customer
    And enter firstname
    And enter lastname
    And enter middlename
    And enter email
    And enter mobilephone number
    And enter phone number
    And zip Code
    And enter Address
    And enter City
    And enter Ssn number





  @TC_001_Date
  Scenario:TC_001_negative
    Given user select previous day
    And user click save
    Then Verify system should give error message

  @TC_002_Date
  Scenario:TC_002_positive
    Given user should select  current date
    And   user click save
    Then  verify account is created with current date

  @TC_003_User
  Scenario: TC_003_User_positive
    Given user leave userTextBox blank
    And   user click save
    Then  verify account is not created with blank userTextBox

  @TC_004_User
  Scenario: TC_004_User_negative
    Then user leave userTextBox blank
    And  user click save
    Then verify account is created with blank usertextbox

  @TC_005_Account
  Scenario: TC_005_User_positive
    Then user select account from registration
    And  user click save
    Then verify account is created with selected account

  @TC_006_Zelle
  Scenario: TC_006_User select Zelle_positive
    And user select Zelle checkbox
    And user click save
    Then verify account is created with  Zelle Selection

  @TC_007_Zelle
  Scenario: TC_007_User doesnot select Zelle_negative
    And  user does not select Zelle checkbox
    And  user click save
    Then verify account is created with not selecting Zelle checkbox
