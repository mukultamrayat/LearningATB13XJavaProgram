package ex_09_Increment_Operator_Program;

public class Lab073_Pre_Increment_Operator1 {
    //Pre -Increment Operator Example
    public static void main(String[] args) {
        int a = 15; // 1 + 15 = 16
        System.out.println(++a);
        System.out.println(a);

        // Now We are using the Expression & result Table (ERT)
        // Line No | Expression | Print
        //  6      |  15        | NA
        //  7      |  16        | 16
        //  8      |  16        | 16
        // So we print the Expression value is : 16 16
    }
}
