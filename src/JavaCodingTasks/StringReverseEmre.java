package JavaCodingTasks;

public class StringReverseEmre {

    public static void main(String[] args) {

        String name = "ABCD";
        String reversedString = "";

        for(int i = name.length() - 1; i >= 0; i--){
            // Start the loop from the last character of the original string and go backwards
            // Initialize a loop variable i with the index of the last character
            reversedString += name.charAt(i);
            // Retrieve the character at the current index (i) from the original string (name)
            // Append that character to the reversedString
        }

        System.out.println(reversedString);

    }

}
