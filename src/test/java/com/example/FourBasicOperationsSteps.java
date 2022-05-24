package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourBasicOperationsSteps {

    private String expression;
    private String result;

    @Given("user types {string}")
    public void userTypes(String expression) {
        this.expression = expression;
    }

    @When("the calculator evaluates the expression")
    public void theCalculatorEvaluatesTheExpression() {
        final var calculator = new Calculator();
        this.result = calculator.evaluates(expression);
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}
