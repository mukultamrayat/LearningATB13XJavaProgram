package ex_03_Variable_Datatypes;

public class Lab021_Constants {
    public static void main(String[] args) {
       final int aa = 10;
         //aa = 11; final keyword due to not able to change the aa variable value
        System.out.println(aa);

       final float Pi = 3.14f;
         //Pi = 4.21f; if we add final constant then not able to change the variable value
        System.out.println(Pi);
    }
}
