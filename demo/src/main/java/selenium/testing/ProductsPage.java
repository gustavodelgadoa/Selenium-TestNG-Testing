package selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class ProductsPage extends BasePage {

    // Instance Variables
    private By productsLogo = By.cssSelector("span.title");

    // Finding web element and creating actual & expected string variables.
    WebElement productsLogoText = find(productsLogo);
    String actualResult = productsLogoText.getText();
    String expectedResult = "Products";

    /**
     * Returns True or False if products page is displayed.
     * 
     * @return
     */
    public boolean isProductsHeaderDisplayed() {
        return actualResult.equals(expectedResult);
    } // isProductsHeaderDisplayed
} // ProductsPage
