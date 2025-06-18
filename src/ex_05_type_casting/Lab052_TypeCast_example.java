package ex_05_type_casting;

public class Lab052_TypeCast_example {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = (course + GST); // Narrowing -> implicit casting invalid
        int total = course + (int) GST;
        System.out.println(total); // Data Loss in Narrowing Explicit

        float total1 = (course + GST); // Widening -> Implicit casting
        System.out.println(total1);
        float total2 = (float) course + GST; // Widening -> Explicit casting
        System.out.println(total2);



    }
}
