package JavaCodingTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortArrayOM {
    public static void main(String[] args) {

        int[] array = {64, 34, -25, 12, 22, 11, 90};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) { //iteration thru the array to find the smallest number
            if (minNumber > array[i]) {        // if my min number > current element than minNumber=current element
                minNumber = array[i]; //-8
            }
        }

        for (int i = 0; i < array.length; i++) {
            int maxNumber = minNumber;    // first loop is used to reset my max number and index of the element

            int index = 0;
            for (int j = 0; j < array.length; j++) {   //{12,5,6,32}
                                                       //{0,5,6,0}
                                                       //{32,12,0,0}
                if (array[j] > maxNumber) {
                    maxNumber = array[j];     //if element is bigger than max number we reasign biggest number to maxNumber and remember this index
                    index = j;
                }
                if (j + 1 == array.length) {
                    sortedArray[i] = maxNumber;    // if it's the end of the loop we add the biggest number into new sorted array and remove this number from existing one so we whould not check it again
                    array[index] = minNumber;
                }
            }
        }
        return sortedArray;
    }

}
