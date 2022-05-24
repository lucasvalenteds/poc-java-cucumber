Feature: Four basic operations

  Scenario: Adding
    Given user types "1+2"
    When the calculator evaluates the expression
    Then the result should be "3"