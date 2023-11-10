package JavaCodingTasks;

public class DivideTwoNumbersOleg {
    public static void divideTwoNum(int a, int b) {
        int c = a;
        if (b == 0) { // divider cannot be zero/ math exception
            System.err.println("b = 0. Cannot divide to zero");
            System.exit(1);
        }

        int count = 0;
        if ((a > 0 && b > 0) || a < 0 && b < 0) { //if both numbers are positive or both number negative
            while (Math.abs(a) >= Math.abs(b)) {
                a -= b;
                count++;
            }
            System.out.println(c + " divided by " + b + " is " + count);
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) { // if one of the numbers is negative my formula would be different and result will be multiplied by -1
            while (Math.abs(a) >= Math.abs(b)) {
                a += b;
                count++;
            }
            count = -1 * count;
            System.out.println(c + " divided by " + b + " is " + count);
        }

    }
        public static void main (String[]args){
            divideTwoNum(-15, -2);
        }


    }