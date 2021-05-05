@US09
Feature: Search costumer info with SSN
  Background:
    And click user icon
    And click Sign in
    When user employee login
    And user clicks myOperations link
    And user clicks manageCostomers link
    And user clicks createNewCustomer link

  @US09_TC01
  Scenario: Positive Test  enter correct SSN and all info of costumer in registration field should be seen
    Given admin enter correct SSN "123-12-8745"
    Then click search button
    Then sees firstname,lastname,email,mobilnumber,phoneNumber,addres ,ssn ,createDate
    Then admin signOut

  @US09_TC02
  Scenario: Positive Test  enter correct SSN and doesnt  see unfeiled record in registration
    Given admin enter correct SSN "456-67-2341"
    Then click search button
    Then admin enter "456-67-2341" same correct SSN  and doesnt  see unfeiled record in registration
    Then admin signOut

  @US09_TC03
  Scenario: Negative Test enter incorret SSN then there should not seen any data of costumer
    Given  admin enter false SNN "123-12-87451" doesnt  see any info of costumers
    Then click search button
    Then admin enter incorrect SSN "123-12-87451" and should see alert Error message
    Then admin signOut

  @US09_TC04
  Scenario Outline: Positive Test enter to out of SSN search Box a data then user should not see any data of users
    Given  admin enters to firstname Box "<name>"
    Then   click search button
    Then   admin  doesnt see any of info of costumer
    Then   admin signOut

    Examples:
      | name  |
      | Salma |


  @US09_TC05
  Scenario: Negative Test select from dropdown exist user data and not filled data should be  displayed
    Given  admin selects from user Box a data
    Then   admin can select all username
    Then   admin  wont be see any data of costumer
    Then   admin signOut

  @US09_TC06
  Scenario Outline: user enter correct SSN data and use may edit or fill the data of user
    Given  admin enter correct ssn data "<SSN>"
    Then   click search button
    Then   admin fill miss box of data
    Then   admin click save
    Then   admin signOut

    Examples:
      | SSN         |
      | 456-67-2341 |
