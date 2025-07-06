package ex_16_Strings;

public class Lab131_Strings {
    public static void main(String[] args) {
        // in JVM we have 2 values add   values 1  is "mukul" and other one is "MUKUL" but without reassign value name variable still contain the "mukul"
        String name = "mukul"; // String created in String constant Pool
        name.toUpperCase();
        System.out.println(name);

    }
}
