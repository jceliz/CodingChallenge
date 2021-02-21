@Regression
Feature: Verify Art of Testing functionalities


  @Regression
  Scenario: Verify Art of Testing page title
    Given The user open browser
    And   The user verifies page title "Sample Website for Selenium Automation Practice | ArtOfTesting"

  @TC2
  Scenario: Verify Art of Testing Sample Page label
    And   The user verifies page Label


  @TC3
  Scenario: Verify Art of Testing textbox
    And   The user verifies page textbox "test"

  @TC4
  Scenario: Verify Art of Testing radio button
    And   The user verifies page radio button

  @TC5
  Scenario: Verify Art of Testing drag and drop
    And   The user verifies page drag and drop

