package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class ValidateNewUserRegistrationTest {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Given("^user navigates to new registration page$")
    public void navigateToRegistrationPage() {
        logger.info("User navigates to Registration page Successfully!");
    }

    @When("^user enters the data on the page$")
    public void enterUserData(DataTable dataTable) {
        List<List<String>> userData = dataTable.raw();
        String getUsername = userData.get(0).get(0);
        String getPassword = userData.get(0).get(1);

        logger.info(getUsername + " and " + getPassword);
    }
}
