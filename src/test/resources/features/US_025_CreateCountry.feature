@Scenario2
 Feature: Create country

      Scenario: validate all countries
        Given user sets the countries to response using api end point "https://www.gmibank.com/api/tp-countries"

      Scenario Outline: create country
          Given user sets the countries to response using api end point "https://www.gmibank.com/api/tp-countries" and creates country using "<type>" and "<name>"
          Examples: create a new country one by one if it is not exist
       |type   |name |
       |name | Zambiya |


       Scenario: read all countries
          Given user sets the countries to response using "https://www.gmibank.com/api/tp-countries"
          Then user validates the countries












