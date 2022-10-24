#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Release1.0 @Login
Feature: Login Functionality Test
 As a registered customer I should be able to login using this feature

@E2E @Regression
  Scenario: Negative login feature test  by entering both invalid credentials
    Given customer is in home page
    And clicks account list option
    When customer enters invalid username
    And clicks continue button
    And enters invalid password
    And clicks Sign in button
    Then should show login error message
 @Smoke @Regression   
  Scenario: Negative login feature test  by entering invalid username but valid password
    Given customer is in home page
    And clicks account list option
    When customer enters invalid username
    And clicks continue button
    And enters invalid password
    And clicks Sign in button
    Then should show login error message  
    
    
    
    