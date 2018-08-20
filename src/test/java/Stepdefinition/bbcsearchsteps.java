package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;

public class bbcsearchsteps {
    WebDriver driver;

    @Given("^I navigate to bbc homepage$")
    public void iNavigateToBbcHomepage() throws Throwable {
        driver = new FirefoxDriver();

        String appUrl = "http://www.bbc.co.uk";
        driver.get(appUrl);
    }

    @When("^I click on the search box$")
    public void iClickOnTheSearchBox() throws Throwable {
        driver.findElement(By.id("orb-search-q")).click();
    }

    @And("^I type in \"([^\"]*)\"$")
    public void iTypeIn(String arg0) throws Throwable {
        driver.findElement(By.id("orb-search-q")).sendKeys("WorldCup");
    }

    @And("^I click on the search button$")
    public void iClickOnTheSearchButton() throws Throwable {
        //driver.findElement(By.className("se-searchbox__submit")).click();
        driver.findElement(By.id("se-searchbox-input-field")).sendKeys(Keys.ENTER);
    }

    @Then("^I should be able to see worldcup information$")
    public void iShouldBeAbleToSeeWorldcupInformation() throws Throwable {
        Thread.sleep(5000);
        Assert.assertEquals("https://www.bbc.co.uk/search?q=WorldCup", driver.getCurrentUrl());
    }
}
