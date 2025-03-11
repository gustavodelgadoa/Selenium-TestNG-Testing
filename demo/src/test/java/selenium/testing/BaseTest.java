package selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    // Instance Variables
    protected WebDriver driver;
    protected BasePage basePage;
    private String url = "https://www.saucedemo.com/";
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
    } // setUp

    @AfterClass
    public void tearDown() {
        driver.quit();
    } // tearDown

} // BaseTest
