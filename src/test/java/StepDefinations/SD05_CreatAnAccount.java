package StepDefinations;

import SeleniumCode.AT02_CreatAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD05_CreatAnAccount {
    @Given("user navigates to Create and account screen")
    public void user_navigates_to_create_and_account_screen() throws IOException {
        AT02_CreatAnAccount.NavToCreateAcc();
    }
    @Then("Enter data {string}, {string}, {string}")
    public void enter_data(String FirstName,String lastname,String email_address) {
        AT02_CreatAnAccount.EnterAccData(FirstName,lastname,email_address);

    }

}
