package JavaCodingTasks;

public class twoNumbersSwap {
    public static void main(String[] args) {
        int a = 5;
        int b= 8;
        a= a+b;    //sum of two numbers 13
        b= a-b;    //  new b num     13-8=5
        a= a-b;    // or new  a number  is equla sum minus b 13-5=8
        System.out.println("b = " + b);
        System.out.println("a = " + a);

//

        int x=6;
        // 0110
        int y=8;
        // 1000
        x = x^y;
        //   0110
        // ^
        //   1000
        //res1110

        System.out.println("x = " + x);
        y = x^y;
        // 1110  14
        // 1000  8
        // 0110  6

        System.out.println("y = " + y);
        x = x^y;
        System.out.println("x = " + x);


    }
}
