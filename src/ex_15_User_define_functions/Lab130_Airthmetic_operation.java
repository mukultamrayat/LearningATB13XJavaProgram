package ex_15_User_define_functions;

import java.util.Scanner;

public class Lab130_Airthmetic_operation
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = 0;
        if (scanner.hasNextInt()){
                 a = scanner.nextInt();
            }
            else {
                System.out.println("Enter only Integer value");
                return;
            }


        System.out.println("Enter the Second number");
        int b = 0;
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }
        else {
            System.out.println("Enter only integer value");
            return;
        }
        int result1 = sum(a , b);
        System.out.println(result1);
        int result2 = sub(a, b);
        System.out.println(result2);
        int result3 = mul(a,b);
        System.out.println(result3);
        int result4 = div(a , b);
        System.out.println(result4);
        int result5 = mul(a,b);
        System.out.println(result5);
    }

        static int sum(int a , int b){
            return a+b;
        }
        static int sub(int a , int b){
            return a-b;
        }
        static int mul(int a , int b){
            return a*b;
        }
        static int div(int a , int b){
             if (b==0){
                 throw new ArithmeticException("B cannot be Zero");
             }
            return a /b;
        }
        static int mod(int a , int b) {
            return a % b ;
        }
    }

