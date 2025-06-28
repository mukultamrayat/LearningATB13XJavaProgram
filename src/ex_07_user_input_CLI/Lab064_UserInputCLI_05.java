package ex_07_user_input_CLI;

public class Lab064_UserInputCLI_05 {
    public static void main(String[] args) {
        String age_number = args[0];
        int age = Integer.parseInt(age_number);
        String CanIVote = (age >= 18) ? "Yes you can Vote" : "No You can't vote";
        System.out.println(CanIVote);
    }
}
