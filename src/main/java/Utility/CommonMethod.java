package Utility;

import BaseClass.DriverClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonMethod extends DriverClass {

    public void selectByIndexFromDropDown(WebElement element, int index) {
        element.click();
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void selectByVisibleTextFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByVisibleText(string);
    }
    public void selectByValueFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByValue(string);
    }
    public void verifyPageTitle(String title){
        String actualPageTitle=driver.getTitle();
        Assert.assertEquals(title,actualPageTitle);
        log.info("Expected page title---> " + title+"is verified with Actual Page title---> "+actualPageTitle);
    }
    public void verifyUrl() throws IOException {
      String expectedUrl=getProperty("registerPageUrl");
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualURL);

    }
    public String StringrandomString() {
        String generatedString1= RandomStringUtils.randomAlphabetic(4);
        return (generatedString1);
    }







}
