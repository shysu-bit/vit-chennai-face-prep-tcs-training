import java.util.*;

public class Main {
    public static String isPossible(int N, int K) {
        for(int X = 1; X <= N; X++) {
            int Y = K / X;
            if(Y*X ==K && Y <= N) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(isPossible(N, K));
    }
}