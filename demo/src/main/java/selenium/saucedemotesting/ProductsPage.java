package selenium.saucedemotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class ProductsPage extends BasePage {

    // Instance Variables
    private By productsLogo = By.cssSelector("span.title");

    // Finding web element and creating actual & expected string variables.
    public WebElement productsLogoText = find(productsLogo);
    public String actualResult = productsLogoText.getText();
    public String expectedResult = "Products";

  
    public boolean isProductsHeaderDisplayed() {
        return actualResult.equals(expectedResult);
    } // isProductsHeaderDisplayed
} // ProductsPage
