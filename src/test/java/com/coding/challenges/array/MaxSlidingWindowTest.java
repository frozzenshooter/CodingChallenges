package com.coding.challenges.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSlidingWindowTest {

    @Test
    void maxSlidingWindow() {

        assertAll(
                ()->{
                    int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
                    int k = 3;

                    int[] actual = MaxSlidingWindow.maxSlidingWindow(nums, k);

                    int[] expected = new int[]{3,3,5,5,6,7};

                    assertArrayEquals(expected, actual);
                }

        );

    }
}