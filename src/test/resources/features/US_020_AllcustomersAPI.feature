@US_O20_CustomersDataApi
Feature: System should allow to read all customers' information using the api endpoint

  Background:
    Given use the api endpoint "https://www.gmibank.com/api/tp-customers"
    Then get all customers' information as de-serialization

    @TC_001_AllCustomersData
    Scenario: Verify to read all customers' data set

      Then verify the number 20 that is equals to the customers'number created from user
      Then write the all customer's "firstName" and  "lastName" in a  file
      Then write the all customer's "ssn" in a file and validate all the "ssn"



   @TC_002_OneByOneCustomerData
      Scenario: Verify the customer's data one by one

     Then verify that first customer's email "alisahin@gmail.com" and mobilePhoneNumber "123-456-7890"
     Then verify that first customer's city "ankara" and zipCode "123"
     Then verify that third customer's firstName "Ali" and lastName "Deckow"
     Then verify that last customer's firstName "Ricardo" and lastName "Mraz"



