$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "user can create an new account",
  "description": "",
  "id": "user-can-create-an-new-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7646861900,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "user register his valid detail to create an account",
  "description": "",
  "id": "user-can-create-an-new-account;user-register-his-valid-detail-to-create-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user are on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user click on my Account link",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user see the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user verify title of page  is \"Sign In | My Account | Next Directory Online\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on register now button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user see the account register page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user fill up valid detail in signup form",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user click  relevant information radiobutton as\"post\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user click on register my account button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user see the successfully registration message as \"Thank you for registering.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user see the welcome message as \"Welcome To Next\"",
  "keyword": "And "
});
formatter.match({
  "location": "Registration_sd.userAreOnHomePage()"
});
formatter.result({
  "duration": 208999200,
  "status": "passed"
});
formatter.match({
  "location": "Registration_sd.userClickOnMyAccountLink()"
});
formatter.result({
  "duration": 2780924900,
  "status": "passed"
});
formatter.match({
  "location": "Registration_sd.userSeeTheLoginPage()"
});
formatter.result({
  "duration": 5575500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign In | My Account | Next Directory Online",
      "offset": 31
    }
  ],
  "location": "Registration_sd.userVerifyTitleOfPageIs(String)"
});
formatter.result({
  "duration": 4899000,
  "status": "passed"
});
formatter.match({
  "location": "Registration_sd.userClickOnRegisterNowButton()"
});
formatter.result({
  "duration": 1061126700,
  "status": "passed"
});
formatter.match({
  "location": "Registration_sd.userSeeTheAccountRegisterPage()"
});
formatter.result({
  "duration": 3291200,
  "status": "passed"
});
formatter.match({
  "location": "Registration_sd.userFillUpValidDetailInSignupForm()"
});
formatter.result({
  "duration": 1580672900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "post",
      "offset": 48
    }
  ],
  "location": "Registration_sd.userClickRelevantInformationRadiobuttonAs(String)"
});
formatter.result({
  "duration": 278086200,
  "status": "passed"
});
formatter.match({
  "location": "Registration_sd.userClickOnRegisterMyAccountButton()"
});
formatter.result({
  "duration": 2553807300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you for registering.",
      "offset": 51
    }
  ],
  "location": "Registration_sd.userSeeTheSuccessfullyRegistrationMessageAs(String)"
});
formatter.result({
  "duration": 19021800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome To Next",
      "offset": 33
    }
  ],
  "location": "Registration_sd.userSeeTheWelcomeMessageAs(String)"
});
formatter.result({
  "duration": 37037700,
  "status": "passed"
});
formatter.after({
  "duration": 1006802500,
  "status": "passed"
});
});