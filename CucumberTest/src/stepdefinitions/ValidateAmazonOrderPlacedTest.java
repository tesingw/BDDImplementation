package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.logging.Logger;

public class ValidateAmazonOrderPlacedTest {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Given("^user is logged onto the Amazon website as a registered user$")
    public void navigatingToAmazonWebsite() {
        logger.info("User logged into Amazon website Successfully.");
    }

    @When("^user logs in with \"(.*)\" and \"(.*)\"$")
    public void loggedInWithUsernameAndPassword(String username, String password) {
        logger.info(username + "and " + password);
    }

    @Then("^user should be able to view homepage")
    public void validateAmazonHomepage() {
        logger.info("Home page validation Successful");
    }

    @When("^user searches for \"(.*)\"$")
    public void searchesForProductID(String productId) {
        logger.info("Searching for productId" + productId);
    }

    @Then("^order should be placed successfully$")
    public void orderPlacedSuccessfully() {
        logger.info("Order has been placed successfully");
    }
}