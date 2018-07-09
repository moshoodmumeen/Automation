Feature: Registration
  This is a test for the registration page

  Background:
    Given I navigate to dev.giftrt.com
    When I click on register button


  Scenario: Valid Registration
    And I fill in all the required registration data
    And I click on signup button
    Then I should be able to register successfully


  Scenario: Invalid Registration omitting captcha
    And I fill in all the required registration data without ticking captcha
    And I click on signup button
    Then I should get an error message to complete required field


  Scenario: Registration with invalid email address
    And I fill in all data with invalid email address
    And I click on signup button
    Then I should get an error message to enter a valid email address