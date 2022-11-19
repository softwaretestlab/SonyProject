package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD06_HooksLearning {

    @Before
    public void StartTest(){
        System.out.println("Scenario's Started");
    }
    @After
    public void EndTest(){
        System.out.println("Scenario's Ended");
    }
    @Given("this is first given")
    public void this_is_first_given() {
        System.out.println("First scenario Given");

    }
    @Then("This is first then")
    public void this_is_first_then() {
        System.out.println("First scenario Then");
    }
    @Given("this is second given")
    public void this_is_second_given() {
        System.out.println("second scenario Given");

    }
    @Then("This is second then")
    public void this_is_second_then() {
        System.out.println("second scenario Then");
    }
}
