package programmers.level_2;

public class Lv2_2xN_타일링 {

    private static final int NUM = 1000000007;

    public static int solution(int n) {
        int[] dp = new int[60000];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % NUM;
        }

        return dp[n] % NUM;
    }

    public static void main(String[] args) {
        solution(4);
    }

}
