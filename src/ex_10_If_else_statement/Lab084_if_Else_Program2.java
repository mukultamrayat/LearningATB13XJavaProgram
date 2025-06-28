package ex_10_If_else_statement;

import java.util.Scanner;

public class Lab084_if_Else_Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("You are Allowed to visit Thailand");
        }
        else {
            System.out.println("You are Not allowed to visit Thailand");
        }
    }
}
