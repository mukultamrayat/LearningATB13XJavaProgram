package ex_06_Ternary_Operator;

public class Lab059_logic_building {
    public static void main(String[] args) {
        // find the maximum between the three numbers
        // I am Going to teach you what is called as the logic building formula
        // Now we will be using the logic building formula

        // step 1 -> find input / output
        //I/O (input/output) -> n1, n2,n3 - int
        // O/P (output) -> String -> Max number

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        //step2 - rough logic , think about it
        // n1 > n2 and n1 > n3 - > n1
        // n2 > n1 and n2 > n3 - > n2
        // if both n1 , n2 are not greater than automatically n3 is greater

        // Step 3 - write the logic
        //int max = (n1 > n2) : // A : B are 2 condition
        // A - > (n1 > n3) ? n1 : n3
        // B - > (n2 > n3) ? n2 : n3
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 :(n2 > n3) ? n2 : n3;
        System.out.println(max);

    }

}
