 Feature: Login Functionality
  Scenario: Checking Login Functionality
    Given user open url "https://tutorialsninja.com/demo/index.php?route=common/home"
    When clicked on MyAccount Dropdown
    And Click on Login
    And Enter Email Address "sdenish1995@gmail.com" and Password "Syed3194@"
    And Click on Login button
    Then MyAccount Page should be displayed

  Scenario Outline: Login Data Driven
    Given user open url "https://tutorialsninja.com/demo/index.php?route=common/home"
    When clicked on MyAccount Dropdown
    And Click on Login
    And Enter Email Address "<Email>" and Password "<Password>"
    And Click on Login button
    Then MyAccount Page should be displayed  
    
  Examples: 
     | Email | Password |
     | sdanish1995@gmail.com | Syed3194@ |
     | sdenish1995@gmail.com | Syed3194@ |