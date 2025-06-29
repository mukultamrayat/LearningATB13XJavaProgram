package ex_011_Switch;

import java.util.Scanner;

public class Lab087_switchCase_Default {
    // Without default switch case
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day");
        int day = scanner.nextInt();
        switch (day){
            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;


        }
    }
}
