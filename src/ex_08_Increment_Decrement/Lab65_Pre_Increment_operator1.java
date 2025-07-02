package ex_08_Increment_Decrement;

public class Lab65_Pre_Increment_operator1 {
    public static void main(String[] args) {
        // Increase first then print
        int a = 10;
        int b = ++a; // Prefix increment / pre-increment 10+ 1 then Assigned
        System.out.println(a);
        System.out.println(b);

        // Now we are using the ERT formula (Expression Result Table)
        // Line | a | result b
        //  5   | 10| NA
        //  6   | 11| 11
        //  7   | 11| 11
        //  8   | 11| 11



    }
}
