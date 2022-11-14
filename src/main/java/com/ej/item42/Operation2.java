package com.ej.item42;

import java.util.function.DoubleBinaryOperator;

public enum Operation2 {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    MULTIPLY("*", (x, y) -> x * y),
    DIVISION("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator doubleBinaryOperator;

    Operation2(String symbol, DoubleBinaryOperator doubleBinaryOperator) {
        this.symbol = symbol;
        this.doubleBinaryOperator = doubleBinaryOperator;
    }

    @Override
    public String toString() {
        return "Operation2{" +
                "symbol='" + symbol + '\'' +
                '}';
    }

    public double apply(double x, double y) {
        return doubleBinaryOperator.applyAsDouble(x, y);
    }
}
