package com.coding.challenges.array;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;

/**
 * Task: Find the indices of the integers in the array that sum up to the target int (using only two of the integers of the array and not using the same integer twice)
 */
public class TwoSum {

    private static HashSet<Integer> convert(int[] array)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int element : array) {
            set.add(element);
        }

        return set;
    }

    private static int getIndex(int[] nums, int value, int currentIndex){

        for(int t = currentIndex+1; t < nums.length; t++){
            if(nums[t] == value){
                return t;
            }
        }

        return -1;
    }

    @NotNull
    public static int[] twoSum(int[] nums, int target) {

        HashSet<Integer> set = convert(nums);

        for(int i=0; i < nums.length; i++){

            int complement = target - nums[i];

            if(set.contains(complement)){

                int j = getIndex(nums, complement, i);
                if(j != -1){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
