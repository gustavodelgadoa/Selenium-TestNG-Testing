package selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
    WebDriver driver; // Reference variable of type WebDriver

    @BeforeClass
    public void setUp() {
        System.out.println("Initial setup starting");
        driver = new ChromeDriver(); // Initializes driver variable with isntance of ChromeDriver
    } // setUp

    @Test
    public void orangeHRMTest() {
        // Opens the website at URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    } // orangeHRMTest

    @AfterClass
    public void tearDown() {
        driver.quit(); // closes browser
    } // tearDown

} // Test1
