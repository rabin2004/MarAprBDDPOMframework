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

@Release2.0 @Search
Feature: Search Functionality
  As a customer I want to search desired product using the application.

  #Scenario: Positive search functionality by click search button
    #Given customer is in homepage
    #When customer types in valid product in search text field
    #And clicks search button
    #Then customer should be taken to search result page
    #And should be able to see related products
    #
  #Scenario: Positive search functionality by hitting enter key
    #Given customer is in homepage
    #When customer types in valid product in search text field
    #And hits enter key
    #Then customer should be taken to search result page
    #And should be able to see related products 
    #
  #Scenario: Negative search functionality by hitting enter key
    #Given customer is in homepage
    #When customer types in invalid product in search text field
    #And hits enter key
    #Then should see no result message  
 
 @E2E @Regression   
  Scenario Outline: Positive search functionality Data driven testing
    Given customer is in homepage
    When customer types in valid <product> in search text field
    And clicks search button
    Then customer should be taken to <product> search result page
    And should be able to see related <product>
    
    Examples: 
    |product|
    |apple|
    #|samsung|
    #|Pixel|
    #|LG|
 
 @Sanity @Regression
   Scenario Outline: Negative search functionality Data driven testing
    Given customer is in homepage
    When customer types in "<invalid product>" in search text field
    And hits enter key
    Then should see no result message "No results for"
    
    Examples:
    |invalid product|
    |KFNLKDFNDLKFNDLKFNLKN!@%q092472834723894738924732894|
    #|KFNLKDFNDLKFNDLKFNLKN!@%q092472834723894738924732894|
    #|KFNLKDFNDLKFNDLKFNLKN!@%q092472834723894738924732894|
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
