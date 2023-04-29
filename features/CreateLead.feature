Feature: create lead functionality of leaftaps application

Background:
Given open the browser
And load the URL

Scenario Outline: Create lead for valid data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When click on login button
Then Homepage should be loaded
When crmfsa link clicked
And click Leads link
And click Create Leads link
Given Enter the company name as <CompanyName>
And Enter first Name as <FirstName>
And Enter Last name as <LastName>
When click on create lead button
Then view lead page should be displayed

Examples:
|CompanyName|FirstName|LastName|
|TestLeaf|Indumathi|S|
|Qeagle|Babu|M|

