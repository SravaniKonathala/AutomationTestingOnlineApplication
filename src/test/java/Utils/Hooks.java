package Utils;

import CommonFuntions.CommonFunctionality;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

   @Before
    public void setUp(){

       //CommonFunctionality.selectBrowser("chrome");
    }

   @After
    public void tearDown(){

     CommonFunctionality.closeBrowser();
    }
}
