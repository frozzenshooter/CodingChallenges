package com.coding.challenges.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {

        assertAll(
                () -> {
                   int[] input = new int[]{1,1,2,2,3,3};
                   int k = RemoveDuplicates.removeDuplicates(input);

                   int[] expected = new int[]{1,2,3,-1,-1,-1};

                   assertArrayEquals(expected, input);
                   assertEquals(3, k);
                },
                () -> {
                    int[] input = new int[]{-1,-1,1,1,2,2,3,3};
                    int k = RemoveDuplicates.removeDuplicates(input);

                    int[] expected = new int[]{-1,1,2,3,-1,-1,-1,-1};

                    assertArrayEquals(expected, input);
                    assertEquals(4, k);
                }
        );
    }
}