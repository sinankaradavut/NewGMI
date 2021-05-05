@US_001
 Feature: register with valid credentials
    Background:
    Given User goes to page
    And click user icon
    And click on register

    Scenario Outline: validating_the_success_message_for_registration
    And click user icon
    And user enters the ssn "<ssn>"
    And user enters the firstname "<firstname>"
    And user enters the last name "<lastname>"
    And user enters the address   "<address>"
    And user enters the phone number "<phone number>"
    And user enters the username  "<username>"
    And user enters the email address "<email address>"
    And user enters the password "<password>"
    And user enters the password for confirm "<confirm password>"
    And user clicks the register button
    Then verify the registration completed successfully

     Examples: test data for registration page
      |ssn         |  firstname          |  lastname                |      address                        |  phone number  |  username  | email address          |   password  | confirm password|
      |111-99-8888 |John                 | Walker                   | 123 Nostrand ave Brooklyn NY 20305  |258-345-2587    | johnwalker  |johnwalker@hotmail.com | john9455    |john9455        |
      |325-45-8862 |John _1!?,.'[+-)- >< | Walker                   | 123 Nostrand ave Brooklyn NY 20305  |258-345-2587    | johnwalker1 |johnwalker1@hotmail.com| john9455    |john9455         |
      |325-45-7755 |John                 | "Walker----"":\?=][\><%&$| 123 Nostrand ave Brooklyn NY 20305  |258-345-2587    | johnwalker2 |johnwalker2@hotmail.com| john9455    |john9455         |
      |325-45-4589 |John                 | Walker                   | 123 Nostrand ave Brooklyn NY 20305  |258-345-2587    | johnwalker3 |johnwalker3@hotmail.com| john9455    |john9455         |
      |325-45-7766 |John                 | Walker                   | 123 Nostrand ave Brooklyn NY 20305  |258-345-2587    | johnwalker4 |johnwalker4@hotmail.com| john9455    |john9455         |
      |325-45-8862 |John                 | Walker                   | 123 Nostrand ave Brooklyn NY 20305  |258-345-2587    | johnwalker5 |johnwalker5@hotmail.com| john9455    |john9455         |
      |325-45-8862 |John                 | Walker                   | 123 Nostrand ave Brooklyn NY 20305  |258-345-2587    | 999555      |johnwalker6@hotmail.com| john9455    |john9455         |







