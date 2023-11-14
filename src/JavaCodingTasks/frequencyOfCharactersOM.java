package JavaCodingTasks;

public class frequencyOfCharactersOM {
    public static void main(String[] args) {
        System.out.println(frequency("aa2233bb"));
    }

    public static String frequency(String a) {


        int count = 1;
        String result="";//creating an empty String for the final result
        for (int i = 0; i < a.length() ; i++) { //going thru each character
            count=1; // resetting count to one for each new char
            if(result.contains(""+a.charAt(i))) // creating if conditions where, if  our final string contains this characters then  we will  skip this character and don't check for any other conditions anymore
                continue;
            for(int j=i+1; j<a.length();j++){ //second loop to compare  given character with each  character in the  string
                if(a.charAt(i)==a.charAt(j)) // if  given char equals to any of the  following in the string we  will increase  count by one
                    count++;
            }
           result+=""+a.charAt(i)+count; // adding our result from each iteration to  the  result string
                }

            return result;
    }
}
//Write a return method that can find the frequency of
//characters
//Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
