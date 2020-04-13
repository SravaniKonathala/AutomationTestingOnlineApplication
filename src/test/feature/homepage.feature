Feature: Testing the home Page

  Scenario: Test for user Registration

    Given I am on HomePage
    When I am Clicking On MyAccount
    And I click on CreateAccount
    And I Enter FirstName
    And I Enter LastName
    And I Enter EmailID
    And I Enter ConfirmEmailID
    And I Enter Password
    And I Enter ConfPassword
    And I select Address
    And I enter AddressLine1
    And I enter Town/City
    And I enter Country
    And I enter PostCode
    And I Click on Register
    Then And I get message


  Scenario: Test For Login with valid credentials


    Given I am Clicking On MyAccount
    When I Enter EmailID
    And I Enter Password
    Then  I click LoginIn
