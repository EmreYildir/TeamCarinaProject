package JavaCodingTasks;

import java.util.Arrays;

public class sortArrayAcsending {
    public static void main(String[] args) {

       int[] array = {23,34,45,12,0,4,5,6,1};
        System.out.println(Arrays.toString(sortAcsending(array)));

    }

    public static int[] sortAcsending(int[] array) {
        int temp; //temporary integer  for  moving numbers
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) { //nested loop to move number  if  it's bigger to the  next spot
                if (array[j] > array[j + 1]) { // if element  is  bigger than next one       {3,2,1} 3>2
                    temp = array[j + 1];       // remember  the  next one                    temp = 2
                    array[j + 1] = array[j];   // assign  biggger number to the next element {3,3,1}
                    array[j] = temp;           // reassign my temp to the  first element     {2,3,1}
                }
            }
        }
        return array;

    }
}
//Question2: Array - Sort Ascending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
//arr = Sort(arr); ==>{ 7, 8, 9, 10};
