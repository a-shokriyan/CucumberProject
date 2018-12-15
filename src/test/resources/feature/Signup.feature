Feature: SignUp

  Scenario Outline: Signup without keyword example
    Given I check for second signup page
    When I enter comapny information "<company>" and "<phone>" and "<fax>"
    And I enter credentials "<webSite>" and "<email>" and "<description>"
    And I enter address "<address>" and "<city>" and "<state>" and "<zipCode>"
    Then I select country
    And I click checkbox for same billing address
    And I click on continue
  

    Examples: 
      | company | phone | fax          | webSite | email | description | phone      |
      | John      | Doe      | jdoe@gmail.com | jdoe1    | jdoe123  | Syntax          | 1234567890 |
      | Smith     | Doe      | sdoe@gmail.com | sdoe1    | sdoe123  | Syntax          | 2345678901 |
      | Fred      | Doe      | Fdoe@gmail.com | Fdoe1    | Fdoe123  | Syntax          | 3456789012 |
