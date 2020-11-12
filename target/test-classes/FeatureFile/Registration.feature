Feature: user can create an new account
  Scenario: user register his valid detail to create an account
    Given user are on home page
    When user click on my Account link
    Then user see the login page
    And  user verify title of page  is "Sign In | My Account | Next Directory Online"
    When user click on register now button
    Then user see the account register page
    Given user fill up valid detail in signup form
    Given user click  relevant information radiobutton as"post"
    When user click on register my account button
    Then user see the successfully registration message as "Thank you for registering."
    And  user see the welcome message as "Welcome To Next"

