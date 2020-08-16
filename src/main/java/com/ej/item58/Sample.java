package com.ej.item58;

public class Sample {

    private int balance;

    public int transfer(int amount) throws NotSufficientBalanceException {
        if(amount < 0) {
            throw new IllegalArgumentException("Negative amount is not allowed!");
        }
        if (this.balance < amount) {
            throw new NotSufficientBalanceException(amount-balance );
        }
        this.balance -= amount;
        return this.balance;
    }
}
