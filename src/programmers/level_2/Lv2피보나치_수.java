package programmers.level_2;

public class Lv2피보나치_수 {

    public static int solution(int n) {
        int answer = 0;
        int mod = 1234567;

        int[] dp = new int[100001];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % mod;
        }

        return dp[n] % mod;
    }

    public static void main(String[] args) {
        solution(3);
    }

}
