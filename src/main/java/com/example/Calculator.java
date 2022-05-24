package com.example;

public final class Calculator {

    public String evaluates(String expression) {
        if (expression.matches("\\d+[+]\\d+")) {
            final var chunks = expression.split("\\+");
            final var left = Integer.parseInt(chunks[0]);
            final var right = Integer.parseInt(chunks[1]);

            return String.valueOf(left + right);
        }

        return "";
    }
}
