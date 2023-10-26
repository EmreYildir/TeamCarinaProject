package JavaCodingTasks;


public class NumberSwapEmre {

    public static void main(String[] args) {

        int a = 25;
        int b = 15;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        a = a + b;  // a contains the sum of the original a and b
        b = a - b;  // b contains the original value of a
        a = a - b;  // a contains the original value of b

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }

}
