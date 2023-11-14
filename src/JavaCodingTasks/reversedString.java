package JavaCodingTasks;

public class reversedString {
    public static void main(String[] args) {
        System.out.println("reversed(\"abcdefg\") = " + reversed("abcdefg"));
        String str = "sdgfdgsd";
    }

//reverse string
    public static String reversed(String original){

        String reversed = "";
        for (int i = original.length()-1; i >=0 ; i--) { // iterating thru the original string
            reversed+=original.charAt(i);
        }
        return reversed;
    }

}
