# POC: Java Cucumber

It demonstrates how to write a calculator that evaluates simple math expressions following Behavior-Driven Development (BDD).

We want to write a calculator capable of evaluate simple math expressions from the user and return the result of that expression. The only feature we want to deliver is the four basic operations. Each operation should be implemented based on at least one scenario per operation, so we can catch edge cases and document different examples to clarify how the implementation should behave. The goal is to explore the benefits of writing test cases using a shared language between business and development teams and evaluate the developer experience available.

The source code is written in Java, automated tests runs on JUnit Platform managed by [Cucumber](https://github.com/cucumber) and the feature is written using [Gherkin](https://cucumber.io/docs/gherkin/reference/) syntax. The code coverage is collected by [JaCoCo](https://github.com/jacoco/jacoco) automatically after test suite execution.

## How to run

| Description | Command |
| :--- | :--- |
| Run tests | `./gradlew test --info` |

## Preview

```
> Task :compileJava UP-TO-DATE
> Task :processResources UP-TO-DATE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources UP-TO-DATE
> Task :testClasses UP-TO-DATE
> Task :test

Scenario Outline: Add                          # com/example/four-basic-operations.feature:10
  Given user types "1+2"                       # com.example.FourBasicOperationsSteps.userTypes(java.lang.String)
  When the calculator evaluates the expression # com.example.FourBasicOperationsSteps.theCalculatorEvaluatesTheExpression()
  Then the result should be "3"                # com.example.FourBasicOperationsSteps.theResultShouldBe(java.lang.String)

Scenario Outline: Add                          # com/example/four-basic-operations.feature:11
  Given user types "10+20"                     # com.example.FourBasicOperationsSteps.userTypes(java.lang.String)
  When the calculator evaluates the expression # com.example.FourBasicOperationsSteps.theCalculatorEvaluatesTheExpression()
  Then the result should be "30"               # com.example.FourBasicOperationsSteps.theResultShouldBe(java.lang.String)

Scenario Outline: Add                          # com/example/four-basic-operations.feature:12
  Given user types "100+200"                   # com.example.FourBasicOperationsSteps.userTypes(java.lang.String)
  When the calculator evaluates the expression # com.example.FourBasicOperationsSteps.theCalculatorEvaluatesTheExpression()
  Then the result should be "300"              # com.example.FourBasicOperationsSteps.theResultShouldBe(java.lang.String)

Scenario: Subtraction                          # com/example/four-basic-operations.feature:14
  Given user types "1-6"                       # com.example.FourBasicOperationsSteps.userTypes(java.lang.String)
  When the calculator evaluates the expression # com.example.FourBasicOperationsSteps.theCalculatorEvaluatesTheExpression()
  Then the result should be "-5"               # com.example.FourBasicOperationsSteps.theResultShouldBe(java.lang.String)

Scenario: Multiplication                       # com/example/four-basic-operations.feature:19
  Given user types "4*8"                       # com.example.FourBasicOperationsSteps.userTypes(java.lang.String)
  When the calculator evaluates the expression # com.example.FourBasicOperationsSteps.theCalculatorEvaluatesTheExpression()
  Then the result should be "32"               # com.example.FourBasicOperationsSteps.theResultShouldBe(java.lang.String)

Scenario: Division                             # com/example/four-basic-operations.feature:24
  Given user types "10/5"                      # com.example.FourBasicOperationsSteps.userTypes(java.lang.String)
  When the calculator evaluates the expression # com.example.FourBasicOperationsSteps.theCalculatorEvaluatesTheExpression()
  Then the result should be "2"                # com.example.FourBasicOperationsSteps.theResultShouldBe(java.lang.String)

Scenario: Division by zero                            # com/example/four-basic-operations.feature:29
  Given user types "20/0"                             # com.example.FourBasicOperationsSteps.userTypes(java.lang.String)
  When the calculator evaluates the expression        # com.example.FourBasicOperationsSteps.theCalculatorEvaluatesTheExpression()
  Then the result should be "Error: Division by zero" # com.example.FourBasicOperationsSteps.theResultShouldBe(java.lang.String)

Scenario Outline: Unknown expression           # com/example/four-basic-operations.feature:41
  Given user types "2^3"                       # com.example.FourBasicOperationsSteps.userTypes(java.lang.String)
  When the calculator evaluates the expression # com.example.FourBasicOperationsSteps.theCalculatorEvaluatesTheExpression()
  Then the result should be ""                 # com.example.FourBasicOperationsSteps.theResultShouldBe(java.lang.String)

Scenario Outline: Unknown expression           # com/example/four-basic-operations.feature:42
  Given user types "?"                         # com.example.FourBasicOperationsSteps.userTypes(java.lang.String)
  When the calculator evaluates the expression # com.example.FourBasicOperationsSteps.theCalculatorEvaluatesTheExpression()
  Then the result should be ""                 # com.example.FourBasicOperationsSteps.theResultShouldBe(java.lang.String)

> Task :jacocoTestReport
BUILD SUCCESSFUL in 3s
6 actionable tasks: 2 executed, 4 up-to-date
```
