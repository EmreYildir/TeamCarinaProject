package JavaCodingTasks;

public class oddOrEvenEmre {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        // Called identifier method to check num1 and num2 Even or Odd
        System.out.println("identify(" + num1 + ") -> " + identifier(num1));
        System.out.println("identify(" + num2 + ") -> " + identifier(num2));



    }


    public static String identifier(int num) {  // method checks number Even or Odd
        if(num % 2 == 0) {  // statement: if num divided by 2 is 0
            return "Even";  // number is even.
        } else {
            return "Odd";  // if not, number is odd.
        }
    }

}
