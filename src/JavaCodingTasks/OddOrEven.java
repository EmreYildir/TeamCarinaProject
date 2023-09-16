package JavaCodingTasks;

import java.util.Scanner;

public class OddOrEven {

    //  write a method to define given number odd or even

    public static void main(String[] args) {


        identify(12);
    }


    public static void identify(int num){

        if(num == 0){
            System.out.println("Number is zero "+ num);
        }else if(num % 2 != 0){
            System.out.println("Number is odd "+ num);
        }else{
            System.out.println("number is even "+ num);

        }
    }
}
