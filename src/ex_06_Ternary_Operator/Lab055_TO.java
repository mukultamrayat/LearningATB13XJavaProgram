package ex_06_Ternary_Operator;

public class Lab055_TO {
    // Find the maximum number Between two number using ternary operator
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        //System.out.println(Math.max(x,y));
       int total = (x > y) ? x : y;
       System.out.println(total);
    }
}
