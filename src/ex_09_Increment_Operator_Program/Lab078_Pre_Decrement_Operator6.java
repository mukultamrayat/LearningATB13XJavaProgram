package ex_09_Increment_Operator_Program;

public class Lab078_Pre_Decrement_Operator6 {
    // Pre-Decrement Operator
    public static void main(String[] args) {
        int a = 10;
        int b = --a;
        System.out.println(a);
        System.out.println(b);
        // We are using the Expression result table
        // Line | Expression | Result
        //  6   |  10        | NA
        //  7   |  10-1 = 9  | NA
        //  8   |   9        | 9
        //  9   |   9        | 9
        // So the result is 9 & 9
    }
}
