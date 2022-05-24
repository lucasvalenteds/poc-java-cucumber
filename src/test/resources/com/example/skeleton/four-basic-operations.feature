Feature: Four basic operations

  Scenario: Adding
    Given user types "1+2"
    When the calculator evaluates the expression
    Then the result should be "3"

  Scenario: Division
    Given user types "10/5"
    When the calculator evaluates the expression
    Then the result should be "2"