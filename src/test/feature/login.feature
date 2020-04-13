Feature:

  Scenario Outline: Testing Login For different users
    Given User is in "<homePage>"
    When User Click on MyAccount
    When User Enter the "<userId>" and "<password>"
    Then User Click on Login

    Examples:
    |homePage                      | userId                   | password      |
    |https://www.cardfactory.co.uk/| sravanibtech07@gmail.com | Jayathasiri24 |

  Scenario Outline: Test for user Registration

    Given User is in "<homepage>"
    When User Click on MyAccount
    And User click on CreateAccount
    And User Enter FirstName and LastName "<firstName>" and "<lastName>"
    And User Enter the EmailId and Password "<emailID>" and "<password>"
    And User Enter the ConfirmEmailID and Password "<confirmEmailId>" and "<confirmPassword>"
    And User select Address Manually
    And User enter Address "<addressline1>" , "<city>" , "<country>" and "<postCode>"
    And User click on Register
    Then User get the success message

    Examples:
    | homepage                       | firstName | lastName     | emailID                 | password       | confirmEmailId         | confirmPassword | addressline1                 | city   | country | postCode |
    | https://www.cardfactory.co.uk/ | Srinivas  | Kandregula   | srinu.portal@gmail.com  | Jayathasiri24  | srinu.portal@gmail.com | Jayathasiri24   | 98,cityview,Essex ,Ilford    | London | UK      | IG11NH   |

