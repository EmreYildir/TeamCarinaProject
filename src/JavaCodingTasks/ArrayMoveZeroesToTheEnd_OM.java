package JavaCodingTasks;

import java.util.Arrays;

public class ArrayMoveZeroesToTheEnd_OM {
    public static void main(String[] args) {
        int[] array = {2,0,5,0,1,0,2,3,4,2,21,0,34,34};
        System.out.println("ArrayMoveZeroes(array) = " + Arrays.toString(ArrayMoveZeroes(array)));


    }
    public static int[] ArrayMoveZeroes(int[] array){
        int[] newArray = new int[array.length]; // creatin new array
        int temp = 0;                           // initilizing temp init to store current index of new array
        for(int i = 0; i<array.length; i++){

                    if(array[i]!=0){ // iterating thru our given array to find if the element is not zero
                        newArray[temp] = array[i]; // if it not then we are putting it into new array
                        temp++;                    // increasing our index to the next element
                    }
                }
        return newArray;
    }
}
