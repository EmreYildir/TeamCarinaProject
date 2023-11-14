package JavaCodingTasks;

public class divisibleBy_3_5_15 {
    public static void main(String[] args) {
        String div15 = "Divisible by 15:";
        String div5 = "Divisible by 5:";
        String div3 = "Divisible by 3:";

        for(int i =1; i<=100; i++){ // creating loop with any iteration of any given number
            if( i%15==0){
                div15 +=" " + i;
            }
            if( i%5==0){
                div5 +=" " + i;
            }
            if( i%3==0){
                div3 +=" " + i;
            }
        }
        System.out.println(div15);
        System.out.println(div5);
        System.out.println(div3);

    }
}
