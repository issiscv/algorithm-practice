package programmers.level_2;

public class Lv2멀리_뛰기 {

    public static long solution(int n) {

        long answer = 0;

        long[] dp = new long[2001];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= 2000; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }

        return dp[n] % 1234567;
    }


    public static void main(String[] args) {
        long solution = solution(4);
        System.out.println(solution);
    }

}
