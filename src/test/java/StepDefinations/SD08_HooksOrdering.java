package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD08_HooksOrdering {

    @Before(order=0)
    public void RunBeforeFifthTest(){
        System.out.println("RunBeforeOrderZero");
    }
    @After(order=0)
    public void RunAfterFifthTest(){
        System.out.println("RunAfterOrderZero");
    }

@Before(order=1)
public void RunBeforeSixthTest(){
    System.out.println("RunBeforeOrderOne");
}

    @After(order=1)
    public void RunAfterSixthTest(){
        System.out.println("RunAfterOrderOne");
    }
    @Given("this is Fifth given")
    public void this_is_Fifth_given() {
        System.out.println("Fifth scenario Given");

    }
    @Then("This is Fifth then")
    public void this_is_Fifth_then() {
        System.out.println("Fifth scenario Then");
    }


    @Given("this is Sixth given")
    public void this_is_Sixth_given() {
        System.out.println("Sixth scenario Given");

    }
    @Then("This is Sixth then")
    public void this_is_Sixth_then() {
        System.out.println("Sixth scenario Then");
    }
}
