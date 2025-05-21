Feature: Check ContactUs Functionality
 Scenario: Checking contact us functionality
    
    Given User on Application Homepage
    When Click on ContactUs link
    And Enter yourname, email, Enquiry click on Continue button
    Then Contact US Text should be displayed.

