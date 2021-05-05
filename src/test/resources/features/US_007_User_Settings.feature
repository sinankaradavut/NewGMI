@US_007

Feature: User goes to the user settings page

  Background:
    Given user signs in
    And user clicks on the user icon
    And user clicks on user info
    Then user is on the user settings page


    @TC_001
  Scenario Outline: update user email
    Given user enters "<data>" in the email text box
    And user clicks on save button

      Examples:

      |data|
      |abc123|
      |mike.com|
      |testdata@gmail-mm|
      |berre@gmailcom|

  @TC_002
    Scenario: Display available menu options in the language dropdown
      Given user clicks on the language menu
      And user displays available language options
      Then user clicks on save


