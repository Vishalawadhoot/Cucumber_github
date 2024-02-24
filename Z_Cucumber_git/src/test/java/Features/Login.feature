Feature: Login feature

  Background: user is logged in
    Given Browser is open
    When Enter url
    And Enter username and password
    And Click on enter
    Then user is logged in

  @Smoke
  Scenario: User should login with valid credentials
    When when user click on whats new
    Then whats new page will be displayed

  @Regression
  Scenario: User should login with valid credentials
    When when user click on sale
    Then sale page will be displayed
