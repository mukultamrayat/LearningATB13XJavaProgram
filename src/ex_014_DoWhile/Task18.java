package ex_014_DoWhile;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int ch = scanner.nextInt();
        if (ch % 4 == 0 ){
            System.out.println(ch + "----> This is a leap year");

        } else if (ch % 100 == 0) {
            System.out.println(ch + "----> This is a leap year");
        } else if (ch % 400 == 0) {
            System.out.println(ch + "----> This is a leap year");

        } else{
            System.out.println(ch  + "-----> This is not a leap Year");
        }

    }
}
