Feature: Return the value of “state province” where name is the University of Witwatersran

  Scenario: Return the value of “state province” where name is the University of Witwatersrand 
    Given i open the EndPoint
    And I get response
    Then I should print name is the University of Witwatersrand
