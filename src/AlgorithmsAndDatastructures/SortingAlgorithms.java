package Algorithms;

import java.util.Arrays;

/**
 * the implementation is up to the reader as a small challenge
 */
public class SortingAlgorithms {
    public static void main(String[] args){
        int[] numArray = {3246,64357,4,6745,8645,68};
        Arrays.sort(numArray);
        /*
        Normal people use this instead, so no need to implement on you own.
        This is actually also faster, since they are specifically optimized,
        better than just implementing in Java.
        */
        System.out.println(Arrays.toString(numArray));
    }

    /**
     * time complexity of O(infinity) (worst case)
     * @return
     */
    public static int[] bogoSort(int[] numArray){
        /* randomly shuffles the array until its right*/
        return numArray;
    }

    /**
     * time complexity of O(n*log(n)) (worst case)
     * @return
     */
    public static int[] selectionSort(int[] numArray){
        /* looks for the smallest element and inserts it at index 0*/
        return numArray;
    }

    /**
     * time complexity O(n^2) (worst case)
     * @return
     */
    public static int[] bubbleSort(int[] numArray){
        /*
        goes through the array and always changes position of two
        neighbouring numbers and loops through as long as changes are being made
         */
        return numArray;
    }
}
