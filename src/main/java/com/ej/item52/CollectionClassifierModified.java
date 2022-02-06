package com.ej.item52;

import java.math.BigInteger;
import java.util.*;

public class CollectionClassifierModified {

    public static String classify(Collection<?> c) {
        return c instanceof Set ? "Set":
                c instanceof List ? "List":
                        "Unknown Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections) {
            // The choice of which overloading to invoke is made at compile time
            System.out.println(classify(c));
        }
    }
}
