package com.coding.challenges.array;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

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
