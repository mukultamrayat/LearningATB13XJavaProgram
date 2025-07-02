package ex_012_For_loop;

public class Lab0107_For_loop_Break {
    public static void main(String[] args) {
        for (int i = 1;i<=50;i++){ // 1 to 50 run 50 times
            if (i%2 == 0){
                break;
            }
              else {
                System.out.println("Hello   -> " + i);
            }
        }
    }
}
