Feature: Login Feature of Facebook
  This feature deals with the functionality of the application.

  Scenario: Login with correct username and password
    Given i navigate to the login page
    When i enter the username as admin and password as admin
    And i click the login button
    Then i should see the user form page



