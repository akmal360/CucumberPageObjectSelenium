Feature: Searching New Cars
  
  In order to search new cars
  As a User
  I have to navigate to carwala.com

  Scenario: Finding new cars
    Given user navigates to carwala website
    When user mouseover to new cars
    Then user clicks on Findnewcars
    And user click on Toyota car
    And user validate car titels as Toyota Cars
    