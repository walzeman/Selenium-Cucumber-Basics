$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature of Facebook",
  "description": "This feature deals with the functionality of the application.",
  "id": "login-feature-of-facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "login-feature-of-facebook;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "i navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i enter the username as admin and password as admin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i should see the user form page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDef.i_navigate_to_the_login_page()"
});
formatter.result({
  "duration": 9487198665,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDef.i_enter_the_username_as_admin_and_password_as_admin()"
});
formatter.result({
  "duration": 2236098298,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDef.i_click_the_login_button()"
});
formatter.result({
  "duration": 2271643638,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDef.i_should_see_the_user_form_page()"
});
formatter.result({
  "duration": 2343211695,
  "status": "passed"
});
});