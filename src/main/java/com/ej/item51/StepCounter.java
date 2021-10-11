package com.ej.item51;


enum Type {WALK, RUN}

public class StepCounter {

    public int steps(Type type) {
        if (type == Type.WALK) {
            System.out.println("Computing steps for walk.");
        } else if (type == Type.RUN) {
            System.out.println("Computing steps for run.");
        }
    }
}
