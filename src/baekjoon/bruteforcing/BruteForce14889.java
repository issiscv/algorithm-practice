package baekjoon.bruteforcing;

import java.util.Scanner;

public class BruteForce14889 {

    private static int n;
    private static int m;
    private static int[] aTeam;
    private static int[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = n / 2;

        arr = new int[n][n];
        aTeam = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        combi(0, 1);

        System.out.println(answer);
    }

    private static int answer = Integer.MAX_VALUE;

    private static void combi(int v, int s) {

        if (v == m) {
            int[] bTeam = new int[m];
            int[] teamNumber = new int[n+1];

            int aSum = 0;
            int bSum = 0;

            for (int i : aTeam) {
                teamNumber[i] = 1;
            }
            int idx = 0;
            for (int i = 1; i <= n; i++) {
                if (teamNumber[i] == 0) {
                    bTeam[idx++] = i;
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = i+1; j < m; j++) {
                    int a = aTeam[i];
                    int b = aTeam[j];

                    aSum += arr[a-1][b-1];
                    aSum += arr[b-1][a-1];
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = i+1; j < m; j++) {
                    int a = bTeam[i];
                    int b = bTeam[j];

                    bSum += arr[a-1][b-1];
                    bSum += arr[b-1][a-1];
                }
            }

            answer = Math.min(answer, Math.abs(aSum-bSum));
            return;
        } else {
            for (int i = s; i <= n; i++) {
                aTeam[v] = i;
                combi(v+1, i+1);
            }
        }

    }
}
