package JavaCodingTasks;

public class ReverseNegativeNumberEmre {

    public static void main(String[] args) {

        int number = -1234;
        int reversedNumber = 0;

        if (number < 0) {
            // Remove the negative sign by multiplying by -1
            number = number * -1;
        }

        while (number != 0){

            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        reversedNumber = -1 * reversedNumber;

        System.out.println(reversedNumber);

    }



}
