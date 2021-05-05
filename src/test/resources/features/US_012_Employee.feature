@US_012
Feature: Operations for Employee
# An Employee can manage Customer

  Background: Login as Employee
    And click user icon
    And click Sign in
    When user employee login

  Scenario: US012_001
    Then Validate the message of Showing Items and column names in header

  Scenario: US012_002
    Then Employee should see  View option and edit button in it

  Scenario: US012_003
    Then Employee should see Delete button
#
  Scenario: US012_004
    And  Click on edit button for a costumer
    When Change mphone email and disable zelle enrolment and click on save
    Then Employee should see translation-not-found message

  Scenario: US012_005
    And Click on edit button for a costumer
    Then employee should see"Create a costumer" option

  Scenario: US012_006
    When Click on delete button for a user
    And See alert popup of Confirm delete operation and click on delete
    Then Employee should see translation-not-found message