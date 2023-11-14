package JavaCodingTasks;

public class stringunique {
    public static void main(String[] args) {

        System.out.println(unique("aaaabbbbcds"));
    }
    public static String unique(String original){
        String unique = "";
        for (int i = 0; i < original.length(); i++) {
            if(original.substring(0,i).contains(""+original.charAt(i))||original.substring(i+1).contains(""+original.charAt(i))){
                continue;
            }
            else{
                unique+=original.charAt(i);
            }

        }


        return unique;
    }


}
