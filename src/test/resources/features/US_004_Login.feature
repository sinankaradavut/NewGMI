
@US_004

Feature: User logs in

  Background:
    And click user icon
    And click Sign in

  Scenario:Applicant log in
    When user user login
    Then user sees her name on the new page


  Scenario:Applicant log in
    When user admin login
    Then admin sees her name on the new page

  Scenario:Applicant log in
    When user manager login
    Then manager sees her name on the new page

  Scenario:Applicant log in
    When user employee login
    Then employee sees her name on the new page

  Scenario:Applicant log in
    When user customer login
    Then customer sees her name on the new page

  Scenario: cancel log in
    When cancel sign in
    Then user at home page

