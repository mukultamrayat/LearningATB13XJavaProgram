package ex_07_user_input_CLI;

public class Lab066_UserInputCLI_07 {
    public static void main(String[] args) {
        String age_number = args[0];
        int age = Integer.parseInt(age_number);
        String Result = (age >= 18) ? "You are Allowed to visit Goa" : "You are not Allowed to Visit Goa";
        System.out.println(Result);
    }
}
