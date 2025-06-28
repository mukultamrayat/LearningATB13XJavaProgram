package ex_08_User_Input_Scanner;

import java.util.Scanner;

public class Lab070_User_Input_Scanner4 {
    //Exception in thread "main" java.util.InputMismatchException
    // When we want integer value for user input and we provide String data type value then we get this error
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scanner.nextInt();
        System.out.println(age);
    }
}
