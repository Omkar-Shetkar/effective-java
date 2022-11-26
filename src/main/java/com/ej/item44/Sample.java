package com.ej.item44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {

    @Test
    void testLinkedHashMap() {
        Map<Integer, String> cache = new CustomLinkedHashMap();

        cache.put(1, "Bangalore");
        cache.put(2, "Mumbai");
        cache.put(3, "New Delhi");
        cache.put(4, "Chennai");
        cache.put(5, "Kolkata");

        Assertions.assertEquals(5, cache.size());

        cache.put(6, "Mysore");

        Assertions.assertEquals(5, cache.size());

        System.out.println(cache);
    }
}

class CustomLinkedHashMap extends LinkedHashMap {

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > 5;
    }
}