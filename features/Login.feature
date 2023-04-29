Feature: Login functionality of leaftaps application

Background:
Given open the browser
And load the URL

Scenario: Login for positive testcases
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When click on login button
Then Homepage should be loaded

Scenario: Login for Error testcases
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When click on login button
But Error message should be displayed