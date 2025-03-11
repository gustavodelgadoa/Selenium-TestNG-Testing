package selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class ProductsPage extends BasePage {

    // Instance Variables
    private static By productsLogo = By.cssSelector("span.title");

    // Finding web element and creating actual & expected string variables.
    public static  WebElement productsLogoText = find(productsLogo);
    public static String actualResult = productsLogoText.getText();
    public static String expectedResult = "Products";

  
    public static boolean isProductsHeaderDisplayed() {
        return actualResult.equals(expectedResult);
    } // isProductsHeaderDisplayed
} // ProductsPage
