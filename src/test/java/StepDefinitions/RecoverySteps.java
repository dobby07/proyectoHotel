package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RecoverySteps {

    @Given("user is on the password recovery page")
    public void user_is_on_password_recovery_page() {
        System.out.println("Inside Step - user is on the password recovery page");
    }

    @When("user enters their registered email")
    public void user_enters_registered_email() {
        System.out.println("Inside Step - user enters their registered email");
    }

    @And("clicks on the recovery button")
    public void clicks_on_recovery_button() {
        System.out.println("Inside Step - clicks on the recovery button");
    }

    @Then("user receives a password reset email")
    public void user_receives_password_reset_email() {
        System.out.println("Inside Step - user receives a password reset email");
    }

    @When("user enters an invalid email")
    public void user_enters_invalid_email() {
        System.out.println("Inside Step - user enters an invalid email");
    }

    @Then("user sees an error message")
    public void user_sees_error_message() {
        System.out.println("Inside Step - user sees an error message");
    }
}