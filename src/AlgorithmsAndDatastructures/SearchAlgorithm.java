package AlgorithmsAndDatastructures;

import java.util.Arrays;

public class SearchAlgorithm {
    public static void main(String[] args){
        int[] lol = {1,2,3,5,8,9,13,56,59};
        int indexOfNum = iterativeBinarySearch(lol, 8);
        if (indexOfNum >= 0) System.out.println(indexOfNum);
        else System.out.println("Not found.");
    }

    /**
     * time complexity of O(log(n))
     * Belongs to the concepts of "divide and conquer"
     * requires sorted data
     * recursive
     * @return returns the index of the target number
     */
    public static int binarySearch(int[] numArray, int targetNumber, int startIndex){
        if (numArray.length == 0){
            return -1;
        }
        int middleIndex = numArray.length / 2;

        if (numArray[middleIndex] > targetNumber){
            int[] newNumArray = Arrays.copyOfRange(numArray, 0, middleIndex);
            return binarySearch(newNumArray, targetNumber, startIndex);
        } else if (numArray[middleIndex] < targetNumber){
            int[] newNumArray = Arrays.copyOfRange(numArray, middleIndex+1, numArray.length);
            return binarySearch(newNumArray, targetNumber, 1+middleIndex+startIndex);
        } else {
            return middleIndex+startIndex;
        }
    }

    /**
     * iterative: seems like less brainf- just because we dont have a stack if ongoing searchalgorithms
     * has a better space complexity of O(n) instead of O(n*log(n))
     * no need for startIndex, so much more intuitive
     * @param numArray the array of numbers => overload with Objects etc if you want
     * @param targetNumber => targetNumber searched for. If overloaded, change for object
     * @return returns index of target number or -1, if not found
     */
    public static int iterativeBinarySearch(int[] numArray, int targetNumber){
        int startingIndex = 0;

        while (numArray.length > 0){
            int middleIndex = numArray.length / 2;
            if (numArray[middleIndex] > targetNumber){
                numArray = Arrays.copyOfRange(numArray, 0, middleIndex);
                startingIndex += 0;
            } else if (numArray[middleIndex] < targetNumber){
                numArray = Arrays.copyOfRange(numArray,  middleIndex+1, numArray.length);
                startingIndex += middleIndex + 1;
            } else{
                return startingIndex + middleIndex;
            }
        }
        return -1;
    }
}
