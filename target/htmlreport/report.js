$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/proj1.feature");
formatter.feature({
  "name": "Login to Elearning",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to elearning to send a message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to elearning site1",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinationclass.User_navigates_to_elearning_site1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationclass.user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send a message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinationclass.User_send_a_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});