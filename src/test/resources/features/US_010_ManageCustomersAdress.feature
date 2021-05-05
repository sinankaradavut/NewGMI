@US_010_ManageCustomer
Feature: Manage customers address

  Background: login
    Given click user icon
    And click Sign in
    And user employee login
    And click on My Operations
    And click on Manage Customers
    And click on Create a new Customer

  @US8_TC_001
  Scenario: all fields together with valid credentials (HappyPath)
#    Given All other fields should be typed successfully
    And click on Address field and type the address
    And click on City field and type the city
    And click on Country field and Select Country from dropdown list
    And click on state field and type the state
    And click on Save
#    And verify success message for manage customer

  @US8_TC_002
  Scenario: address field cannot be blanc
    And click on Save
    And verify address field's empty message

  @US8_TC_003
  Scenario: city field cannot be blanc
    And click on Save
    And verify city field's empty message

  @US8_TC_004
  Scenario: state field cannot be blanc
    And click on Save
    And verify state field's empty message

  @US8_TC_005
  Scenario: country field cannot be blanc
    And click on Save
    And verify country field's empty message

  @US8_TC_006
  Scenario: address field with invalid credentials (invalid)
#    Given All other fields should be typed successfully
    And click on Address field and type the invalid address
    And click on City field and type the city
    And click on Country field and Select Country from dropdown list
    And click on state field and type the state
    And click on Save
#    And verify failed message for manage customer

  @US8_TC_007
  Scenario: state field with invalid credentials (invalid)
#    Given All other fields should be typed successfully
    And click on Address field and type the address
    And click on City field and type the city
    And click on Country field and Select Country from dropdown list
    And click on state field and type the invalid state
    And click on Save
#    And verify failed message for manage customer

  @US8_TC_008
  Scenario: city field with negative credentials (negative testing)
#    Given All other fields should be typed successfully
    And click on Address field and type the address
    And click on City field and type the city2
    And click on Country field and Select Country from dropdown list
    And click on state field and type the state
    And click on Save
#    And verify success message for manage customer