@testing
Feature: Login using the My Account menu item with the following credentials

  Scenario Outline: Login using the My Account menu item with the following credentials
    Given I am on Demo web shop page and I register personal details "<gender>" "<fName>" "<lstName>" "<email>" "<password>" "<confirmPass>"
    And I login using my Login Details "<email>" "<password>"



    Examples:
      | gender | fName    | lstName | email            | password | confirmPass |
#      | Female | Salome | Mothapo | salomeM2@gmail.com | 1234567  | 1234567     |
#      | male   | lerato | mash    | leratom@gmail.com  | 1234567  | 1234567     |
#        | male   | precious | mash    | precious@gmail.com | 1234567  | 1234567     |
#  | female | sinazo | mash    | sinazo@gmail.com | 1234567  | 1234567     |
#   | female | sinaz | mash    | sinaz@gmail.com | 1234567  | 1234567     |
      | female | lira     | mash    | lira@gmail.com   | 1234567  | 1234567     |
      | female | lirato   | mashi   | liraM@gmail.com  | 1234567  | 1234567     |
      | female | liratole | mashile | liraNm@gmail.com | 1234567  | 1234567     |


