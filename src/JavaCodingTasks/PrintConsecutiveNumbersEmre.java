package JavaCodingTasks;

public class PrintConsecutiveNumbersEmre {

    public static void main(String[] args) {

        printNumbersWithReplacement(30);

    }

    public static void printNumbersWithReplacement(int N) {


        for (int i = 1; i < N; i++) {       // loop through each until N

            String result = "";

            if(i % 2 == 0) {                // if number is divisible by 2
                result += "Codility";       // concat "Codility" to result
            }

            if (i % 3 == 0) {               // if number is divisible by 3
                result += "Test";           // concat "Test" to result
            }

            if (i % 5 == 0) {               // if number is divisible by 5
                result += "Coders";         //  concat "Coders" to result
            }

            if (result.isEmpty()) {         // if condition 1, 2 and 3 not met, that means result is still empty
                System.out.print(i);        // if so, print the number
            }


            System.out.println(result);     // print result
        }


    }

}
