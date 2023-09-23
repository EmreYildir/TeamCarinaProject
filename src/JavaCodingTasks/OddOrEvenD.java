package JavaCodingTasks;

public class OddOrEvenD {

    public static void main(String[] args) {

        //In this method we use an integer which has its
        // parameter and returns and String indicating
       //whether the number is "Even" or "Odd."

        int number1 = 7;
        int number2 = 8;

        String result1 = identify(number1);
        String result2 = identify(number2);

        System.out.println(number1 + " is " + result1);
        System.out.println(number2 + " is " + result2);

    }

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

        ////created a method to identify whether a given number is even or odd
    }





}
