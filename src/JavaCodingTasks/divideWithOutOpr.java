package JavaCodingTasks;

public class divideWithOutOpr {

    public static void main(String[] args) {

        int dividend = 10;
        int divisor = 2;
        int quotient = divide(dividend, divisor);
        System.out.println("Quotient: " + quotient);


    }

  public static int divide (int num1, int num2){
        int result = 0;
        while(num1>= num2){
            num1-=num2;
            result++;

    }

      return result;
  }



}














