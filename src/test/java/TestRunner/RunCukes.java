package TestRunner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/FeatureFile",
        glue = "Stepdefinations",
        plugin = {       "pretty","html:test-output",
        "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"
}


)
public class RunCukes {
    @AfterClass
    public static void setup() {
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/main/resources/extentConfig.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }
}
