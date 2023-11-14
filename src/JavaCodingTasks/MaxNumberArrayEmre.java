package JavaCodingTasks;

public class MaxNumberArrayEmre {


    public static void main(String[] args) {
        int [] arr = {56, 45, 14, 100, -15, 95};
        System.out.println(maximumNumber(arr));
    }


    public static int maximumNumber(int[] arrayOfNums){
        int max = arrayOfNums[0];

        for(int each : arrayOfNums){
            // Check if the current element 'each' is greater than the current maximum 'max'
            if(each > max){
                // If 'each' is greater, update the 'max' variable with the value of 'each'
                max = each;
            }
        }
        return max;
    }

}
