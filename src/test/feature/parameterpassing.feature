Feature: Testing the application Login with different way of parameter passing

  Scenario: Test for Parameters passing using POM
    Given I open the application and Click My Account
    When I give the UserName and Password
    And I click on Login
    Then I click signOut

   Scenario: Test for Passing parameters from feature file
     Given I open the application and Click My Account
     When I enter username "sravanibtech07@gmail.com" and password "Jayathasiri24"
     And I click on Login
     Then I click signOut

