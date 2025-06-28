package ex_09_Increment_Operator_Program;

public class Lab074_Pre_Increment_Operator2 {
    // Pre-Increment Operator
    public static void main(String[] args) {
        int a = 6;
        int b = ++a; // 1 + 6 = 7
        System.out.println(a);
        System.out.println(b);
        // Now we are using ERT
        // Line No | Expression | Result or Print
        //   5     |    6       |   NA
        //   6     |    7       |   NA
        //   7     |    7       |   7
        //   8     |    7       |   7
        // so the result is : 7 & 7
    }
}
