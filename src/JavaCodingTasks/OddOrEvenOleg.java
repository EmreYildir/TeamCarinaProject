package JavaCodingTasks;

public class OddOrEvenOleg {

    public static void identify(int a) {
        String result = (a % 2 == 0) ? "Even" : "Odd"; // here is ternary where if remainder == 0 ->number is even, otherwise number is odd
        System.out.println(a + " is a " +result + " number");
    }

    public static void main(String[] args) { // here is the test of the programm
        identify(5);
        identify(-13);
        identify(10);
    }


}
//write a method which can identifies given number is even or odd