#Author: shokriyan@gmail.com
Feature: SignUpWithDT

  Scenario: Sign Up to the FreeCRM
    Given I open Browser
    And I navigate to FreeCam
    And I click SignUp
    When I provide the following details
      | Edition      | firstName | lastNmae | email          | confirmEmail   | userName  | password | confirmPassword |
      | Free Edition | Tracy     | Livan    | tracy@test.com | tracy@test.com | tracytest | test123  | test123         |
    And Checked the terms and conditions button
    Then Click on submit button

  Scenario Outline: Signup without keyword example
    Given I check for company information page
    When I enter comapny information "<company>" and "<phone>" and "<fax>"
    And I enter rest of information "<webSite>" and "<email>" and "<description>"
    And I enter address "<address>" and "<city>" and "<state>" and "<zipCode>"
    Then I select country
    And I click checkbox for same billing address
    And I click on continue button

    Examples: 
      | company | phone      | fax        | webSite        | email           | description | address        | city    | state | zipCode |
      | Syntax  | 2021234567 | 8001002000 | www.syntax.com | info@syntax.xom | Test        | 1000 readin St | Farifax | VA    |   20100 |

      
      