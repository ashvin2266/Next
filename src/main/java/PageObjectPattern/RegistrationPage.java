package PageObjectPattern;

import BaseClass.DriverClass;
import Utility.CommonMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class RegistrationPage extends DriverClass {
    @FindBy(xpath = "//a[@title='Sign in to view account details']")
    WebElement myAccountLink;
    @FindBy(xpath = "//a[@class='nxbtn primary large']")
    WebElement registerNowBtn;
    @FindBy(css = "#Title")
    WebElement title;
    @FindBy(id = "FirstName")
    WebElement firstname;
    @FindBy(id = "LastName")
    WebElement lastname;
    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Password")
    WebElement password;
    @FindBy(id = "DobDate")
    WebElement dateOfBirth;
    @FindBy(id = "PhoneNumber")
    WebElement phoneNumber;
    @FindBy(id = "HouseNumberOrName")
    WebElement houseNo;
    @FindBy(id = "Postcode")
    WebElement postcode;
    @FindBy(id = "SearchPostcode")
    WebElement searchPostcode;
    @FindBy(css = "#ChkByPost")
    WebElement postRadioBtn;
    @FindBy(id = "SignupButton")
    WebElement signUpBtn;
    @FindBy(xpath = "//p[@class='thank-register']")
    WebElement thxMessage;
    @FindBy(xpath = "//div[@class='col-xs-12']/h2")
    WebElement welcomeMessage;




    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }
    public void verifyHomeUrl() throws IOException {
        String expectedUrl=getProperty("url");
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        log.info("Expected Url is--->"+expectedUrl);
        log.info("Actual Url is--->"+ actualUrl);
        log.info("Home page Url is verified ");
    }
    public void clickOnMyAccount(){
        myAccountLink.click();
    }
    public void clickOnRegistrationNow(){
        registerNowBtn.click();
    }
    public void setTitle(){
        new CommonMethod().selectByVisibleTextFromDropDown(title,"Mr");
    }
    public void fillUpForm(){
        firstname.sendKeys("Abc");
        lastname.sendKeys("Test");
        String emailid=new CommonMethod().StringrandomString()+"@gmail.com";
        email.sendKeys(emailid);
        password.sendKeys("abcd1234");
        dateOfBirth.sendKeys("09 02 85");
        phoneNumber.sendKeys("0123456789");
        houseNo.sendKeys("25");
        postcode.sendKeys("TW45AE");
        searchPostcode.click();
    }
    public void clickPostRadioBtn(){
        postRadioBtn.click();
    }
    public void clickRegisterMyAccountBtn(){
        signUpBtn.click();
   }
    public void verifyLoginUrl() throws IOException {
        String expectURL=getProperty("loginUrl");
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(expectURL,actualURL);
        log.info("Expected Url is--->"+expectURL+ " is verified with Actual Url---> "+actualURL);
    }
    public void verifyThxMsg(String thxMsg){
       String actualThxMsg= thxMessage.getText();
       Assert.assertEquals(thxMsg,actualThxMsg);
        log.info("Expected Thank you message is--->"+thxMsg+ " is verified with Actual Thank you message---> "+actualThxMsg);

    }
    public void verifyMessage(String message){
        String actualMsg= welcomeMessage.getText();
        Assert.assertEquals(message,actualMsg);
        log.info("Expected welcome message is--->"+message+ " is verified with Actual welcome message---> "+actualMsg);

    }


}
