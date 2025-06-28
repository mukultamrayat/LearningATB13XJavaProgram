package ex_08_User_Input_Scanner;

import java.util.Scanner;

public class Lab071_User_Input_Scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Integer value");
        int value = scanner.nextInt();
        String s = (value % 2 == 0) ? "Even value" : "Odd value";
        System.out.println(s);
    }
}
