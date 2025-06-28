package ex_10_If_else_statement;

public class Interview_Question4 {
    public static void main(String[] args) {
       String age_number = args[0];
       int age = Integer.parseInt(age_number);

       if (age == 10){
           System.out.println("Equal");
       }
       else {
           System.out.println("Not Equal");
       }



    }
}
