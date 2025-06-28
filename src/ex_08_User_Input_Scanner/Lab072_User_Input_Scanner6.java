package ex_08_User_Input_Scanner;

import java.util.Scanner;

public class Lab072_User_Input_Scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user Age");
        int age = scanner.nextInt();
        String s = (age >= 18) ? "You are able to vote" : "You are not allowed to vote";
        System.out.println(s);
    }
}
