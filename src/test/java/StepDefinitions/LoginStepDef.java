package StepDefinitions;

import PageObj.LoginPOModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {

    WebDriver driver;
    LoginPOModel loginPOModel;

    @Given("^User is in \"([^\"]*)\"$")
    public void user_is_in(String homePageUrl)  {
        loginPOModel = new LoginPOModel(driver,homePageUrl);
        //System.out.println("LoginStepDef : user_is_in : Start :");

    }

    @When("^User Click on MyAccount$")
    public void user_Click_on_MyAccount()  {
        loginPOModel.clickOnMyAccount();

    }

    @When("^User Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_Enter_the_and(String userId, String pwd) {
        loginPOModel.setUserIdAndPassword(userId,pwd);

    }

    @Then("^User Click on Login$")
    public void user_Click_on_Login()  {
        loginPOModel.loginAction();
    }

    // New User registration


    @When("^User click on CreateAccount$")
    public void user_click_on_CreateAccount()   {
          loginPOModel.clickOnCreateAccount();
    }

    @When("^User Enter FirstName and LastName \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_Enter_FirstName_and_LastName_and(String firstName, String lastName)   {

          loginPOModel.enterFirstnameAndLastName(firstName, lastName);
    }

    @When("^User Enter the EmailId and Password \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_Enter_the_EmailId_and_Password_and(String emailId, String password)   {
         // System.out.println("LoginStepDef: user_Enter_the_EmailId_and_Password_and: Start");
          loginPOModel.enterEmailIdAndPassword(emailId,password );
        //System.out.println("LoginStepDef: user_Enter_the_EmailId_and_Password_and: Exit");
    }

    @When("^User Enter the ConfirmEmailID and Password \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_Enter_the_ConfirmEmailID_and_Password_and(String confEmailId, String confPassword)   {
        //System.out.println("LoginStepDef: user_Enter_the_ConfirmEmailID_and_Password_and: Start");
          loginPOModel.enterConfEmailIdAndPassword(confEmailId, confPassword);
        //System.out.println("LoginStepDef: user_Enter_the_ConfirmEmailID_and_Password_and: Exit");
    }

    @When("^User select Address Manually$")
    public void user_select_Address_Manually()   {

          loginPOModel.enterAddressmanually();
    }

    @When("^User enter Address \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_Address_and(String addressline1, String city, String country, String usrPostCode)   {

          loginPOModel.fillAddress(addressline1, city, country, usrPostCode);
    }

    @When("^User click on Register$")
    public void user_click_on_Register()   {

          loginPOModel.clickOnCreateAcct();
    }

    @Then("^User get the success message$")
    public void user_get_the_success_message()   {


    }


}
