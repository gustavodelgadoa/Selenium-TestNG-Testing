package selenium.saucedemotesting;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest{
    
    @Test
    public void productsPageVerification() { 
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage();
        productsPage.isProductsHeaderDisplayed();
    } // productsPageVeriication
}
