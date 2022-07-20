package com.coding.challenges.array;

/**
 * Task: Remove all duplicates of an array (in place)
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){

        int indexWithoutDuplicates = 0;

        for(int i=0; i < nums.length; i++){

            if(nums[indexWithoutDuplicates] != nums[i]){

                indexWithoutDuplicates++;
                if(indexWithoutDuplicates != i){
                    nums[indexWithoutDuplicates] = nums[i];
                }
            }

        }

        // Set useless array fields to -1
        indexWithoutDuplicates++;
        int k = indexWithoutDuplicates;
        if(k < nums.length){
            for(; k < nums.length; k++){
                nums[k] = -1;
            }
        }

        return indexWithoutDuplicates;
    }
}
