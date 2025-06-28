package ex_07_user_input_CLI;

public class Lab065_UserInputCLI_06 {
    // (NumberFormatException.java:67)
    // Because arguments add as string and we call Integer then we get this error
    public static void main(String[] args) {
        String age_number = args[0];
        int age = Integer.parseInt(age_number);
        System.out.println(age);
    }
}
