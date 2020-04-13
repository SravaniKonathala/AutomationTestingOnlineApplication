Feature: Login Page Automation Testing with data table
  Scenario: Test for passing parameters from DataTable without header

 Given I open the application and Click My Account
When I enter <username> and <password>
    |sravanibtech07@gmail.com|Jayathasiri24 |
  Then I click on Login

  Scenario: Test for passing parameters from DataTable with header

    Given I open the application and Click My Account
    When I enter the user credential with header
    |username                |password      |
    |sravanibtech07@gmail.com|Jayathasiri24 |
    |srini.portal@gmail.com  |Jayathasiri24 |

    Then I click on Login









