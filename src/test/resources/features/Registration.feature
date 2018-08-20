Feature: Registration on Giftrete website
  Scenario: Giftrete  Registration with Valid details
  Given I navigate to giftrete website
  And I click on register
  And I entered my First Name "Mumeen"
  And I entered my Last Name "Moshood"
  And I entered my email address "mumeenmoshood@gmail.com"
  And I entered my password "Ramota"
  And I confirmed the password "Ramota"
  And I clicked on the Captcha
  And I click on signup
  Then I should be registered successfully