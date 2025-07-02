package ex_014_DoWhile;

import java.util.Scanner;

public class Lab124_Vowels_program_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = scanner.next().toLowerCase().charAt(0);
        switch (ch){
            case 'a','e','i','o','u':
                System.out.println(ch + " -> Vowels");
                break;
            default:
                System.out.println(ch  + " -> Consonents");
        }
    }
}
