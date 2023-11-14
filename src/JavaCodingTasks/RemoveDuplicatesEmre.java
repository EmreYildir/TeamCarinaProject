package JavaCodingTasks;

public class RemoveDuplicatesEmre {

    public static void main(String[] args) {

        System.out.println(removeDup("AABBBCCC"));
    }

    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {    // loops through each char
            char each = str.charAt(i);

            if(!result.contains(""+each)) {     // if result string not contains is true, add char to result
                result += each;
            }

        }

        return result;
    }

}
