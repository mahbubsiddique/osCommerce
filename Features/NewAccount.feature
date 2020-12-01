@NewAccount
Feature: Create a new account

@createNewAccount
Scenario Outline: Create an account 


Given I am on OS Commerce homepage
When I click on My Account button
And I click on continue button from new customer section
Then I see My Account Information Page
When I select Male or Female radio button
And I enter "<first name>" "<last name>" "<dob>" and "<email address>"
And I select a country from the drop down
And I click continue 
Then I see a pop up error message

Examples:
|first name	|last name	|dob		|email address		|
|Mahbub		|Siddique	|07/01/1977	|mahbub@yahoo.com	|