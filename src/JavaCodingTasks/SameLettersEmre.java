package JavaCodingTasks;

import java.util.Arrays;

public class SameLettersEmre {

    public static void main(String[] args) {

        System.out.println(sameChars("abc", "cab"));
        System.out.println(sameChars("abc", "abb"));

    }

    public static boolean sameChars(String firstStr, String secondStr) {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }

}
