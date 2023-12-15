package dojo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CocktailSteps {
    private Order order = new Order();

   @Given("Romeo who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink() {
        order.setBuyer("Romeo");
    }
    @When("an order is declared for Juliette")
    public void an_order_is_declared_for_juliette() {
        order.setDrinker("Juliette");
    }
    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order() {
        assertEquals(0,order.getCocktails().size());
    }
}