package ex_10_If_else_statement;

import java.util.Scanner;

public class Lab084_Nested_if_Program3 {
    // Nested If else program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int age = scanner.nextInt();
        if (age <= 18){
            System.out.println("User is minor");
        } else if (age >= 18 && age <= 65) {
            System.out.println("User is Adult");
        }
        else {
            System.out.println("User is Senior");
        }
    }
}
