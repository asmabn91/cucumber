package StepDefinition;


import io.cucumber.java.en.*;

public class _1_LoginSteps {


    @Given("Navigate to campus")
    public void navigate_to_campus() {
        System.out.println("Step 1");
    }
    @When("Enter username")
    public void enter_username() {
        System.out.println("Step 2");
    }
    @When("enter  password")
    public void enter_password() {
        System.out.println("Step 3");
    }
    @When("Click on login Button")
    public void click_on_login_button() {
        System.out.println("Step 4");
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("Step 5");
    }

}
