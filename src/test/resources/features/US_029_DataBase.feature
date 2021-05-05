@US_029_DataBase

Feature: Validate all data performing database testing

  Background:
  Given user  connecting GMI database

  @Tc_001
  Scenario: All users' information must be obtained database and verified
    And user read all user data from database
    Then user validate all user data

  @TC_002
  Scenario: All countries' info should be retrieved by database and validated
    And user read all countries infos from database
    Then user validate all countries infos

  @TC_003
  Scenario: All states should related to USA should be retrieved by database and validated
    And  user read all states of related to USA from database
    Then  user
