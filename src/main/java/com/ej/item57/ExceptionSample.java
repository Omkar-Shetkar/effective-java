package com.ej.item57;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ExceptionSample {

    @Test
    public void testArrayIterator() {
        int[] array = {1,2,3,4};
        for(int a: array) {
            System.out.println(a);
        }
    }

    @Test
    public void testListIterator() {
        List<String> names = Arrays.asList("a", "b", "c");
        for(Iterator iterator = names.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
