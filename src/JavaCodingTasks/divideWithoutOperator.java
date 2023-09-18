package JavaCodingTasks;

public class divideWithoutOperator {

    public static void main(String[] args) {

        // method called in main to see result.
        division(6,3);
        division(6,4);


    }


    // method takes 2 numbers and performs division without operator.
    public static void division(int num1, int num2) {
        // division by zero is undefined.
        if (num2 == 0) {  // if num2 is 0, print error message.
            System.err.println("CANNOT DIVIDE BY ZERO");
            return; // exit method if condition is true.
        }

        int count = 0; // to keep track how many times num2 can be subtracted from num1.
        String result = num1 + " / " + num2 + " is ";

        while (num1 >= num2) { // continue to perform as long as num1 is greater or equal to num2
            count++; // increment count every time division performed.
            num1 -= num2;   //  subtract num2 from num1 to simulate division operation
        }

        System.out.println(result + count + " with remainder " + num1);


    }

}
