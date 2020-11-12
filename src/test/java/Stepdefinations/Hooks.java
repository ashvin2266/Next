package Stepdefinations;

import BaseClass.DriverClass;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Hooks {
    DriverClass driverC=new DriverClass();
    WebDriver driver;
    @Before
    public void getBrowser() throws IOException {
        driverC.openBrowser();
    }
    @After
    public void tearDown(Scenario scenario) throws IOException {

            if (scenario.isFailed()) {
                Reporter.addStepLog("scenario is Failed");
                Reporter.getExtentReport().createTest(scenario.getName());
                String screenShotPath= driverC.TakeAscreenShot(scenario).toString();
                System.out.println(screenShotPath);
                try {
                    Reporter.addScreenCaptureFromPath("C:/Users/ashvi/Next/target/screenshots");
                    } catch (IOException e) {
                    e.printStackTrace();
                }
                Reporter.getExtentReport();
            }
            driverC.closeBrowser();

    }

}
