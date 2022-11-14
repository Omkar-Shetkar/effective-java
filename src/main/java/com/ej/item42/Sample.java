package com.ej.item42;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample {

    @Test
    void testSortUsingAnonymousClass() {
        List<String> countries = Arrays.asList("India", "UK", "USA", "Canada", "France", "Australia");
        Collections.sort(countries, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(countries);
    }

    @Test
    void testSortUsingLambda() {
        List<String> countries = Arrays.asList("India", "UK", "USA", "Canada", "France", "Australia");
        Collections.sort(countries, (o1, o2) ->
                o1.compareTo(o2));
        System.out.println(countries);
    }

    @Test
    void testEnumUsingAnonymousClass() {
        System.out.println(Operation.PLUS.apply(2, 3));
    }

    @Test
    void testEnumUsingLambda() {
        System.out.println(Operation.PLUS.apply(2, 3));
    }
}

