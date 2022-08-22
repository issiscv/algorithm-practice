package programmers.level_1;

public class Lv1정수제곱근판별 {

    public static long solution(long n) {
        long answer = 0;

        double sqrt = Math.sqrt(n);

        double ceil = Math.ceil(sqrt);
        double floor = Math.floor(sqrt);

        if (sqrt == ceil && sqrt == floor) {
            answer = (long)sqrt;

            answer = (long)Math.pow(answer + 1, 2);

        } else {
            answer = -1;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(121);
    }

}
