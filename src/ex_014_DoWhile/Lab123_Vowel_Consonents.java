package ex_014_DoWhile;


import java.util.Scanner;

public class Lab123_Vowel_Consonents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the Character input");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a') {
            System.out.println("Character is Vowels -> " + ch);
        } else if (ch == 'e') {
            System.out.println("Character is Vowels -> " + ch);
        } else if (ch == 'i') {
            System.out.println("Character is Vowels -> " + ch);
        } else if (ch == 'o') {
            System.out.println("Character is Vowels -> " + ch);
        } else if (ch == 'u') {
            System.out.println("Character is Vowels -> " + ch);
        }
        else {
            System.out.println("This character is consonents -> " + ch);
        }
    }
}
