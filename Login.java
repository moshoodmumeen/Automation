package Stepdefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login {
    @When("^I click on Login$")
    public void iClickOnLogin() throws Throwable {


    }

    @Given("^that i navigate to dev.giftrt.com$")
    public void thatINavigateToDevGiftrtCom() throws Throwable {

        WebDriver driver = new FirefoxDriver();

        String appUrl = "http://www.giftrete.com";
        driver.get(appUrl);
    }

    @And("^I entered the username$")
    public void iEnteredTheUsername() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I entered the password$")
    public void iEnteredThePassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I entered invalid username$")
    public void iEnteredInvalidUsername() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should not be able to log in$")
    public void iShouldNotBeAbleToLogIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I entered invalid password$")
    public void iEnteredInvalidPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I entered the username \"([^\"]*)\"$")
    public void iEnteredTheUsername(String username) throws Throwable {


    }

    @And("^I entered the password \"([^\"]*)\"$")
    public void iEnteredThePassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should be able to log in$")
    public void iShouldBeAbleToLogIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I logged out$")
    public void iLoggedOut() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
