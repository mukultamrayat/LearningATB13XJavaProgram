package ex_04_Operators;

public class Lab037_concatination_example {
    public static void main(String[] args) {
        String firstname = "Mukul";
        String lastname = "Tamrayat";
        int a = 10;
        int b = 20;
        System.out.println(firstname + lastname + a + b); // Mukultamrayat1020
        System.out.println(a + b + firstname + lastname); // 30mukultamrayat
        System.out.println(firstname + lastname + (a + b)); //mukultamrayat30
    }
}
