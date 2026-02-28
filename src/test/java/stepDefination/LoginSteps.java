package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("I am on the login page");
    }
    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {

    }
    @When("I click the login button")
    public void i_click_the_login_button() {

    }
    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {

    }

}
