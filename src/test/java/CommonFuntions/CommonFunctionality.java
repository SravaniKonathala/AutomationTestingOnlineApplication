package CommonFuntions;

import Utils.FilePaths;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctionality {

    static WebDriver driver;
    private  String propertyValue;

    public  static  WebDriver selectBrowser(String browType) {

        if ("chrome".equals(browType)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if ("firefox".equals(browType)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void waitTime(int wttime){

        driver.manage().timeouts().implicitlyWait(wttime, TimeUnit.SECONDS);
    }

    public static void closeBrowser(){
        driver.close();
    }

    public String readPropertyFile(String key) throws Exception {
        FileInputStream inputStream = new FileInputStream(new File(FilePaths.configFilePath));
        Properties properties = new Properties();
        properties.load(inputStream);
        propertyValue = properties.getProperty(key);
        return propertyValue;
    }

    public void takeScreenShot(String filename) throws IOException {

        TakesScreenshot takesScreenshot =  ((TakesScreenshot)driver);
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(FilePaths.configFilePath + filename);
        FileUtils.copyFile(srcFile, destinationFile);

    }

}
