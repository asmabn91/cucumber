Feature: Login functionality
  Scenario:  Login with a valid username and password
    Given Navigate to campus
    When Enter username
    And enter  password
    And Click on login Button
    Then User should login successfully


