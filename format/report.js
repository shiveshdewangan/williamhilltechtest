$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\horse_bet.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of Horse Racing Bet functionality",
  "description": "",
  "id": "validation-of-horse-racing-bet-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful addition of horse racing bet and stake on the best slip",
  "description": "",
  "id": "validation-of-horse-racing-bet-functionality;successful-addition-of-horse-racing-bet-and-stake-on-the-best-slip",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on william hill home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on Racing link or dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on horses link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User chooses a quick bet and adds a stake",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User adds the bet to Bet Slip",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on bet slip",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User validates the bet value",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.User_is_on_william_hill_home_page()"
});
formatter.result({
  "duration": 50326934188,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.User_clicks_on_Racing_link_or_dropdown()"
});
formatter.result({
  "duration": 3968079196,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.User_clicks_on_horses_link()"
});
formatter.result({
  "duration": 2243344507,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.User_chooses_a_quick_bet_and_adds_a_stake()"
});
formatter.result({
  "duration": 2245906193,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.User_adds_the_bet_to_Bet_Slip()"
});
formatter.result({
  "duration": 3768963417,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.User_clicks_on_bet_slip()"
});
formatter.result({
  "duration": 2111068832,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.User_validates_the_bet_value()"
});
formatter.result({
  "duration": 2106962492,
  "status": "passed"
});
});