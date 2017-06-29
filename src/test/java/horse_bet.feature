Feature: Validation of Horse Racing Bet functionality

Scenario: Successful addition of horse racing bet and stake on the best slip	
	Given User is on william hill home page
	When User clicks on Racing link or dropdown
	Then User clicks on horses link
	Then User chooses a quick bet and adds a stake
	And User adds the bet to Bet Slip
	Then User clicks on bet slip
	And User validates the bet value