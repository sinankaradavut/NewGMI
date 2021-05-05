@Invalid
Feature: Invalid Credentials

  Background:

   Given User goes to Url
   Then User clicks menuIcon
   Then User clicks signInButton
   Then User Clicks signIn Option
   Then User sees Failed Message


  Scenario: Login with Invalid UserName
    And User enters Invalid Username
    And User enters Valid Password


 Scenario: Login with Invalid Password
  And User enters Valid Username
  And User enters InValid Password

 Scenario: Login with Invalid UserName and Invalid PassWord
  And User enters InValid Username
  And User enters Invalid Password

 Scenario:Reset Password
  Then User select and click did you forget option?
 And Enter email that suscribed
 Then User clicks reset password

 Scenario: Registeration Option

 Then Users clicks register option if thet do not yet registered
 Then User should see registration page







#@Scenario
#Feature: Invalid Credentials
#
#  Background:
#    Given User goes to Url
#    And click user icon
#    And click Sign in
#
#
#  Scenario Outline:
#
#    Given User enters invalid "<Username>"
#    Then User enters valid "<Password>"
#    And User click Sign in Button
#    Then User get Error Message and validate it
#    Then User enter email for reset password
#    Then User can reset password
#    Then page gives a statement to register it.
#
#    Examples:
#      | Username | Password  |
#      | samsun55 | Br192837? |
#      | BRose    | Market55. |
#      | samsun55 | Market55. |
#