package ex_09_Increment_Operator_Program;

public class Lab075_Post_Increment_Operator3 {
    // Post - Increment Operator
    public static void main(String[] args) {
        int a = 12;
        System.out.println(a++); // 12 + 1 = 13
        System.out.println(a);
        // Now we are using the Expression result table
        // Line | Expression | Result
        // 6    |  12        | NA
        // 7    |  12        | 13
        // 8    |  13        | 13
        // So the result is : 12 & 13
    }
}
