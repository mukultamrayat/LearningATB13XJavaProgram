package ex_04_Operators;

public class Lab040_AND_OR_Gate {
    public static void main(String[] args) {
        System.out.println(true || true); // true
        System.out.println(true || false); // t
        System.out.println(false || false); // f
        System.out.println(false || true); // t

        System.out.println(true && true); //t
        System.out.println(true && false); //f
        System.out.println(false && false); //f
        System.out.println(false && true); //f

    }
}
