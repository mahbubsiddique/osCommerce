Feature: Validate manufacturers

Scenario Outline: validate contents of manufacturers

Given I am on OS Commerce HomePage
When I select Manufacturers dropdown
Then I see "Please Select" text
And I find "<manufacturers>" list

Examples:
|manufacturers|
#|Canon, Fox, Logitech|
|Please Select, Canon, Fox, GT Interactive, Hewlett Packard, Logitech, Matrox, Microsoft, Samsung, Sierra, Warner|
#|Please Select, Canon, Fox, GT Interactive, Hewlett Packard, Logitech, Matrox, Microsoft, Samsung, Sierra|