package week1CodingTasks;

public class EvenOdd {
    public static void main(String[] args) {

        if(5 % 2 == 0){
            System.out.println(5 + "=Even");
        }else if(5 % 2 != 0){
            System.out.println(5 + "=Odd");
        }
        if(6 % 2 == 0){
            System.out.println(6 + "=Even");
        }else if(6 % 2 != 0){
            System.out.println(6 + "=Odd");
        }
    }
    //Here, I am using an if statement in order to decipher whether an integer is even or odd. The statement checks whether the integer is divisible by 2, by checking whether the remainder is going to be 0 or not
}
