
Feature: LoginFeature

Scenario: Valid Login
Given I open Browser
And I navigate to FreeCam
When I enter valid username and password
And I click Login button
Then I successfully logged in

Scenario: Invalid login
Given I open Browser
And I navigate to FreeCam
When I enter invalid username and password
And I click Login button
Then I see error message
