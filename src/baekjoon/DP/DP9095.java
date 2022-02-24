package baekjoon.DP;

import java.util.Scanner;

public class DP9095 {

    static int cnt = 0;
    static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            recur(0);
            System.out.println(cnt);
            cnt = 0;
        }
    }

    private static void recur(int sum) {
        if (sum > n) return;
        if (sum == n) {
            cnt++;
            return;
        }
        if(sum < n) {
            for (int j = 1; j <= 3; j++) {
                recur(sum+j);
            }
        }
    }
}
