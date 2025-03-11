package selenium.saucedemotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Parent to all Page Object Classes (Superclass). It's purpose is to provide
 * reusable methods for interacting
 * with web elements, so other page classes can inherit from it.
 */
public class BasePage {
    // Creates a WebDriver driver instance that can be shared across all page
    // classes.
    public static WebDriver driver;

    /**
     * Assigns a WebDriver instance to the driver variable.
     * 
     * @param driver
     */
    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    } // setDriver

    /**
     * Wrapper method for code reusability, find() easier to call than
     * (driver.findElement(locator))
     * 
     * @param locator
     * @return
     */
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    } // find

    /**
     * Method helps eliminate repetitive code such as findElemet() + sendKeys()
     * methods.
     * Method uses find method & clears elements input field, then it sends key to
     * the elements input field
     * after being cleared.
     * 
     * @param locator
     * @param text
     */
    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    } // set

    /**
     * Clicks on Web element.
     * 
     * @param locator
     */
    protected void click(By locator) {
        find(locator).click();
    } // click

} // BasePage
