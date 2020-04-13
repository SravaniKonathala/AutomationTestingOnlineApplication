package StepDefinitions;

import PageObj.ParameterPassing;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class ParameterPassingStepDef {


        ParameterPassing parameterPassing;
        WebDriver driver;

    @Given("^I open the application and Click My Account$")
    public void i_open_the_application_and_Click_My_Account(){

        parameterPassing = new ParameterPassing(driver);
        parameterPassing.clickOnMyAccount();
    }

    @When("^I give the UserName and Password$")
    public void i_give_the_UserName_and_Password() {
        parameterPassing.setUserIdAndPassword("sravanibtech07@gmail.com", "Jayathasiri24");
    }

    @When("^I click on Login$")
    public void i_click_on_login() {

        parameterPassing.loginAction();
    }

    @Then("^I click signOut$")
    public void i_click_signOut() {
        parameterPassing.signOut();
    }

    // Parameters passed from feature file

    @When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_username_and_password(String userId, String pwd) {
        parameterPassing.enterUserIdAndPassword(userId, pwd);
    }



    //Parameters passing from DataTable in feature file

    @When("^I enter <username> and <password>$")
    public void i_enter_username_and_password(DataTable dataTable)  {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       parameterPassing.giveUserIdandPassword(dataTable);
    }

// Parameter passing using datatable with header

    @When("^I enter the user credential with header$")
    public void i_enter_the_user_credential_with_header(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
    parameterPassing.setUserCredientialsWithHeader(dataTable);
    }





}
