package JavaCodingTasks;

public class ifNumberPrimeOleg {
    public static void main(String[] args) {
        int givenNumber = 1001;
        if (givenNumber <= 1) {
            System.out.println("not prime");
            System.exit(1);
        }

        for(int i = 2; i<=Math.sqrt(givenNumber); i++){
            if(givenNumber % i == 0 ){
                System.out.println("not prime");
                System.exit(1);
            }
        }
        System.out.println(givenNumber + " is prime");
    }
}
