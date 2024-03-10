import java.util.*;

public class Main {
    public static int findCommonFuel(int N, int a, int b, int c, int d) {
        for(int i = 0; i < N; i++) {
            int fuelInLane1 = b + (a*i);
            for(int j = 0; j < N; j++) {
                int fuelInLane2 = d + (c*j);

                if(fuelInLane1 == fuelInLane2) {
                    return fuelInLane1;
                }
            }
        }

        return -1;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(findCommonFuel(N, a, b, c, d));
    }
}