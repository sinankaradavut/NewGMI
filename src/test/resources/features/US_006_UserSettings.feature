
@US_006_UserSettings
Feature: User can update user settings

  Background:
    Given user sign in with valid credentials
    And user click user management
    And user select user Info
    And user is on the user settings page

  @SeeAllRelatedInfo @languageoptions
  Scenario: user can see all related info and language options
    Given user can see his own info
    And two language option on the language dropdownmenu
    Then Verify the page belongs to him and two languages options and signout




  @UpdateUserFirstname
  Scenario Outline: user can update firstname
    Given user update firstname "<firstname>"
    And click save button
    Then get success message "<succMessage>"

    Examples:
      |firstname|succMessage    |
      |Mihre    |Settings saved!|

  @UpdateUserLastname
  Scenario Outline: user can update firstname
    Given user update lastname "<lastname>"
    And click save button
    Then get success message "<succMessage>"

    Examples:
      |lastname|succMessage    |
      |Engel   |Settings saved!|
#
  @UpdateUserEmail
  Scenario Outline: user can update firstname
    Given user update email "<email>"
    And click save button
    Then get success message "<succMessage>"

    Examples:
      |email                 |succMessage    |
      |mikengels@gmail.com   |Settings saved!|
#
#
  @UpdateWithInvalidEmail
  Scenario Outline: user can update firstname
    Given user try to update with invalid email "<invalidEmail>"
    And click save button
    Then get error message "<errorMessage>"

    Examples:
      |invalidEmail    |errorMessage         |
      |mengelsgmail.com|This field is invalid|
      |mengels@gmailcom|This field is invalid|