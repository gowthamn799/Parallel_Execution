package testpacks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import stepDefination.LoginSteps;
import utils.BaseClass;
import utils.JsonReader;

public class LoginTest extends BaseClass {
    @DataProvider(name = "loginData", parallel = true)
    public Object[][] getData() {
        return JsonReader.getLoginData();
    }
    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        System.out.println("Executing login test...");
        // Here you can add your test logic, such as interacting with the login page,
        // entering credentials, and verifying the login functionality.
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUsernameGetText();
        loginPage.getPassWordGetText();
        loginPage.setUserNameInput(username);
        loginPage.setPassWordInput(password);
        loginPage.clickLoginButton();
    }
}
