package selenium.webelementstesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium.webelementsdemo.HomePage;

/**
 * 
 */
public class BaseTest {
    // Instance variables
    protected WebDriver driver;
    protected HomePage homePage;
    private String url = "https://demoqa.com/";


    @BeforeClass
    public void setUp() { 
        
    } // setUp

    @AfterClass
    public void tearDown() { 
        driver.quit();
    } // tearDown


} // BaseTest
