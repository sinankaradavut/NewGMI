@US_008_PasswordChange @Regression
Feature: User logs in

  Background:
    And   click user icon
    And   click Sign in
    When  user customer login
    And   click user icon
    And   click Password
    And   type users current password

#  @TC_001-002b @Smoke
#  Scenario Outline: The old password should not be used
#    And   type users new "<password>"
#    And   confirm users "<password>"
#    Then  save it
#    Then  click user icon
#    Then  sign out
#    Then  User goes to page
#    And   click user icon
#    And   click Sign in
#    And   user customer login
#    And   verify failed message
#    And   cancel sign in
#    And   click user icon
#    And   click Sign in
#    When  new username and "<password>"
#    And   click sign in
#    And   click user icon
#    And   click Password
#    And   repair current "<password>"
#    And   type users new password
#    And   confirm users password
#    Then  save it
#
#    Examples:
#      | password  |
#      | lale      |
#      | Sd192837? |

  @TC_001-002a
  Scenario Outline: The old password should not be used(2)
    And   type users new "<password>"
    And   confirm users "<password>"
    Then  save it
    And   verify password changed

    Examples:
      | password  |
      | Sd192837? |


  @TC_003-005
  Scenario Outline: at least 1 lowercase char will increase the level of bar
    Then  check bar level
    And   type users new "<password>"
    Then  check bar level
    Then  verify bar level increased

    Examples:
      | password  |
      | LALeLIM   |
      | LALeLIMIz |
      | LALeM     |

  @TC_006-008
  Scenario Outline: at least 1 uppercase char will increase the level of bar
    Then  check bar level
    And   type users new "<password>"
    Then  check bar level
    Then  verify bar level increased

    Examples:
      | password  |
      | lalElim   |
      | lalElimiz |
      | lalEm     |

  @TC_009-011
  Scenario Outline: at least 1 digit will increase the level of bar
    Then  check bar level
    And   type users new "<password>"
    Then  check bar level
    Then  verify bar level increased

    Examples:
      | password  |
      | lalEm6    |
      | lalElimi9 |
      | lalEmi7   |

  @TC_012-016
  Scenario Outline: at least 1 special char will increase the level of bar
    Then  check bar level
    And   type users new "<password>"
    Then  check bar level
    Then  verify bar level increased

    Examples:
      | password  |
      | lalem*    |
      | lalelimi% |
      | lalemiz@  |
      | lalemiz#  |
      | lalemiz)  |

  @TC_017-024
  Scenario Outline: at least 7 char for a stronger password
    Then  check bar level
    And   type users new "<password>"
    Then  check bar level
    Then  verify bar level increased

    Examples:
      | password |
      | lalemi7  |
      | laleler8 |
      | LALEMI7  |
      | lalemi#  |
      | lalemiz  |
      | LALEMIZ  |
      | *******  |
      | &&&&&&7  |


  @TC_025-026 @Smoke @E2E
  Scenario Outline: The new password should be confirmed
    And   type users new "<password>"
    And   confirm users "<password>"
    Then  save it
    And   verify password changed

    Then  repair current "<password>"
    And   type users new password
    And   confirm users password
    Then  save it
    Examples:
      | password  |
      | lale      |
      | Sd192837? |













