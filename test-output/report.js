$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Login.feature");
formatter.feature({
  "line": 2,
  "name": "LoginFeature",
  "description": "",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Valid Login",
  "description": "",
  "id": "loginfeature;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to FreeCam",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_Browser()"
});
formatter.result({
  "duration": 4548711906,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_FreeCam()"
});
formatter.result({
  "duration": 3423581636,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_username_and_password()"
});
formatter.result({
  "duration": 2555476472,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_Login_button()"
});
formatter.result({
  "duration": 3658102400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_successfully_logged_in()"
});
formatter.result({
  "duration": 215559372,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Invalid login",
  "description": "",
  "id": "loginfeature;invalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I open Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I navigate to FreeCam",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter invalid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_Browser()"
});
formatter.result({
  "duration": 3696185457,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_FreeCam()"
});
formatter.result({
  "duration": 3391083215,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_username_and_password()"
});
formatter.result({
  "duration": 3520365940,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_Login_button()"
});
formatter.result({
  "duration": 1740629244,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_see_error_message()"
});
formatter.result({
  "duration": 2182875415,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Valid username and invalid username",
  "description": "",
  "id": "loginfeature;valid-username-and-invalid-username",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I open Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I navigate to FreeCam",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter valid username and invalid password",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I see sign up link",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_Browser()"
});
formatter.result({
  "duration": 3647176694,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_FreeCam()"
});
formatter.result({
  "duration": 4675961235,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_username_and_invalid_password()"
});
formatter.result({
  "duration": 3520688063,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_Login_button()"
});
formatter.result({
  "duration": 1597379599,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_see_sign_up_link()"
});
formatter.result({
  "duration": 5442381178,
  "status": "passed"
});
});