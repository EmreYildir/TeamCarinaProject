package JavaCodingTasks;

public class PrimeNumberEmre {

    public static void main(String[] args) {

        int number = 17;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


    }

    /*
    isPrime method takes a number as arg and returns boolean
    and handle some requirements to determine if the number is prime or not
    1.If the number is less than or equal to 1, it's not prime
    2.If the number is 2 or 3, it's prime
    3.If the number divisible by 2 or 3, it's not prime
    4.by numbers starting from 5 up to the square root of the given number
    If the number is divisible by any of these, it returns false. Otherwise, it returns true.

     */


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;                               // checks 1
        }

        if (number <= 3) {
            return true;                                // checks 2
        }

                                                        // checks 3
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

                                                        // checks 4
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;

    }

}

