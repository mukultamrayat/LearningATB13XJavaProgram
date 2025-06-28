package ex_09_Increment_Operator_Program;

public class Lab076_Post_Increment_Operator4 {
    // Post - Increment Operator Example
    public static void main(String[] args) {
        int a = 15;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        // Now we are using the Expression & result table
        // Line | Expression | Result
        //  6   |   15       |  NA
        //  7   |   15       | 15 + 1 = 16
        //  8   |   16       |  16
        //  9   |   15       |  16
        // So the result is 16 & 15
    }

}
