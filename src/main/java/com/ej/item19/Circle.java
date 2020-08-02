package com.ej.item19;

import static com.ej.item19.ShapeConstants.*;

public class Circle {
    public void printShape() {
        System.out.println(CIRCLE);
    }
}

class Sphere extends Circle {
    public void printShape() {
        System.out.println(SPHERE);
    }
}