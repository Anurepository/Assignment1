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
Feature: Login to Elearning

  @active
  Scenario: Signup in elarning
    Given User navigates to elearning site
    When User clicks on Signup
    When Enter the mandatory fields to create Signup
    Then User gets signup

  @sanity
  Scenario: Login to elearning to send a message
    Given User navigates to elearning site1
    When user enters valid credentials 
    Then User send a message
