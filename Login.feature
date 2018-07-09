Feature: Login
  This test is for the login page

  Background:
    Given that i navigate to dev.giftrt.com
    When I click on Login

  @valid @smoke
  Scenario: Valid Login
    And I entered the username
    And I entered the password
    And I click on the login button
    Then I should be logged in

  @invalid @regression
  Scenario: Login with invalid username
    And I entered invalid username
    And I entered the password
    And I click on the login button
    Then I should not be able to log in

  Scenario: Login with invalid password
    And I entered the username
    And I entered invalid password
    And I click on the login button
    Then I should not be able to log in

@valid
  Scenario: Valid Login with parameter
    And I entered the username "ammoshood"
    And I entered the password "moshpassword"
    And I click on the login button
    Then I should be able to log in

  @invalid
  Scenario: Inalid Login with parameter
    And I entered the username "ammoshoodXXX"
    And I entered the password "moshpasswordXXX"
    And I click on the login button
    Then I should not be able to log in


    Scenario Outline: Log in with multiple users
      And I entered the username "<username>"
      And I entered the password "<password>"
      And I click on the login button
      Then I should be able to log in
      And I logged out

      Examples:
      |username|password|
      |ammoshood|moshpassword|
      |ammoshood2|moshpassword2|
