package ex_07_user_input_CLI;

public class Lab063_UserInputCLI_04 {
    public static void main(String[] args) {
       String age_number = args[0];
       int age = Integer.parseInt(age_number);
        System.out.println(age);
    }
}
