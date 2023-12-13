# recovery.feature
Feature: feature to test password recovery functionality

  Scenario: Check password recovery is successful with valid email
    Given user is on the password recovery page
    When user enters their registered email
    And clicks on the recovery button
    Then user receives a password reset email

  Scenario: Check password recovery fails with an invalid email
    Given user is on the password recovery page
    When user enters an invalid email
    And clicks on the recovery button
    Then user sees an error message



