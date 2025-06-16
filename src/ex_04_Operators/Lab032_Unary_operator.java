package ex_04_Operators;

public class Lab032_Unary_operator {
    public static void main(String[] args) {
        int a = +10;
        //int a = 10;
        //System.out.println(a);
        // + unary operator-> + symbol is optional

        int a1 = -110;
        int result = a+a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);
        // - unary operator -> - Symbol is not optional
        int b = -1;
        b  = b+1;
        System.out.println(b);

    }
}
