Feature: Testing the BBC Homepage
  Scenario: BBC Search
    Given I navigate to bbc homepage
    When I click on the search box
    And I type in "WorldCup"
    And I click on the search button
    Then I should be able to see worldcup information