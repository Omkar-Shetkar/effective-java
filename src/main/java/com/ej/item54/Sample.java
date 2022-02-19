package com.ej.item54;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {

    private static String[] EMPTY_NAMES = new String[0];

    @Test
    void returnNullForEmptyCollection() {
        List<String> names = getNamesOptimizedWay();
        if (names.contains("b")) {
            System.out.println("Collection contains the required name!");
        } else {
            System.out.println("No names found!");
        }
    }

    private List<String> getNamesWrongWay() {
        // Returns null to indicate an empty collection - Don't do this!
        List<String> names = Arrays.asList("a", "b", "c");
        return names.isEmpty() ? null : new ArrayList<>(names);
    }

    private List<String> getNamesRightWay() {
        // The right way to return a possibly empty collection
        List<String> names = Arrays.asList("a", "b", "c");
        return new ArrayList<>(names);
    }

    private List<String> getNamesOptimizedWay() {
        // Optimization - avoids allocating empty collections
        List<String> names = Arrays.asList("a", "b", "c");
        return names.isEmpty() ? Collections.emptyList() : new ArrayList<>(names);

    }

    @Test
    void returnNullForEmptyArrays() {
        String[] names = getNamesArrayOptimizedWay();
        if (names.length > 0) {
            System.out.println("Not an empty array");
        } else {
            System.out.println("Empty array!");
        }
    }

    private String[] getNamesArrayRightWay() {
        // The right way to return a possibly empty array
        List<String> names = Arrays.asList("a", "b", "c");
        return names.toArray(new String[0]);
    }

    private String[] getNamesArrayOptimizedWay() {
        // Optimization - avoids allocating empty arrays
        List<String> names = Arrays.asList("a", "b", "c");
        return names.toArray(EMPTY_NAMES);

    }

}
