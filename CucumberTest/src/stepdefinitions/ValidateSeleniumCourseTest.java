package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ValidateSeleniumCourseTest {
    protected static WebDriver driver;
    public static String driversPath = "Drivers";
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Before
    public void initializeChromeDriver() {
        String chromeDriverPath = System.getProperty("user.dir").
                replaceAll("CucumberAutomation", "");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nanis\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        logger.info("Chrome browser lunched successfully");
    }

    @Given("^user is navigating to Google$")
    public void navigatesToGoogle() {
        driver.get("https://www.google.com/");
        logger.info("Successfully navigated to google browsing");
    }

    @When("^user is doing search for Selenium course$")
    public void searchForSeleniumCourse() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.sendKeys(Keys.ENTER);
        logger.info("Browse for Selenium course and Click on Enter");
    }

    @Then("^user is validating the Homepage of Selenium course$")
    public void validateSeleniumWebDriverText() {
        boolean status = driver.findElement(By.xpath("//span[text()='Selenium']")).isDisplayed();
        //Assert.assertEquals(status, true);
        logger.info("Successfully validated the Homepage");
    }

    @After
    public void tearDown() {
        logger.info("Successfully closed the chrome browser.");
        driver.quit();
    }
}