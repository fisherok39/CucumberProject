Feature: NewLoginPage

  Background:
    Given User go to login page

  Scenario: Login User With Invalid Password Email
    And   User enter "@19.ua" in Email Adress field
    And   User enter "^^^" in Password field
    Then  User click on Login Button
    And Your username or password was incorrect alert is displayed

  Scenario: Login User With Valid Password Empty Email
    And   User enter "" in Email Adress field
    And   User enter "qwerty" in Password field
    Then  User click on Login Button
    And Your username or password was incorrect alert is displayed

  Scenario: User Is Able Reset Password
    And User click on Forgot Password Link
    And User enter "fisher@mail.ru" Forgot Password Email
    Then User click on Reset Password Button
    And User received message password reset instructions sent to your email address

  Scenario: User Is UnAble Reset Password With Empty Fields
    And User click on Forgot Password Link
    Then User click on Reset Password Button
    And please enter a valid email alert is displayed
