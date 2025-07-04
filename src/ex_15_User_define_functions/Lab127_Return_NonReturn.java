package ex_15_User_define_functions;

public class Lab127_Return_NonReturn {
    public static void main(String[] args) {
        int result = num_of_sum(3,4);
        System.out.println(result);
        num_of_sum1(4,5);
    }
    static int num_of_sum(int a , int b){
        return a+b;
    }
    static void num_of_sum1(int a , int b){
        System.out.println(a+b);
    }
}
