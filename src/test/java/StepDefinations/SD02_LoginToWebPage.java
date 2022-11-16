package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD02_LoginToWebPage {
    @Given("Enter username")
    public void enter_username() {
        System.out.println("Customer has entered username");
    }
    @Then("Enter password")
    public void enter_password() {
        System.out.println("Customer has entered password");
    }
    @Then("Click on login button")
    public void click_on_login_button() {
        System.out.println("Customer has clicked on loginbutton");
    }
    @Then("should be on login screen")
    public void should_be_on_login_screen() {
        System.out.println("Customer is on login screen");
    }

}
