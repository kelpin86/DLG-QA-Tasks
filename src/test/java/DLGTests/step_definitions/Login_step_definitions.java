package DLGTests.step_definitions;


import DLGTests.pages.LoginPage;
import DLGTests.utilities.BrowserUtils;
import DLGTests.utilities.ConfigurationReader;
import DLGTests.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_step_definitions {

    LoginPage loginpage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("user enters valid username")
    public void user_enters_valid_username() {

        loginpage.username.sendKeys(ConfigurationReader.get("username"));
    }

    @Then("user enters valid password")
    public void user_enters_valid_password() {

        loginpage.password.sendKeys(ConfigurationReader.get("password"));
    }

    @Then("user clicks login button")
    public void user_clicks_login_button() {

        loginpage.login.click();
    }

    @Then("verify that {string} message is displayed")
    public void verify_that_message_is_displayed(String message) {

        BrowserUtils.waitForVisibility(loginpage.successful, 1);
        String successfulMessage = loginpage.successful.getText();
        Assert.assertEquals(message, successfulMessage);
    }

    @Given("user enters invalid username")
    public void user_enters_invalid_username() {

        loginpage.username.sendKeys("invalid");
    }

    @Given("user enters invalid password")
    public void user_enters_invalid_password() {

        loginpage.password.sendKeys("invalid");
    }

    @Then("verify that login button is disabled")
    public void verify_that_login_button_is_disabled() {

        Assert.assertFalse(loginpage.login.isEnabled());
    }


    @Then("user enters following {long}")
    public void user_enters_following(Long password) {

        loginpage.password.sendKeys(String.valueOf(password));
    }

    @Then("verify that error message is displayed")
    public void verify_that_error_message_is_displayed() {

        Assert.assertTrue(loginpage.error.isDisplayed());
    }

    @Then("user enters following {string}")
    public void user_enters_following(String password) {

        loginpage.username.sendKeys(password);
    }

}