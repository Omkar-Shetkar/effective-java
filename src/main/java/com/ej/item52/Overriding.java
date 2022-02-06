package com.ej.item52;

import java.util.List;

public class Overriding {
    static class Wine {
        String name() {
            return "wine";
        }
    }

    static class SparklingWine extends Wine {
        @Override
        String name() {
            return "sparkling wine";
        }
    }

    static class Champagne extends SparklingWine {
        @Override
        String name() {
            return "champagne";
        }
    }
    public static void main(String[] args) {
        List<Wine> wineList = List.of(new Wine(), new SparklingWine(), new Champagne());
        for(Wine wine: wineList) {
            System.out.println(wine.name());
        }
    }
}
