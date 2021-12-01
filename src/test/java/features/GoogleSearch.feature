Feature: Feature to test OpenCart Website

Scenario: Validate login scenario is working

Given Browser is open 
And User navigated to the OpenCart login page
When User enters valid login credentials 
Then The user lands in the Account Home Page
