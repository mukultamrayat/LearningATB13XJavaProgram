package ex_15_User_define_functions;

public class Lab126_User_Defined_Function2 {
    public static void main(String[] args) {
     name();
     int result = return_int();
        System.out.println(result);
        String result1 = return_name_of_user();
        System.out.println(result1);
        Float result2 = return_float();
        System.out.println(result2);
        double result3 = return_double();
        System.out.println(result3);
        boolean result4 = return_boolean();
        System.out.println(result4);
        long result5 = return_long();
        System.out.println(result5);

    }
    // Step 1 - > Function definition
     static void name(){
         System.out.println("This function is return nothing");
     }
     static int return_int(){
         //System.out.println("Please Execute the this Function");
         return 5;
     }
     static String return_name_of_user(){
        return "Mukul";
     }
     static float return_float(){
        return 3.14f;
     }
     static boolean return_boolean(){
        return true;
    }
    static double return_double(){
        return 1223;
    }
    static long return_long(){
        return 30l;
    }

}
