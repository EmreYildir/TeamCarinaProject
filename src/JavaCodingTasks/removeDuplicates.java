package JavaCodingTasks;

public class removeDuplicates {
    public static void main(String[] args) {

        System.out.println("removeDuplicates(\"dsafddddddfffdsf\") = " + removeDuplicates("dsafddddddfffdsf"));

    }
    public static String removeDuplicates(String str1 ){

        String result=""; // our final result
        for (int i = 0; i < str1.length(); i++) { // iterating thur each  char and checking if our result already contains it
            if(!(result.contains("" + str1.charAt(i)))){ // if doesn't contain ----> add char  to result
                result+=str1.charAt(i);

            }
        }
        return result;
    }

//    String -- Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex: removeDup("AAABBBCCC") ==> ABC




}
