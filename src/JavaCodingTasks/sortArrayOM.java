package JavaCodingTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortArrayOM {
    public static void main(String[] args) {
        int[] givenArray = {123,-6,7,-8};
        System.out.println(Arrays.toString(sortArray(givenArray)));

        int[] array = {64, 34, -25, 12, 22, 11, 90};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        bubbleSort(array);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(array));
    }
      public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        int minNumber = array[0];
        for(int i =0; i<array.length;i++){
            if(minNumber>array[i]){
                minNumber = array[i]; //-8
            }
        }

        for (int i = 0; i < array.length; i++) {
            int maxNumber = minNumber;

            int index = 0;
            for (int j = 0; j < array.length; j++) {   //{12,5,6,32}
                    if (array[j] > maxNumber) {
                        maxNumber = array[j];
                        index = j;
                    }
                    if(j+1== array.length){
                        sortedArray[i]=maxNumber;
                        array[index]=minNumber;
                    }
                }
            }
        return sortedArray;
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
