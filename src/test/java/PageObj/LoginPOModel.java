package PageObj;

import CommonFuntions.CommonFunctionality;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPOModel {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"headerContainer\"]/div[1]/div[4]/div/div[3]")
    WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"newcustomer\"]/div/a")
    WebElement clickCreateAccount;

    @FindBy(id = "EmailAddress")
    WebElement userID;

    @FindBy(how = How.NAME, using = "Password")
    WebElement password;

    @FindBy(name = "FirstName")
    WebElement enterFirstName;

    @FindBy(name = "LastName")
    WebElement enterLastName;

    @FindBy(xpath = "//*[@id=\"loginBtn\"]")
    WebElement login;

    @FindBy(name = "ConfirmEmailAddress")
    WebElement enterConfirmEmail;

    @FindBy(name = "ConfirmPassword")
    WebElement enterConfPassword;

    @FindBy(id = "addressSearchText")
    WebElement enterAddress;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/form/div[1]/div/div[8]/div[1]/div[4]/a")
    WebElement address;

    @FindBy(name = "Address1")
    WebElement addressLine1;

    @FindBy(name = "City")
    WebElement cityName;

    @FindBy(name = "County")
    WebElement countryName;

    @FindBy(name = "PostCode")
    WebElement postcode;

    @FindBy(name = "button")
    WebElement submit;


    public  LoginPOModel(WebDriver driver, String url){
        this.driver = driver;
        driver = CommonFunctionality.selectBrowser("chrome");
        driver.get(url);
        PageFactory.initElements(driver, this);
        CommonFunctionality.waitTime(5);
    }

    public void clickOnMyAccount(){
        myAccount.click();
    }

    public void setUserIdAndPassword(String emailId, String pwd){
        userID.sendKeys(emailId);
        password.sendKeys(pwd);
    }

    public void loginAction(){
        login.click();
    }

    public void clickOnCreateAccount(){

        clickCreateAccount.click();
        CommonFunctionality.waitTime(5);
    }

    public void enterFirstnameAndLastName(String firstName, String lastName){
        enterFirstName.sendKeys(firstName);
        enterLastName.sendKeys(lastName);
    }

    public void enterEmailIdAndPassword(String usrEmailId, String usrPassword){
        userID.sendKeys(usrEmailId);
        password.sendKeys(usrPassword);
    }

    public void enterConfEmailIdAndPassword(String confEmailId, String confPassword){
        enterConfirmEmail.sendKeys(confEmailId);
        enterConfPassword.sendKeys(confPassword);

    }

    public void enterAddressmanually(){
        address.click();
    }

    public void fillAddress(String addressline1, String city, String country, String usrPostCode){
        addressLine1.sendKeys(addressline1);
        cityName.sendKeys(city);
        countryName.sendKeys(country);
        postcode.sendKeys(usrPostCode);
    }

    public void clickOnCreateAcct(){
        submit.click();
    }

}
