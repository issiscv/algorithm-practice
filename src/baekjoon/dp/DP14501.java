package baekjoon.dp;

import java.util.Scanner;

public class DP14501 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // 남은 일기간

        int t[] = new int[n+10]; // 상담을 완료하는데 걸리는 시간
        int p[] = new int[n+10]; // 상담을 마쳤을때 받는 금액
        for(int i=1;i<=n;i++) {
            t[i] = s.nextInt();
            p[i] = s.nextInt();
        }

        int dp[] = new int[n+10]; // 얻을 수 있는 최대이익
        int max=0;

        for(int i=1;i<=n+1;i++) { // n+1일까지 구하는 이유는 마지막날+1일일경우까지 구해야해서
            int index = i + t[i];
            dp[i] = Math.max(dp[i], max);
            dp[index] = Math.max(dp[index], dp[i] + p[i]);
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
        s.close();
    }
}
