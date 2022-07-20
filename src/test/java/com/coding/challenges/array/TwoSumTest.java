package com.coding.challenges.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        assertAll(
                 () -> {
                     int[] nums = new int[]{2, 7, 11, 15};
                     int target = 9;

                     int[] goal = new int[]{0, 1};

                     int[] result = TwoSum.twoSum(nums, target);
                     assertArrayEquals(goal, result);
                 },
                () -> {
                    int[] nums = new int[]{3,2,4};
                    int target = 6;

                    int[] goal = new int[]{1, 2};

                    int[] result = TwoSum.twoSum(nums, target);
                    assertArrayEquals(goal, result);
                },
                () -> {
                    int[] nums = new int[]{3, 3};
                    int target = 6;

                    int[] goal = new int[]{0, 1};

                    int[] result = TwoSum.twoSum(nums, target);
                    assertArrayEquals(goal, result);
                }
        );
    }
}