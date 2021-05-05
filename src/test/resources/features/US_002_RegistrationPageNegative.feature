@US_002
Feature: Registration (Negative)

  Background: Homepage
    Given user is on the homePage
    When  user click the User icon
    Then  user click on the  Register

  @US_002_AC1_SSN
  Scenario Outline: SSN field on the registration page should not be left blank
    Given user is on the registration page
    When user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Last Name textbox  and enters lastName "<lastName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should see the emptySSNErrorMessage

    Examples:

      | firstName | lastName | address     | mobilePhone  | username | email             | password  | confirmationPassword |
      | Aylin     | Derya    | 12 rose way | 197-912-2314 | AylinD   | aylinde@gmail.com | Ad192837? | Ad192837?            |
      | Ayfer     | ileri    | 2 Daisy St  | 671-123-4556 | AyferI   | ayferil@gmail.com | Vi192837? | Vi192837?            |


  @US_002_AC1_FirstName
  Scenario Outline: First Name field on the registration page should not be left blank
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the Last Name textbox  and enters lastName "<lastName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should see the emptyFirstNameErrorMessage

    Examples:

      | ssn         | lastName | address     | mobilePhone  | username | email             | password  | confirmationPassword |
      | 873-19-6154 | Derya    | 12 rose way | 197-912-2314 | AylinD   | aylinde@gmail.com | Ad192837? | Ad192837?            |
      | 874-19-6155 | ileri    | 2 Daisy St  | 671-123-4556 | AyferI   | ayferil@gmail.com | Vi192837? | Vi192837?            |

  @US_002_AC1_LastName
  Scenario Outline: Last Name field on the registration page should not be left blank
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should see the emptyLastNameErrorMessage

    Examples:
      | ssn         | firstName | address     | mobilePhone  | username | email             | password  | confirmationPassword |
      | 578-19-6154 | Aylin     | 12 rose way | 197-912-2314 | AylinD   | aylinde@gmail.com | Ad192837? | Ad192837?            |
      | 374-12-6175 | Ayfer     | 2 Daisy St  | 671-123-4556 | AyferI   | ayferil@gmail.com | Vi192837? | Vi192837?            |


  @US_002_AC1_Address
  Scenario Outline: Address field on the registration page should not be left blank
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Last Name textbox  and enters lastName "<lastName>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should not see the successMessage

    Examples:
      | ssn         | firstName | lastName | mobilePhone  | username | email             | password  | confirmationPassword |
      | 773-77-6154 | Aylin     | Derya    | 197-912-2314 | AylinD   | aylinde@gmail.com | Ad192837? | Ad192837?            |
      | 674-33-6155 | Ayfer     | ileri    | 671-123-4556 | AyferI   | ayferil@gmail.com | Vi192837? | Vi192837?            |

  @US_002_AC1_MobilePhoneNumber
  Scenario Outline: Mobile Phone Number field on the registration page should not be left blank
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Last Name textbox  and enters lastName "<lastName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should not see the successMessage

    Examples:
      | ssn         | firstName | lastName | address       | username | email             | password  | confirmationPassword |
      | 273-19-6154 | Aylin     | Derya    | 12 column way | AylinD   | aylinde@gmail.com | Ad192837? | Ad192837?            |
      | 174-19-6155 | Ayfer     | ileri    | 2 Daisy St    | AyferI   | ayferil@gmail.com | Vi192837? | Vi192837?            |

  @US_002_AC1_Username
  Scenario Outline: Username field on the registration page should not be left blank
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should see the emptyUsernameErrorMessage

    Examples:
      | ssn         | firstName | lastName | address       | mobilePhone  | email             | password  | confirmationPassword |
      | 873-19-6154 | Aylin     | Derya    | 12 column way | 197-912-2314 | aylinde@gmail.com | Ad192837? | Ad192837?            |
      | 874-19-6155 | Ayfer     | ileri    | 2 Daisy St    | 671-123-4556 | ayferil@gmail.com | Vi192837? | Vi192837?            |

  @US_002_AC1_Email
  Scenario Outline: Email field on the registration page should not be left blank
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should see the emptyEmailErrorMessage

    Examples:
      | ssn         | firstName | lastName | address     | mobilePhone  | username | password  | confirmationPassword |
      | 873-19-6154 | Aylin     | Derya    | 12 rose way | 197-912-2314 | AylinD   | Ad192837? | Ad192837?            |
      | 874-19-6155 | Ayfer     | ileri    | 2 Daisy St  | 671-123-4556 | AyferI   | Vi192837? | Vi192837?            |

  @US_002_AC1_Password
  Scenario Outline: New password field on the registration page should not be left blank
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should see the emptyPasswordErrorMessage

    Examples:
      | ssn         | firstName | lastName | address     | mobilePhone  | username | email             | confirmationPassword |
      | 873-19-6154 | Aylin     | Derya    | 12 rose way | 197-912-2314 | AylinD   | aylinde@gmail.com | Ad192837?            |
      | 874-19-6155 | Ayfer     | ileri    | 2 Daisy St  | 671-123-4556 | AyferI   | ayferil@gmail.com | Vi192837?            |

  @US_002_AC1_PasswordConfirmation
  Scenario Outline: New password confirmation field on the registration page should not be left blank
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the register button
    Then user should see the emptyConfirmationPasswordErrorMessage

    Examples:
      | ssn         | firstName | lastName | address     | mobilePhone  | username | email             | password  |
      | 873-19-6154 | Aylin     | Derya    | 12 rose way | 197-912-2314 | AylinD   | aylinde@gmail.com | Ad192837? |
      | 874-19-6155 | Ayfer     | ileri    | 2 Daisy St  | 671-123-4556 | AyferI   | ayferil@gmail.com | Vi192837? |


  @US_002_AC1_InvalidSSN
  Scenario Outline: SSN number cannot be of any chars nor spec chars except '-' with 9 digit-long
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should see the invalidSSNErrorMessage


    Examples:
      | ssn          | firstName | lastName | address      | mobilePhone  | username | email             | password  | confirmationPassword |
      | a73-12-6867  | Aylin     | Derya    | 12 rose way  | 197-912-2314 | AylinD   | aylinde@gmail.com | Ad192837? | Ad192837?            |
      | 1274-19-6155 | Ayfer     | ileri    | 2 Daisy St   | 671-123-4556 | AyferI   | ayferil@gmail.com | Vi192837? | Ai192837?            |
      | 4!5-00-9876  | Ayse      | Celik    | 13 Row St    | 765-321-9090 | AyseC    | aysece@gmail.com  | Ak192837? | Ak192837?            |
      | 210121233    | Hilal     | Yavuz    | 22 Table Way | 876-123-1212 | HilalY   | hilalya@gmail.com | hy192837? | Cy192837?            |


  @US_002_AC1_InvalidMobilePhoneNumber
  Scenario Outline:  Mobile Phone Number cannot be of any chars nor spec chars except '-' with 10 digit-long
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should see the invalidMobilePhoneErrorMessage

    Examples:
      | ssn         | firstName | lastName | address      | mobilePhone    | username | email             | password  | confirmationPassword |
      | 873-12-6867 | Aylin     | Derya    | 12 rose way  | a-197-912-2314 | AylinD   | aylinde@gmail.com | Ad192837? | Ad192837?            |
      | 874-19-6155 | Ayfer     | ileri    | 2 Daisy St   | 1-671-123-4556 | AyferI   | ayferil@gmail.com | Ai192837? | Ai192837?            |
      | 456-00-9876 | Ayse      | Celik    | 13 Row St    | a65-321-9090   | AyseC    | aysece@gmail.com  | Ak192837? | Ak192837?            |
      | 311-12-1233 | Hilal     | Yavuz    | 22 Table Way | 87?-123-1212   | HilalY   | hilalya@gmail.com | hy192837? | Cy192837?            |


  @US_002_AC1_InvalidEmail
  Scenario Outline:  Email id  cannot be created without "@" and any ". "extension
    Given user is on the registration page
    Then user click on the SSN textbox  and enters ssn "<ssn>"
    Then user click on the First name textbox and enters firstName "<firstName>"
    Then user click on the Address textbox  and enters address "<address>"
    Then user click on the Mobile Phone Number textbox  and enter phoneNumber "<mobilePhone>"
    Then user click on the Username  and enters username "<username>"
    Then user click on the Email textbox  and enters email "<email>"
    Then user click on the New password  and enters password "<password>"
    Then user click on the New password confirmation  and enters confirmationPassword "<confirmationPassword>"
    Then user click on the register button
    Then user should see the invalidEmailErrorMessage

    Examples:
      | ssn         | firstName | lastName | address      | mobilePhone  | username | email            | password  | confirmationPassword |
      | 873-12-6867 | Aylin     | Derya    | 12 rose way  | 197-912-2314 | AylinD   | aylindegmail.com | Ad192837? | Ad192837?            |
      | 874-19-6155 | Ayfer     | ileri    | 2 Daisy St   | 671-123-4556 | AyferI   | ayferil@gmail.   | Ai192837? | Ai192837?            |
      | 311-12-1233 | Hilal     | Yavuz    | 22 Table Way | 876-123-1212 | HilalY   | hilalya@gmailcom | hy192837? | Cy192837?            |

