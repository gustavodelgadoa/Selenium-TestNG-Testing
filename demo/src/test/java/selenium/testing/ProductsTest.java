package selenium.testing;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest{
    
    @Test
    public void productsPageVerification() { 
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage.isProductsHeaderDisplayed();
    } // productsPageVeriication
}
