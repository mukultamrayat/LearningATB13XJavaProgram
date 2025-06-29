package ex_011_Switch;

public class Lab092_WithoutBreak_oneline_Supported {
    //  in JDK > 13
    // No need of break keyword
    // one line supported
    public static void main(String[] args) {
        int itemcode = 002;
        switch (itemcode){
           case 001 -> System.out.println("Print the 001 ");
           case 002 -> System.out.println("print the 002");
           case 003 -> System.out.println("print the 003");
            default -> System.out.println("default ");
        }
    }
}
