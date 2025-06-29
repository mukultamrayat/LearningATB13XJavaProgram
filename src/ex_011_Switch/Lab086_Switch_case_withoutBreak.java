package ex_011_Switch;

import java.util.Scanner;

public class Lab086_Switch_case_withoutBreak {
    // without break remaining cases are also executes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scanner.nextInt();
        switch (day){
            case 1 :
                System.out.println("Sunday");
            case 2 :
                System.out.println("Monday");
            case 3 :
                System.out.println("tuesday");
            case 4 :
                System.out.println("wednesday");
            case 5 :
                System.out.println("thrusday");
            case 6 :
                System.out.println("friday");
            case 7 :
                System.out.println("saturday");
            default:
                System.out.println("Not Allowed");
        }
    }
}
