import java.util.Scanner;

public class Main {
    public static boolean isDivisor(int number, int divisor) {
        return number % divisor == 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();

        sc.close();

      	boolean isDiv = false;
      
        for(int i = 1; i <= X; i ++) {
            for(int j = 1; j <= i; j++) {
                if(X == A*i+j && isDivisor(i, j)) {
                  System.out.println(i);
                  isDiv = true;
                }
            }
        }
      
      if(!isDiv) {
      	System.out.println("None");
      }

    }
}