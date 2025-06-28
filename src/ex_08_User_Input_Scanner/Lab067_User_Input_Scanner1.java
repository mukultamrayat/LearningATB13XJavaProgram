package ex_08_User_Input_Scanner;

import java.util.Scanner;

public class Lab067_User_Input_Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Integer value");
        int age = scanner.nextInt();
        System.out.println(age);
    }
}
