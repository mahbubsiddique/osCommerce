@QuickFind
Feature: Quick Find Search

@QuickFindSearchByBrands
Scenario Outline: search by brands

Given I am on OSCommerce homepage
When I enter a "<brand>" 
And I click on quick find icon
Then I see related product list
When I click on the product
Then I see details of the selected product

Examples:
|brand		|
|samsung	|
|microsoft	|