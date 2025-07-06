package ex_16_Strings;

public class Lab134_String4 {
    // in JVM we have 2 values add   values 1  is "mukul" and other one is "MUKUL" but without reassign value name variable still contain the "mukul"
    public static void main(String[] args) {
        String s1 = new String("mukul");
        s1.toUpperCase();
        System.out.println(s1);
    }

}
