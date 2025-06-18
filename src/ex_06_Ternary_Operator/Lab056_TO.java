package ex_06_Ternary_Operator;

public class Lab056_TO {
    // Find the Minimum number Between two number using ternary operator
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        //System.out.println(Math.min(x,y));
        int min = x < y ? x : y;
        System.out.println(min);
    }
}
