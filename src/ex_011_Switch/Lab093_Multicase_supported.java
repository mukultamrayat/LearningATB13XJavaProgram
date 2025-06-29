package ex_011_Switch;

public class Lab093_Multicase_supported {
    // MultiPle cases supported program
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001 , 002 , 003 :
                System.out.println("These are electronic devices");
                break;
            case 004 , 005 , 006 :
                System.out.println("These are Smart devices");
                break;
            default:
                System.out.println("None");
        }
    }
}
