package com.ej.item43;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Sample {

    @Test
    void testMapMerge() {
        Map<Integer, Integer> map = new HashMap<>();
        map.merge(1, 1, Integer::sum);
        map.merge(1, 1, Integer::sum);
        map.merge(2, 1, Integer::sum);
        System.out.println(map);
    }

    @Test
    void testStaticMethodRef() {
        int[] nums = new int[]{5, 3, 8, 1};
        Consumer<int[]> sorted = Arrays::sort;
        sorted.accept(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void testBoundedMethodRef() {
        String name = "Omkar";
        Supplier<String> supplier = name::toLowerCase;
        System.out.println(supplier.get());
    }

    @Test
    void testUnboundedMethodRef() {
        String name = "Omkar";
        Function<String, String> function = String::toLowerCase;
        System.out.println(function.apply(name));
    }

    @Test
    void testConstructorMethodRef() {
        Supplier<ArrayList<String>> supplier = ArrayList::new;
        ArrayList<String> list = supplier.get();
        list.add("Omkar");
        System.out.println(list);

        Function<Integer, int[]> function = int[]::new;
        int[] array = function.apply(10);
        System.out.println(array.length);
    }


}
