package programmers.level_2;

public class Lv2숫자의_표현 {

    public static int solution(int n) {
        int answer = 0;

        int num = 0;
        while (num++ <= n) {

            int sum = 0;
            for (int i = num; i <= n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break;
                }
                else if (sum > n) break;
            }

        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(15);
    }

}
