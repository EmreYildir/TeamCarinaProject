package JavaCodingTasks;

public class maxNumberFromArrayOM {
    public static void main(String[] args) {
        int[] givenArray = {21,34,54,234,54,654,34243,24,234,4,1};

        System.out.println(maxNumberFromArray(givenArray));
    }

    public static int maxNumberFromArray(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
