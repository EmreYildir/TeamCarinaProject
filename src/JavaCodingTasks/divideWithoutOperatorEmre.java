package JavaCodingTasks;

public class divideWithoutOperatorEmre {

    public static void main(String[] args) {

        // method called in main to see result.
        division(-6,-2);
        division(-6,-4);


    }


    // method takes 2 numbers and performs division without operator.
    public static void division(int num1, int num2) {
        if (num2 == 0) {
            System.err.println("CANNOT DIVIDE BY ZERO");
            return;
        }

        int count = 0;        // Initialize the count to 0.

        // Determine the sign of the result
        boolean isNegative = (num1 < 0) ^ (num2 < 0);
        // isNegative is true if the signs of num1 and num2 are different.

        // Make both numbers positive for the calculation
        long absNum1 = Math.abs((long) num1);   // Take the absolute value of num1.
        long absNum2 = Math.abs((long) num2);   // Take the absolute value of num2.

        while (absNum1 >= absNum2) {
            absNum1 -= absNum2;   // Subtract absNum2 from absNum1.
            count++;           // Increment the count.
        }

        if (isNegative) {
            count = -count;  // If isNegative is true, make the count negative.
        }

        System.out.println(num1 + " / " + num2 + " is " + count + " with remainder " + absNum1);
        // Print the result with explanation.
    }

}
