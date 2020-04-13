package StepDefinitions;

import PageObj.HomePage;
import PageObj.HomePageWithVariables;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageStepDef {

    WebDriver driver;
    //HomePage homePage = new HomePage(driver);
    HomePageWithVariables homePage =new HomePageWithVariables(driver);

    @Given("^I am on HomePage$")
    public void i_am_on_HomePage() {
    }

    @When("^I am Clicking On MyAccount$")
    public void i_am_Clicking_On_MyAccount() {
        homePage.clickMyAccount();
    }

    @When("^I click on CreateAccount$")
    public void i_click_on_CreateAccount() {
        homePage.clickOnCreateAccount();
    }

    @When("^I Enter FirstName$")
    public void i_Enter_FirstName() {
        homePage.setEnterFirstName();
    }

    @When("^I Enter LastName$")
    public void i_Enter_LastName() {
        homePage.setEnterLastName();
    }

    @When("^I Enter EmailID$")
    public void i_Enter_EmailID() {
        homePage.setEnterEmailID();
    }

    @When("^I Enter ConfirmEmailID$")
    public void i_Enter_ConfirmEmailID() {
        homePage.setEnterConfirmEmail();
    }

    @When("^I Enter Password$")
    public void i_Enter_Password() {
        homePage.setEnterPassword();
    }

    @When("^I Enter ConfPassword$")
    public void i_Enter_ConfPassword() {
        homePage.setEnterConfPassword();
    }


    @When("^I select Address$")
    public void i_select_Address() {
        homePage.setSelectAddressManually();
    }

    @When("^I enter AddressLine(\\d+)$")
    public void i_enter_AddressLine(int arg1) {
        homePage.giveAddressLine1();
    }

    @When("^I enter Town/City$")
    public void i_enter_Town_City() {
        homePage.giveCity();
    }

    @When("^I enter Country$")
    public void i_enter_Country() {
        homePage.giveCountry();
    }


    @When("^I enter PostCode$")
    public void i_enter_PostCode() {
        homePage.givePostcode();
    }

    @When("^I Click on Register$")
    public void i_Click_on_Register() {
        homePage.clickOnSubmitButton();
    }

    @Then("^And I get message$")
    public void and_I_get_message() {
        homePage.getErrorOrSuccessMsg();
    }

    @Then("^I click LoginIn$")
    public void i_click_LoginIn()  {
        System.out.println("LoginPageStepDefinition : i_click_LoginIn: Start ");
        homePage.setClickOnLogin();
        System.out.println("LoginPageStepDefinition : i_click_LoginIn: Exit ");

    }

}
