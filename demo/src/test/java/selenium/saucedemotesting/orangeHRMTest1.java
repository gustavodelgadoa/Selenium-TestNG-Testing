package selenium.saucedemotesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Test that automates entering username & password credentials + logging in +
 * confirms login.
 */
public class orangeHRMTest1 {
    WebDriver driver; // Reference variable of type WebDriver
    String credentialOne = "Admin"; // username credentials
    String credentialTwo = "admin123"; // password credentials

    @BeforeClass
    public void setUp() {
        System.out.println("Initial setup starting");
        driver = new ChromeDriver(); // Initializes driver variable with instance of ChromeDriver
    } // setUp

    @Test
    public void orangeHRMTest() throws InterruptedException {
        // Opens the website at URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Allows webpage to load for 2 seconds before trying to find elements
        // Variable created to allow for 2 seconds of no action
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        // Declaration of WebElement instance variables for username & password fields
        WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        userName.sendKeys(credentialOne);
        WebElement passWord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passWord.sendKeys(credentialTwo);

        // Declares variable for login button element & clicks it
        WebElement loginButton = driver.findElement(By.cssSelector("button.oxd-button"));
        loginButton.click();

        // Declares WebElement variable after waiting.
        // Once element is present, it passes the elements text into actualResult
        // variable.
        // Finally an assert tests if actualResult equals "Dashboard". This ensures it
        // correctly loaded the next page after login.
        WebElement dashboardText = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h6.oxd-text")));
        String actualResult = dashboardText.getText();
        String expectedResult = "Dashboard";
        Assert.assertEquals(actualResult, expectedResult);

    } // orangeHRMTest

    @AfterClass
    public void tearDown() {
        driver.quit(); // closes browser
    } // tearDown

} // Test1
