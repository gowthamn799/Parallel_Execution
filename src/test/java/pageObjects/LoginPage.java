package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Login;

public class LoginPage {
WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[text()='standard_user']")
    private WebElement usernameGetText;

    @FindBy(xpath = "//div[text()='secret_sauce']")
    private WebElement passWordGetText;
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userNameInput;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passWordInput;
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public String getUsernameGetText() {
        return usernameGetText.getText();
    }
    public String getPassWordGetText() {
        return passWordGetText.getText();
    }
    public void setUserNameInput(String username) {
        userNameInput.sendKeys(username);
    }
    public void setPassWordInput(String password) {
        passWordInput.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }
}
