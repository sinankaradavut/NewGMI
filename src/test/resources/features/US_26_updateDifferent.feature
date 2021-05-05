Feature: update of countries

  Scenario Outline:
    Given user sets all data using "https://www.gmibank.com/api/tp-countries" using "<id>" and "<name>" and "<state>"

    Examples:
      | id    | name        | state |
      | 18949 | Switzerland | null  |

  Scenario: user read all countries data
    Given user sets the countries to response using "https://www.gmibank.com/api/tp-countries"
    Then user validates updated country
    And user saves the countries to correspondent files
    Then user validates the countries




