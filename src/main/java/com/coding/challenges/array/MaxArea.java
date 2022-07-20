package com.coding.challenges.array;

/**
 * Task: Find the greatest area using two heights and the x-axis positions of these heights
 */
public class MaxArea {

    private static int getArea(int index1, int index2, int[] height){

        int minHeight = Math.min(height[index1], height[index2]);
        int indicesDifference = Math.abs(index2 - index1); // the order can be arbitrary because we use abs

        return minHeight * indicesDifference;
    }

    public static int maxArea(int[] height){

        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int area = 0;


        while(leftIndex < rightIndex){

            area = Math.max(area, getArea(leftIndex, rightIndex, height));

            if(height[leftIndex] < height[rightIndex]){
                leftIndex++;
            }else{
                rightIndex --;
            }
        }

        return area;
    }
}
