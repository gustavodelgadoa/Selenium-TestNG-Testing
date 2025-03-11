package selenium.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void errorMessageTest() {
        loginPage.login("null", "null");
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualErrorMessage.contains("Epic sadface"));
    } // errorMessageTest
} // LoginTest
