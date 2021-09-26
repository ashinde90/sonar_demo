package belly;

// import cucumber.api.java.en.Given;
import cucumber.api.java8.En;
import java.util.List;

public class Stepdefs implements En {
    public Stepdefs() {
        Given("I have (\\d+) cukes in my belly", (Integer cukes) -> {
            System.out.format("======Cukes: %d=====\n", cukes);
        });
        When("^I wait (\\d+) hour$", (Integer hours) -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new PendingException();
            System.out.format("======Hours: %d=====\n", hours);
        });
        Then("^my belly should growl$", () -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new PendingException();
        });        

        Given("the following animals: (.*)", (List<String> animals) -> {
            System.out.format("======Animals: %s=====\n", animals.toString());
        });

        Given("^the cow weighs (\\d+) kg$", (Integer kg) -> {
            System.out.format("======kg: %d=====\n", kg);
        });

        When("^we calculate the feeding requirements$", () -> {

        });

        Then("^the energy should be (\\d+) MJ$", (Integer mj) -> {
            System.out.format("======mj: %d=====\n", mj);
        });

        Then("^the protein should be (\\d+) kg$", (Integer kg) -> {
            System.out.format("======kg: %d=====\n", kg);
        });
    }
}