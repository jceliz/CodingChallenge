@Regression
Feature: Verify Giordano functionalities

  @TC1
  Scenario: Verify Giordano register
    Given The user navigate to Giordano page
    And   The user click Sign in
    Then  The Login Page is displayed
    Given The user click Register
    Then  Register page is displayed
    Given The user enter the following details
      | username          | testest@yahoo.com |
      | password          | 123               |
      | re-enter password | 123               |
    And   The user click Register and Sign in
    Then  Then user is login