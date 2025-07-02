package ex_014_DoWhile;

public class Lab121_DoWhile {
    public static void main(String[] args) {
        int i = 0;
//        while (i<0){
//            System.out.println(i);
//            i++;
//        }
        do {
            System.out.println("Please execute the code, atleast one tine");
            System.out.println(i);
            i++;
        } while (i<0);
    }
}
