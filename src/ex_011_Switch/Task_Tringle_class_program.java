package ex_011_Switch;

import java.util.Scanner;

public class Task_Tringle_class_program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Side 1");
        int side1 = scanner.nextInt();
        System.out.println("Enter the Side 2");
        int side2 = scanner.nextInt();
        System.out.println("Enter the Side 3");
        int side3 = scanner.nextInt();
        if (side1 == side2 && side1 == side3){
            System.out.println("equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3 ) {
            System.out.println("isosceles ");
        }
        else {
            System.out.println("No side equal");
        }
    }
}
