package ex_013_While_loop;

import java.util.Scanner;

public class Lab0117_Factorial_While_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial program\nEnter the number ");
         if (!scanner.hasNextInt()){
             System.out.println("Please enter integer value fool");
             return;
         }
        int number = scanner.nextInt();

        int factorial = 1;

        if (number <=0){
            System.out.println("Negative Number is not allowed");
            return;
        }
        if (number <=0){
            System.out.println(factorial);
        }
        else { // Calculate the Factorial
            for(int i=1;i<=number;i++)
                factorial= factorial*i;

        }
        System.out.println("Factorial Is -> " + factorial);

    }
}
