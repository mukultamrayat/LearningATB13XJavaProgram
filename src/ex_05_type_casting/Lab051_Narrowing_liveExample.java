package ex_05_type_casting;

public class Lab051_Narrowing_liveExample {
    public static void main(String[] args) {
        long phone_number = 7976778683l;
        //short s = phone_number; // Narrowing -> implicit casting invalid
        short s = (short) phone_number; // Narrowing -> Explicit casting valid
        //System.out.println(phone_number);

    }
}
