package ex_10_If_else_statement;

import java.util.Scanner;

public class Lab083_If_program1 {
    // If program
    // Debug the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("You are able to cast the vote");
        }
    }
}
