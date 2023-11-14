package JavaCodingTasks;

public class ArrayFindMaxEmre {

    /*
    Question1: Array - Find Minimum
    Write a method that can find the maximum number from an int Array
     */

    public static void main(String[] args) {

        int[] arr = {16, 58, -42, 80, 123, 12, -35};

        int max = -2147483648;  // assign int max to min value of int

        for (int i = 0; i < arr.length; i++) {  // loop through each int in array to check condition

            if (arr[i] > max) {         // if int i's value bigger than current value of max
                max = arr[i];           // update max with bigger value i
            }

        }

        System.out.println("max = " + max);


    }

}
