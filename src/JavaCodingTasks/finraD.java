package JavaCodingTasks;

public class finraD {

    public static void main(String[] args){

        for (int i = 1; i <= 30; i++) { // if the current number (i) is both a multiple of 3 and 5 => "FINRA"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN"); //else if statement checks the current number is only a multiple of 3=> "FIN"
            } else if (i % 5 == 0) {
                System.out.println("RA"); // else if statement checks the current number is only a multiple of 5 =>"RA"
            } else {
                System.out.println(i);
            }
        }





    }









}
