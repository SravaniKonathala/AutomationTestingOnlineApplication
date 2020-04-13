package PageObj;

import CommonFuntions.CommonFunctionality;
import Utils.ReadResourceFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.*;
import java.util.Properties;

public class UsingResourceDirectory {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"headerContainer\"]/div[1]/div[4]/div/div[3]")
    WebElement myaccount;

    @FindBy(name = "EmailAddress")
    WebElement loginId;

    @FindBy(name = "Password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginBtn\"]")
    WebElement login;

    public UsingResourceDirectory() throws IOException {
        String selectBrowser;
       // WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
        //this.driver = driver;
        selectBrowser = ReadResourceFile.getBrowserFromResourceFile();
        System.out.println("selectBrowser : "+selectBrowser);
        driver = CommonFunctionality.selectBrowser(selectBrowser);
        PageFactory.initElements(driver, this);
        driver.get("https://www.cardfactory.co.uk/");
    }
    public void goToMyAccount(){
        myaccount.click();
    }
    public void enterUserId(java.lang.String email , java.lang.String pwd) throws Exception
    {
        /*FileInputStream fileInputStream = new FileInputStream("src/test/resource.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);*/
        Properties properties= ReadResourceFile.loadResource();
        java.lang.String eMailId = properties.getProperty(email);
        String passwd = properties.getProperty(pwd);
       System.out.println("Username:" +eMailId);
       System.out.println("Password:" +passwd);
        loginId.sendKeys(eMailId);
        password.sendKeys(passwd);

    }


    public void submitToLogin(){
        login.click();
    }

}
