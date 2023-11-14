package JavaCodingTasks;

public class FinraOleg {
    public static void finraPrint(int a){
        if(a<0||a>30){ // checking requirements since number must be between 0 and 30
            System.err.println("Please re-etner valid number");
            System.exit(1);
        }
        for(int i = 1; i<=a; i++){

            if(i%15==0){ // if number is multiple of 15
                System.out.println("FINRA");
            }else if(i%3==0){  // if number is multiple of 15
                System.out.println("FIN");
            }else if(i%5==0){  // if number is multiple of 15
                System.out.println("RA");
            }else{
                System.out.println(i);
            }


        }


    }

    public static void main(String[] args) {
        finraPrint(31);

    }

}
