package JavaCodingTasks;

public class UniqueCharsEmre {

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }


    public static String unique(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) { // if unique, will return the same index
                result.append(currentChar); //  If the character is unique, we add the char to result
            }
        }
        return result.toString(); // convert to String
    }

}
