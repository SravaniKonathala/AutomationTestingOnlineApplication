package StepDefinitions;

import PageObj.UsingResourceDirectory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ResourceDirectoryStepDef {

    WebDriver driver;
    UsingResourceDirectory obj = new UsingResourceDirectory();

    public ResourceDirectoryStepDef() throws IOException {
    }

    @Given("^User open the application$")
    public void user_open_the_application() throws Throwable {
    }

    @When("^User go to my accountpage to Login$")
    public void user_go_to_my_accountpage_to_Login() throws Throwable {
        obj.goToMyAccount();
    }

    @When("^User give login credientials$")
    public void user_give_login_credientials() throws Throwable {
        obj.enterUserId("username" ,"password");
    }

    @Then("^User submit to Login$")
    public void user_submit_to_Login() throws Throwable {
        obj.submitToLogin();
    }
}
