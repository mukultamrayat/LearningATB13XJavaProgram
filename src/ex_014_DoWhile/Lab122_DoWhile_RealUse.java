package ex_014_DoWhile;

public class Lab122_DoWhile_RealUse {
    // web Automation
    public static void main(String[] args) {
        int number = 1;
        do {
            //Call function (number);
            //Close the excel file / open the file
            System.out.println("Print the number -> " + number);
            number++;
        } while (number <0);
    }
}
