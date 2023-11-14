package JavaCodingTasks;

public class printConsecutiveNumber {
    public static void main(String[] args) {
        int  a= 100;
        for(int i = 1; i<=a; i++){
           System.out.print("\n"); // new line for every  iteration
            if(i %2 != 0 && i%3!=0 && i%5!=0){ // if not  divisible by 2,3  or 5 print the number
                System.out.print(i);
            }
            if(i%2==0){
                System.out.print("Codility"); //  if divisible by 2 print codility
            }if (i%3==0){
                System.out.print("Test");     //  if divisible by 3 print test
            }if (i%5==0){
                System.out.print("Coders");   //  if divisible by 2 print coders
            }

        }
    }
}
