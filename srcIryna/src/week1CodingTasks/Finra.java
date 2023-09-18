package week1CodingTasks;

public class Finra {
    /*Write a method which prints out the numbers from 1 to 30 but for numbers which
    are a multiple of 3print "FIN" instead of the number and for numbers which are a
    multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
    both 3 and 5, print "FINRA" instead of the number. */
    public static void main(String[] args) {


        for (int i = 1; i < 31; i++) {
            if(i % 3 == 0 && i % 5 == 0 ){
                System.out.println("FINRA");
            }else if(i % 3 == 0){
                System.out.println("FIN");
            }else if(i % 5 == 0){
                System.out.println("RA");
            }else if (!(i % 3 == 0 && i % 5 == 0)){
                System.out.println(i);
            }
        }
//Here, i am using a for loop to iterate through the numbers, 1-30. the if and else statements determine whether the numbers are multiples of 3 or 5, by checking if the remainder equals 0 when they are divided by those numbers, if the statements are true, the numbers are replaced with a print statement displaying either "FIN", "RA" or both, "FINRA"
    }
}
