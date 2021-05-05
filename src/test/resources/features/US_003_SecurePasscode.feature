@US_003_SecurePasscode
Feature: Registration page should restrict password usage to a secure and high level passcode


  @TC_0001
  Scenario Outline: : There should be at least one lowercase
    Given Go to registration page
    When Enter  "<password with at least one lowercase char>"
    Then Should see the level chart shows "background-color: rgb(255, 153, 0);"

    Examples:
    |password with at least one lowercase char|
    |AAAAAAa|
    |123456b|
    |/?.>,<m|

  @TC_0002
  Scenario Outline: : There should be at least one uppercase
    Given Go to registration page
    When Enter  "<password with at least one uppercase char>"
    Then Should see the level chart shows "background-color: rgb(255, 153, 0);"
    Examples:
    |password with at least one uppercase char|
    |aaaaaaA|
    |123456B|
    |/?.>,<M|

  @TC_0003
  Scenario Outline: : There should be at least one digit
    Given Go to registration page
    When Enter  "<password with at least one digit>"
    Then Should see the level chart shows "background-color: rgb(255, 153, 0);"
    Examples:
      |password with at least one digit|
      |aaaaaa1|
      |BBBBBBB2|
      |/?.>,<3|

  @TC_0004
  Scenario Outline: : There should be at least one digit
    Given Go to registration page
    When Enter  "<password with at least one special char>"
    Then Should see the level chart shows "background-color: rgb(255, 153, 0);"
    Examples:
      |password with at least one special char|
      |aaaaaa?|
      |BBBBBBB/|
      |123456+|

  @TC_0005
  Scenario Outline: There should be at least seven chars
    Given Go to registration page
    When Enter  "<password with at least seven chars>"
    Then Should see the level chart shows "background-color: rgb(255, 153, 0);"
    Examples:
      |password with at least seven chars|
      |aaaaaa?|
      |BBBBBBB/|
      |123456+|

  @TC_0006
  Scenario Outline: Create new password with at list three secure criteria
    Given Go to registration page
    When Enter  "<password with at list three secure criteria>"
    Then Should see the level chart shows "background-color: rgb(153, 255, 0);"
    Examples:
      |password with at list three secure criteria|
      |aaaaaa?|
      |BBBBBBB/|
      |123456+|
      |aaB<|
      |ss11D|

  @TC_0007
  Scenario Outline: Create new password with at list four secure criteria
    Given Go to registration page
    When Enter  "<password with at list four secure criteria>"
    Then Should see the level chart shows "background-color: rgb(153, 255, 0);"
    Examples:
      |password with at list four secure criteria|
      |Aaaaaa?|
      |?BBBBBB/|
      |S23456+|
      |.aB<|
      |<s11D|
  @TC_0008
  Scenario Outline: Create new password with five secure criteria
    Given Go to registration page
    When Enter  "<password with five secure criteria>"
    Then Should see the level chart shows "background-color: rgb(0, 255, 0);"
    Examples:
      |password with five secure criteria|
      |Aaaa1a?|
      |?BBBb1B/|
      |S234k6+|
      |.aB<11q|
      |<s11Dkkk|
  @TC_0009
  Scenario Outline: Create new password with at list two secure criteria
    Given Go to registration page
    When Enter  "<password with at list three secure criteria>"
    Then Should see the level chart shows "background-color: rgb(153, 255, 0);"
    Examples:
      |password with at list three secure criteria|
      |aaaaaaa|
      |BBBBBBB|
      |1234567|
      |aaBB|
      |ss111|