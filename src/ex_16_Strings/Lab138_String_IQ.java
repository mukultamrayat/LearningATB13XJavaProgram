package ex_16_Strings;

public class Lab138_String_IQ {
    public static void main(String[] args) {


        String s1 = "Hello";
        String s2 = "Hello";

        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("hello");

        // == ---> comparison ---> String --> This check location ref
        // = --> Assignment the value
        System.out.println(s1 == s4); // false
        System.out.println(s1 == s5); // false
        System.out.println(s4 == s5); // false
        System.out.println(s1 == s2); // true

        //  Equals - Content - value
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s4)); // true
        System.out.println(s4.equals(s5)); // true
        System.out.println(s5.equals(s6)); // false
        System.out.println(s1.equalsIgnoreCase(s6)); // true




    }

}
