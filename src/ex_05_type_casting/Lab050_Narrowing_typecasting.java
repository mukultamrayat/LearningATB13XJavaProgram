package ex_05_type_casting;

public class Lab050_Narrowing_typecasting {
    public static void main(String[] args) {
        int val = 300;
        // byte b = val; // Narrowing (int -> byte) implicit casting is not allowed
        byte b = (byte) val; // Narrowing (int -> byte ) Explicit casting is allowed. Data loss also happens
        System.out.println(b);
    }
}
