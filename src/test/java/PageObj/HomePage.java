package PageObj;

import CommonFuntions.CommonFunctionality;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    @FindBy(xpath = "//*[@id=\"headerContainer\"]/div[1]/div[4]/div/div[3]")
    WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"newcustomer\"]/div/a")
    WebElement clickCreateAccount;

    @FindBy(name = "FirstName")
    WebElement enterFirstName;

    @FindBy(name = "LastName")
    WebElement enterLastName;

    @FindBy(id = "EmailAddress")
    WebElement enterEmailID;

    @FindBy(name = "ConfirmEmailAddress")
    WebElement enterConfirmEmail;

    @FindBy(name = "Password")
    WebElement enterPassword;

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

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/form/div[2]/div/div[4]/span")
    WebElement getErrorMsg;

    @FindBy(xpath = "//*[@id=\"loginBtn\"]")
    WebElement clickOnLogin;

    WebDriver driver;
    //CommonFunctionality commonFunctionality = new CommonFunctionality();

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver = CommonFunctionality.selectBrowser("chrome");
        driver.get("https://www.cardfactory.co.uk/");

        //Initialise Elements
        PageFactory.initElements(driver, this);
       CommonFunctionality.waitTime(5);
    }

    public void clickMyAccount() {
        myAccount.click();
    }

    public void clickOnCreateAccount() {
        clickCreateAccount.click();
    }

    public void setEnterFirstName() {
        enterFirstName.sendKeys("firstname");
    }

    public void setEnterLastName() {
        enterLastName.sendKeys("Kandregula");
    }

    public void setEnterEmailID() {
        enterEmailID.sendKeys("sravanibtech07@gmail.com");
    }

    public void setEnterConfirmEmail() {
        enterConfirmEmail.sendKeys("sravanibtech07@gmail.com");
    }

    public void setEnterPassword() {
        enterPassword.sendKeys("Jayathasiri24");
    }

    public void setEnterConfPassword() {
        enterConfPassword.sendKeys("Jayathasiri24");
    }


    public void setSelectAddressManually() {
        address.click();
    }

    public void giveAddressLine1() {
        addressLine1.sendKeys("98, Cityview, CenterWay, Axon Place");
    }

    public void giveCity() {
        cityName.sendKeys("Essex, London");
    }

    public void giveCountry() {
        countryName.sendKeys("England");
    }


    public void givePostcode() {
        postcode.sendKeys("IG1 1NH");
    }


    public void clickOnSubmitButton() {
        submit.click();
    }

    public void getErrorOrSuccessMsg() {
        String message = getErrorMsg.getText();
        System.out.println("Message Displayed:" + message);
    }

    public void setClickOnLogin(){

        clickOnLogin.click();
    }

}
