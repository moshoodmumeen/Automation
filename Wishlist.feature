Feature: This test is for the functionality of Wishlist on dev.giftrete.com

  Scenario: creating my wishlist
    Given that i have logged in to my account on dev.giftrt.com
    When I click on wishlist
    And I clicked on create wishlist
    And I entered all the required data
    And I click on the save button
    Then My wishlist should be successfully saved