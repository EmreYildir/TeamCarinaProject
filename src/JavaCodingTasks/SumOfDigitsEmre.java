package JavaCodingTasks;

public class SumOfDigitsEmre {

    public static void main(String[] args) {
        System.out.println(sumOfDigits("sadasfas421521512eeadasfas"));
    }

    public static int sumOfDigits(String str) {
        int sum = 0;

        for (char c : str.toCharArray()) {
            // Check if the current character 'c' is a digit
            if (Character.isDigit(c)) {
                // Convert the character to an integer and add it to the sum
                int digit = Character.getNumericValue(c);
                // If 'c' is a digit, convert it to an integer and add it to the 'sum'
                sum += digit;
            }
        }

        // Return the sum of digits found in the input string
        return sum;
    }
}
