
Feature: Add Customer Validation
 


  Scenario: user is registering to the telecom page
  
  
    Given The user is in telecom Homepage
    And The user add click on add customer
    When The user is filling all the fields
    And The user click on submit button
    Then The user should see the id is generated
    
