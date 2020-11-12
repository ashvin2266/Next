package Stepdefinations;

import BaseClass.DriverClass;
import PageObjectPattern.RegistrationPage;
import Utility.CommonMethod;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class Registration_sd extends DriverClass {
    RegistrationPage reg=new RegistrationPage();
    @Given("^user are on home page$")
    public void userAreOnHomePage() throws IOException {
        reg.verifyHomeUrl();
    }
    @When("^user click on my Account link$")
    public void userClickOnMyAccountLink() {
        reg.clickOnMyAccount();
    }
    @Then("^user see the login page$")
    public void userSeeTheLoginPage() throws IOException {
        reg.verifyLoginUrl();
    }
    @And("^user verify title of page  is \"([^\"]*)\"$")
    public void userVerifyTitleOfPageIs(String pageTitle)  {
      new CommonMethod().verifyPageTitle(pageTitle);
    }

    @When("^user click on register now button$")
    public void userClickOnRegisterNowButton() {
        reg.clickOnRegistrationNow();
    }

    @Then("^user see the account register page$")
    public void userSeeTheAccountRegisterPage() throws IOException {
        new CommonMethod().verifyUrl();
    }

    @Given("^user fill up valid detail in signup form$")
    public void userFillUpValidDetailInSignupForm() {
        reg.setTitle();
        reg.fillUpForm();
    }
    @Given("^user click  relevant information radiobutton as\"([^\"]*)\"$")
    public void userClickRelevantInformationRadiobuttonAs(String postBtn)  {
        reg.clickPostRadioBtn();
    }
    @When("^user click on register my account button$")
    public void userClickOnRegisterMyAccountButton() {
        reg.clickRegisterMyAccountBtn();
    }
    @Then("^user see the successfully registration message as \"([^\"]*)\"$")
    public void userSeeTheSuccessfullyRegistrationMessageAs(String thxmessage)  {
        reg.verifyThxMsg(thxmessage);
    }
    @And("^user see the welcome message as \"([^\"]*)\"$")
    public void userSeeTheWelcomeMessageAs(String message)  {
      reg.verifyMessage(message);
    }


}
