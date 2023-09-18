package JavaCodingTasks;

public class finraEmre {

    public static void main(String[] args) {

        // called method for given requirement.
        finra(30);

    }


    public static void finra(int num){

        for(int i = 1; i <= num; i++){
            if(i % 15 == 0){ // if number is multiple of 3 and 5
                System.out.println("FINRA"); // print FINRA
            } else if(i % 3 == 0){  // if number is multiple of 3
                System.out.println("FIN");  // print FIN
            } else if(i % 5 == 0){  // if number is multiple of 5
                System.out.println("RA");   // print RA
            } else {
                System.out.println(i);  // otherwise print number
            }
        }
    }

}
