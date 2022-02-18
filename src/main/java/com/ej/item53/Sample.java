package com.ej.item53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sample {

    @Test
    void simple() {
        int[] nums = {2, 4, 6, 8};
        int sum = sum(nums);
        System.out.println("Sum: " + sum);
        Assertions.assertEquals(20, sum);
    }

    static int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    @Test
    void oneOrMoreArgument() {
        int[] nums = {2, 6, 1, 3, 10, 8};
//        int[] nums = {};
//        int min = findMinWrongWay(nums);
        int min = findMinRightWay(2, nums);
        System.out.println("Min: " + min);
        Assertions.assertEquals(1, min);
    }

    static int findMinWrongWay(int... nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("At least one argument is required!");
        }
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    static int findMinRightWay(int first, int... nums) {
        int min = first;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}
