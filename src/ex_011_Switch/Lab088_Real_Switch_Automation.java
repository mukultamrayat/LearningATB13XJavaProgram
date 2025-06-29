package ex_011_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab088_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start the Browser");
        String Browser = scanner.next();
        Browser = Browser.toLowerCase();
        switch (Browser){
            case "chrome" :
                System.out.println("Starting the Google chrome");
                System.out.println("...........");
                System.out.println("TC1.........");
                System.out.println("TC2.........");
                break;

            case "Edge" :
                System.out.println("Starting the edge");
                System.out.println("...........");
                System.out.println("TC1.........");
                System.out.println("TC2.........");
                break;

            case "firefox" :
                System.out.println("Starting the firefox");
                System.out.println("...........");
                System.out.println("TC1.........");
                System.out.println("TC2.........");
                break;

            default:
                System.out.println("System is not understand the browser");
        }
    }
}
