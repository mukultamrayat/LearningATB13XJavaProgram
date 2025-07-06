package ex_16_Strings;

public class Lab132_String2 {
    // in JVM we have 2 values one value is "mukul" and other one is "MUKUL" after reassign value name variable contain the "Mukul"
    public static void main(String[] args) {
        String name = "mukul";
        name = name.toUpperCase();
        System.out.println(name);
    }
}
