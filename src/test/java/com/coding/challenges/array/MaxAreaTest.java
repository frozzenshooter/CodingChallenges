package com.coding.challenges.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaTest {

    @Test
    void maxArea() {
        assertAll(
                () ->{
                    int[] height = new int[]{1,8,6,2,5,4,8,3,7};
                    int expectedArea = 49;

                    int actual = MaxArea.maxArea(height);

                    assertEquals(expectedArea, actual);
                },

                () ->{
                    int[] height = new int[]{1,1};
                    int expectedArea = 1;

                    int actual = MaxArea.maxArea(height);

                    assertEquals(expectedArea, actual);
                }
        );


    }
}