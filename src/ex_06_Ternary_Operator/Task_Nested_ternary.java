package ex_06_Ternary_Operator;

public class Task_Nested_ternary {
    // Program 3: Grade Calculation Using Nested Ternary

    public static void main(String[] args) {
        int a = 91;
        String result = (a >= 90) ? "A+" : (a >= 75) ? "A" : (a >= 60) ? "B" : (a >= 40) ? "C" : "Fail";
        System.out.println(result);
    }
}
