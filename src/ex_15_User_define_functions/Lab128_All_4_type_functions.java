package ex_15_User_define_functions;

import javax.xml.namespace.QName;

public class Lab128_All_4_type_functions {
    public static void main(String[] args) {
        //Without Parameters and Without Return type function
      greet_WP_WR();
        // Without Parameters and with Return Type function
      String result = greet_WP_WithReturn();
      System.out.println(result);
        // with Parameters but without Return type function
      greet_WP_Without_ReturnType("rashmi",31,50000);
      greet_WP_Without_ReturnType("mukul",36,70000);
        // With Parameters and with Return Type Function
      int result1 = sum_of_two_values(5,6);
        System.out.println(result1);
        int result2 = sum_of_three_values(5,6,7);
        System.out.println(result2);
    }
    //Without Parameters and Without Return type function
    static void greet_WP_WR(){
        System.out.println("This is the WR_WP function");
        System.out.println("Hi");
    }
    // Without Parameters and with Return Type function
      static String greet_WP_WithReturn(){
        return "Mukul";
      }
    // with Parameters but without Return type function
     static void greet_WP_Without_ReturnType(String name , int age , double salary){
         System.out.println("Your Name Is -> " + name);
         System.out.println("Your Age is -> " + age);
         System.out.println("Your Salary Is ->" + salary);
      }
     // With Parameters and with Return Type Function
      static int sum_of_two_values(int a , int b){
        return a+b;
     }
    // With Parameters and with Return Type Function
    static int sum_of_three_values(int a , int b , int c){
        return a + b + c;
    }
}
