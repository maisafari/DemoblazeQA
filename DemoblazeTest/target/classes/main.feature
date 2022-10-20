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
@tag
Feature: CucumberDemoblaze

  @tag1
  Scenario Outline: Place an order using AMEX credit card
    Given User have opened the browser
    And User have opened Demoblaze website
    When User have accessed index page
    And have gonne to the Laptops section
    And have Found MacBook Pro
    Then add it to cart
    When User have opened cart
    When User have placed order
    When have filed name as <name> And country as <country>  And city as <city> And creditCard as <creditCard> And month as <month> And Year as <year>
 		Then Verify the purchase confirmation contains And If name is equal <name> 
    Examples: 
      |name|country|city|creditCard|month|year|
      |"John Doe"|"Portugal"|"Lisbon"|"375567668884617"|"02"|"2030"|
      |"Percy Clayton"|"United States"|"Jacksonville"|"4411732769254916"|"4"|"2029"|
  
  
  
 
  
