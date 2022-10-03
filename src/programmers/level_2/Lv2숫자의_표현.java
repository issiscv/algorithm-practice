package programmers.level_2;

public class Lv2숫자의_표현 {

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                if (sum + j > n) break;
                sum += j;
                if (sum == n) answer++;
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(15);
    }

}
