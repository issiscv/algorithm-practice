package programmers.level_1;

public class Lv1약수의개수와덧셈 {

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int cnt = 0;
            int divisor = 1;

            //i는 13
            while (divisor <= i) {
                if (i % divisor == 0) {
                    cnt++;
                }
                divisor++;
            }

            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(13, 17);
    }

}
