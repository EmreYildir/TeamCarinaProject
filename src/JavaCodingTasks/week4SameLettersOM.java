package JavaCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class week4SameLettersOM {
    public static void main(String[] args) {
        String str1 = "abbbbc";
        String str2 = "cbbab";
        sameLetters(str1,str2);


    }

    public static void sameLetters(String str1, String str2) {
        char[] a1 = str1.toCharArray(); //convert both string to array
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);             // sort both  arrays using method  sort
        Arrays.sort(a2);
     //   System.out.println(a1);
     //   System.out.println(a2);
        String x = "";
        String y = "";

        for (char each : a1) {         //converting them back to the  string  since  we  cannot  compare  two arrays since it's two different objects;
        x+=each;
        }
        for (char each : a2) {
        y+=each;
        }
        System.out.println(x.equals(y));

    }
}
//    String -- Same letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex: same("abc", "cab"); -> true
//same("abc", "abb"); -> false:




