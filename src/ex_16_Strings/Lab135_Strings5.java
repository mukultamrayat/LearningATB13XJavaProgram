package ex_16_Strings;

public class Lab135_Strings5 {
    // in JVM we have 2 values one value is "Mukul" and other one is "Tamrayat" after reassign value with Concat the value print the "MukulTamrayat"
    public static void main(String[] args) {
        String s1 = new String("Mukul");
        s1 = s1.concat("Tamrayat");
        System.out.println(s1);
    }
}
