package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registrationsteps {
    WebDriver driver;

    @Given("^I navigate to giftrete website$")
    public void iNavigateToGiftreteWebsite() throws Throwable {
        driver = new FirefoxDriver();

        String appUrl = "http://www.giftrete.com";
        driver.get(appUrl);
    }


    @And("^I click on register$")
    public void iClickOnRegister() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/nav[1]/div/div/div[2]/ul/li[3]/a")).click();

    }

    @And("^I entered my First Name \"([^\"]*)\"$")
    public void iEnteredMyFirstName(String arg0) throws Throwable {
        driver.findElement(By.name("first_name")).sendKeys("Mumeen");
    }


    @And("^I entered my Last Name \"([^\"]*)\"$")
    public void iEnteredMyLastName(String arg0) throws Throwable {
        driver.findElement(By.name("last_name")).sendKeys("Moshood");
    }

    @And("^I entered my email address \"([^\"]*)\"$")
    public void iEnteredMyEmailAddress(String arg0) throws Throwable {
        driver.findElement(By.name("email")).sendKeys("mumeenmoshood@gmail.com");
    }

    @And("^I entered my password \"([^\"]*)\"$")
    public void iEnteredMyPassword(String arg0) throws Throwable {
        driver.findElement(By.id("password")).sendKeys("Ramota123");
    }

    @And("^I confirmed the password \"([^\"]*)\"$")
    public void iConfirmedThePassword(String arg0) throws Throwable {
        driver.findElement(By.id("confirm_password")).sendKeys("Ramota123");
    }

    @And("^I clicked on the Captcha$")
    public void iClickedOnTheCaptcha() throws Throwable {
        //driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();

    }

    @And("^I click on signup$")
    public void iClickOnSignup() throws Throwable {
        //driver.findElement(By.className("le-button huge")).click();
    }

    @Then("^I should be registered successfully$")
    public void iShouldBeRegisteredSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}