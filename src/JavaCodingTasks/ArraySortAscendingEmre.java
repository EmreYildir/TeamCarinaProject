package JavaCodingTasks;

import java.util.Arrays;

public class ArraySortAscendingEmre {

    /*
    Question2: Array - Sort Ascending
    Write a return method that can sort an int array in
    Ascending order without using the sort method of the Arrays class
     */

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 25, 87, 12, 256, 34, 875, 15};

        System.out.println("Original arr = " + Arrays.toString(array));
        sortAscending2(array);
        System.out.println("Sorted arr = " + Arrays.toString(array));

    }


    public static void sortAscending1(int[] arr) {

        Arrays.sort(arr);

    }

    public static void sortAscending2(int[] arr) {


        // to track whether any swaps are made in a pass
        boolean swapped;


        // Repeats the following block until no swaps are made in a pass
        do {

            // Initialize swapped to false at the beginning of each pass
            swapped = false;

            for (int i = 1; i < arr.length; i++) {

                // Compare adjacent elements and swap them if they are in the wrong order
                if (arr[i-1] > arr[i]){
                    // Swap arr[i-1] with arr[i]
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;

                    // Set swapped to true to indicate that a swap occurred
                    swapped = true;
                }

            }
        } while (swapped); // Continue the loop until no swaps are made in a pass

    }

}
