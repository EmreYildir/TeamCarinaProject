package JavaCodingTasks;

public class DivisibilityBy_3_5_15_Emre {

    public static void main(String[] args) {

        System.out.println("\n\nDivisible by 15:");
        for (int i = 1; i <= 100; i++) {    // loop through 1 to 100
            if (i % 15 == 0) {              // if i(number) is divisible by 15
                System.out.print(i + " ");  // then print i(number) and leave space for next divisible number.
            }
        }

        System.out.println("\n\nDivisible by 5:");
        for (int i = 1; i <= 100; i++) {        // loop through 1 to 100
            if (i % 5 == 0 && i % 15 != 0) {    // if i(number) is divisible by 5 and not divisible by 15
                System.out.print(i + " ");      // then print i(number) and leave space for next divisible number.
            }
        }


        System.out.println("\n\nDivisible by 3:");
        for (int i = 1; i <= 100; i++) {        // loop through 1 to 100
            if (i % 3 == 0) {                   // if i(number) is divisible by 3 and not divisible by 15
                System.out.print(i + " ");      // then print i(number) and leave space for next divisible number.
            }
        }

    }


}
