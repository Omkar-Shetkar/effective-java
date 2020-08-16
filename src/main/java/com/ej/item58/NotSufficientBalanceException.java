package com.ej.item58;

public class NotSufficientBalanceException extends Exception {
    private final int neededBalance;

    public NotSufficientBalanceException(int neededBalance) {
        this.neededBalance = neededBalance;
    }

    public int getNeededBalance() {
        return neededBalance;
    }
}
