package PageObj;

import CommonFuntions.CommonFunctionality;
import cucumber.api.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParameterPassing {


    @FindBy(xpath = "//*[@id=\"headerContainer\"]/div[1]/div[4]/div/div[3]")
    WebElement myAccount;

    @FindBy(id = "EmailAddress")
    WebElement userID;

    @FindBy(how = How.NAME, using = "Password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginBtn\"]")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"accountlogout\"]/div[1]")
    WebElement signout;

    WebDriver driver;

// Parameter Passing Using WebElements

    public ParameterPassing(WebDriver driver) {
        this.driver = driver;
        driver = CommonFunctionality.selectBrowser("chrome");
        driver.get("https://www.cardfactory.co.uk/");
        PageFactory.initElements(driver, this);
        CommonFunctionality.waitTime(5);
    }

    public void clickOnMyAccount() {
        myAccount.click();
    }

    public void setUserIdAndPassword(String emailId, String pwd) {
        userID.sendKeys(emailId);
        password.sendKeys(pwd);
    }

    public void loginAction() {
        login.click();
    }

    public void signOut() {
        signout.click();
    }

    //Getting userId and password from feature file

    public void enterUserIdAndPassword(String userId, String pwd) {
        userID.sendKeys(userId);
        password.sendKeys(pwd);
    }

    public void giveUserIdandPassword(DataTable dataTable) {

        List<String> dataList = dataTable.asList(String.class);
        System.out.println("Length of array : " + dataList.size());
        for (int i = 0; i < dataList.size(); i++) {
            if (i == 0) {
                String userId = dataList.get(i);
                System.out.println("UserId : " + userId);
                userID.sendKeys(userId);
            } else {
                String pwd = dataList.get(i);
                System.out.println("password : " + pwd);
                password.sendKeys(pwd);
            }


        }

    }

    public void setUserCredientialsWithHeader(DataTable dataTable) {
        List<Map<String, String>> userCrediantiallist = dataTable.asMaps(String.class, String.class);
        System.out.println("DataTable list size:" + userCrediantiallist.size());
        Map<String, String> userCredentialMap;
        for (int i = 0; i < userCrediantiallist.size(); i++) {
            String userName= null;
            String pwd =null;
            userCredentialMap = userCrediantiallist.get(i);
            pwd=userCredentialMap.get("password");
            userName = userCredentialMap.get("username");
            userID.sendKeys(userName);
            System.out.println("username : "+userName);
            password.sendKeys(pwd);
            System.out.println("password : "+pwd);

        }
    }
}
