package selenium.saucedemotesting;

import org.openqa.selenium.By;

/**
 * 
 * Extends BasePage so it can use its methods.
 */
public class LoginPage extends BasePage {
    // Instance Variables
    private By usernameField = By.name("user-name");
    private By passwordField = By.name("password");
    private By loginButton = By.name("login-button");
    private By errorMessage = By.tagName("h3");

    /**
     * Convenience method, performs all login actions.
     * 
     * @param username First String of text that will be passed in & entered in
     *                 username input field.
     * @param password Second String of text that will be passed in & entered in
     *                 password input field.
     */
    public void login(String username, String password) {
        set(usernameField, username);
        set(passwordField, password);
        click(loginButton);
    } // login

    /**
     * Method returns the error message element's text.
     * 
     * @return returns error message in text format.
     */
    public String getErrorMessage() {
        return find(errorMessage).getText();
    } // getErrorMessage

} // LoginPage
