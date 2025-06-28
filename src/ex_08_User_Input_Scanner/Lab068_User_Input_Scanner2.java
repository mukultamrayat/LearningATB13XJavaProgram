package ex_08_User_Input_Scanner;

import java.util.Scanner;

public class Lab068_User_Input_Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input integer data type value and print
        System.out.println("Enter your Integer Value");
        int age = scanner.nextInt();
        System.out.println(age);
        // take user input double data type value and print
        System.out.println("Enter your double value");
        double d = scanner.nextDouble();
        System.out.println(d);
        //Take user input String data type value and print
        System.out.println("Enter the String value");
        String s = scanner.next();
        System.out.println(s);
    }
}
