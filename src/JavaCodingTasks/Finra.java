package JavaCodingTasks;

public class Finra {
//FINRA :
//Write a method which prints out the numbers from 1 to 30
// but for numbers which are a multiple of 3print "FIN" instead of the number
// and for numbers which are a multiple of 5, print "RA" instead of the number.
// for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) { // i: 1,2,3,... 100

            if (i % 15 == 0) { // 15, 30
                System.out.print("FINRA ");
            } else if (i % 3 == 0) { //3, 6, 9, 12...
                System.out.print("FIN ");
            } else if (i % 5 == 0) { //5, 10, 15, 20...
                System.out.print("RA ");
            } else { //1, 2, 4, 7 ....
                System.out.print(i + " ");
            }

        }
    }
}

