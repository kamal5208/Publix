package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.Login;


public class LoginSteps {
    WebDriver driver = Hooks.driver;

    @Given("^a user is on the home page$")
    public void navigateToLoginPage() {
        new Login(driver)
                .navigateToLoginPage();

    }

    @When("^click on LOGIN button$")
    public void clickOnLogInButton() {
        new Login(driver)
                .clickOnLogInButton();
    }

    @When("^user enters emailAddress \"(.+?)\" and password \"(.+?)\"$")
    public void enterUserCredentials(String emailAddress, String password) {
        new Login(driver)
                .enterUserCredentials(emailAddress,password);
    }

    @And("^click on LOG IN button$")
    public void clickedOnLogin() {
        new Login(driver)
                .clickedOnLogin();
    }
    @When("^user click on login button upon entering credentials$")
    public void userClickOnLoginButtonUponEnteringCredentials(DataTable table) {
        new Login(driver)
                .userClickOnLoginButtonUponEnteringCredentials(table);

        }


    @Then("^user is navigated to homepage$")
    public void validateUserIsLoggedInSuccessfully() {
        new Login(driver)
                .validateUserIsLoggedInSuccessfully();

    }

}
