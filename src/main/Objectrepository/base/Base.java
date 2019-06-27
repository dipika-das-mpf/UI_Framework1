package base;

import com.aventstack.extentreports.utils.FileUtil;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public WebDriver initializeDriver() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis =new FileInputStream("/Users/dipika.das/Documents/Workspace/PVT_UI_Framework1/src/main/Objectrepository/InputData/Data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","/Users/dipika.das/Documents/Workspace/PVT_UI_Framework1/src/Drivers/chromedriver");
            driver = new ChromeDriver();
        }

        else if (browserName.equals("firefox"))
        {
            driver =new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        return driver;
    }

    public void getScreenshot()
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src, new File("C://test//screenshot.png"));

    }
}
