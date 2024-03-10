// Question 15: The lanes of the city market are very narrow and always bustling with crowds

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

        int val = findCommonFuel(N, a, b, c, d);

        System.out.println((val == -1) ? "No same amount of fuel found": val);
    }
}