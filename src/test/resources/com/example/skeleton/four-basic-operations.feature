Feature: Four basic operations

  Scenario: Adding
    Given user types "1+2"
    When the calculator evaluates the expression
    Then the result should be "3"

  Scenario: Subtraction
    Given user types "1-6"
    When the calculator evaluates the expression
    Then the result should be "-5"

  Scenario: Multiplication
    Given user types "4*8"
    When the calculator evaluates the expression
    Then the result should be "32"

  Scenario: Division
    Given user types "10/5"
    When the calculator evaluates the expression
    Then the result should be "2"

  Scenario: Division by zero
    Given user types "20/0"
    When the calculator evaluates the expression
    Then the result should be "Error: Division by zero"
