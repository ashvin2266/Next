package BaseClass;

import Utility.CommonMethod;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverClass {

    public static WebDriver driver;
    public static Logger log=LogManager.getLogger(DriverClass.class.getName());
    public  void openBrowser() throws IOException {
        String Browser= CommonMethod.getProperty("browser");
        if (Browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            log.info("Crome Browser is opened");
        }
        else if (Browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            log.info("Firefox Browser is opened");
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(CommonMethod.getProperty("url"));
    }
    public void closeBrowser(){
        driver.close();
        log.info ("Browser is closed");
    }
    public static String getProperty(String key) throws IOException {
        Properties prop=new Properties();
        FileInputStream file=new FileInputStream("src/main/java/PropertyFile/config.properties");
        prop.load(file);
        return prop.getProperty(key);
    }
    public  String TakeAscreenShot( Scenario scenario) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String  ScreenShotPath = "./target/screenshots/"+scenario.getName()+dateName+".png";
        Reporter.addScreenCaptureFromPath(ScreenShotPath);
        try {
            FileUtils.copyFile(srcFile, new File("./target/screenshots/"+scenario.getName()+dateName+".png"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return ScreenShotPath;
    }
    public static void takeElementsScreenShot(WebElement element, String fileName) throws IOException {
        File srcFile=element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("./target/ScreenShot/"+fileName+".png"));
    }

}
