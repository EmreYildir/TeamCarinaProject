package JavaCodingTasks;

import java.util.Arrays;

public class ArrayUniqueIntOM {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(UniqueArray(11)));


//        Array - N unique integers that sum up to 0
//Write a function that given an integer N (1 < N < 100), returns an array
//containing N unique integers that sum up to 0. The function can return any
//such array.
//For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
//The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
//For N = 3 one of the possible answers is [-1,0,1] (but there are many more
//correct answers).
    }

public static int[] UniqueArray(int n){
        int[] array = new int[n];
        int temp = n;
        for(int i = 0; i<n/2; i++){
            array[i] = -temp--;
        }
        temp++;

        for(int i = n/2; i<n; i++){
            if((i==(n-1))&&(n%2!=0) ){
                array[i] = 0;
                break;
            }
            array[i] = temp++;
        }
        return array;
    }

}
