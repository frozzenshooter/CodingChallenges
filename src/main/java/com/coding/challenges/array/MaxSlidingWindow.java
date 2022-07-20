package com.coding.challenges.array;

import java.util.ArrayDeque;

public class MaxSlidingWindow {


    private static int findMaxOfWindow(ArrayDeque<Integer> window){
        int max = 0;

        for(int i: window){
            max = Math.max(i, max);
        }

        return max;
    }

    private static ArrayDeque<Integer> updateWindow(ArrayDeque<Integer> window, int newValue){

        window.removeFirst();
        window.addLast(newValue);

        return window;
    }

    public static int[] maxSlidingWindow(int[] array, int k){

        int windowAmount = array.length - (k-1); // only that amount of windows can be seen

        ArrayDeque<Integer> window = new ArrayDeque<>();

        // init window
        for(int i=0; i < k; i++){
            window.addLast(array[i]);
        }

        int[] maximalValuesOfWindows = new int[windowAmount];

        for(int i=0; i < windowAmount; i++){

            maximalValuesOfWindows[i] = findMaxOfWindow(window);
            if((k+i)< array.length){
                updateWindow(window, array[k+i]);
            }
        }

        return maximalValuesOfWindows;
    }
}
