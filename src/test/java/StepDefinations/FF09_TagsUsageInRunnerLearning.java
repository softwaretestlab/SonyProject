package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FF09_TagsUsageInRunnerLearning {
    //First Scenario

    @Given("Tag is called in runner")
    public void tag_is_called_in_runner() {
        System.out.println("First given");
    }

    @Then("that particular tag will run")
    public void that_particular_tag_will_run() {
        System.out.println("First Then");
    }
//Second Scenario
    @Given("Tag is called in runner two")
    public void tag_is_called_in_runner_two() {
        System.out.println("Second given");
    }

    @Then("that particular tag will run two")
    public void that_particular_tag_will_run_two() {
        System.out.println("Second Then");
    }


}
