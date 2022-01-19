Feature: LoginPage

  Background:
    Given User go to login page

  Scenario: Authorization with valid credentials
    And   User enter "rock@19.ua" in Email Adress field
    And   User enter "qwerty" in Password field
    Then  User click on Login Button
    And  My Account link is displayed


  Scenario: Login With Empty Email and Password Fields
    Then User click on Login Button
    And Your username or password was incorrect alert is displayed

  Scenario: Login User With Invalid Email Valid Password
    And   User enter "rock.ua" in Email Adress field
    And   User enter "qwerty" in Password field
    Then  User click on Login Button
    And Your username or password was incorrect alert is displayed

  Scenario: Login User With Invalid Password Valid Email
    And   User enter "rock@19.ua" in Email Adress field
    And   User enter "4679^^" in Password field
    Then  User click on Login Button
    And Your username or password was incorrect alert is displayed


