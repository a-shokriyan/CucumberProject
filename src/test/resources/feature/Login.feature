
Feature: LoginFeature

Scenario: Valid Login
Given I open Browser
And I navigate to FreeCam
When I enter "shokriyan" and "Kunduz1234"
And I click Login button
Then I successfully logged in

Scenario Outline: Invalid login 
validating invalid login with invalid username nad invalid password

Given I open Browser
And I navigate to FreeCam
When I enter "<usernmae>" and "<password>"
And I click Login button
Then I see sign up link

Examples:
	|usernmae|password|
	|Messy	 |Messy123|
	|Jessy	 |Jessy123|



