package ex_012_For_loop;

public class Lab0108_For_loop_Continue_Even_odd {
    public static void main(String[] args) {
        for (int i = 1;i<= 50;i++){ // 1 to 50 Run 50 Times
          if (i%2 == 0){
              continue;
          }
          else {
              System.out.println(i);
          }
        }
    }
}
