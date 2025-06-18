package ex_06_Ternary_Operator;

public class Lab058_nested_ternary {
    // Real Age classification example
    // Age < 18 -> Minor
    // Age > 18 and < 65 -> Adult
    // Age > 65 -> Senior
    public static void main(String[] args) {
        int age = 16;
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
