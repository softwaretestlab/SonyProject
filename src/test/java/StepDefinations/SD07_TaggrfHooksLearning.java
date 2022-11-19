package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD07_TaggrfHooksLearning {

    @Before("@First")
    public void RunBeforeThirdTest(){
        System.out.println("RunBeforeThirdTest");
    }
@Before("@Second")
public void RunBeforeFourthTest(){
    System.out.println("RunAfterFourthTest");
}
    @After("@First")
    public void RunAfterThirdTest(){
        System.out.println("RunAfterThirdTest");
    }
    @After("@Second")
    public void RunAfterFourthTest(){
        System.out.println("RunAfterFourthTest");
    }
    @Given("this is Third given")
    public void this_is_Third_given() {
        System.out.println("Third scenario Given");

    }
    @Then("This is Third then")
    public void this_is_Third_then() {
        System.out.println("Third scenario Then");
    }


    @Given("this is Fourth given")
    public void this_is_Fourth_given() {
        System.out.println("Fourth scenario Given");

    }
    @Then("This is Fourth then")
    public void this_is_Fourth_then() {
        System.out.println("Fourth scenario Then");
    }
}
