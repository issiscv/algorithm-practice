package programmers.level_1;

public class Lv1두정수사이의합 {

    public static long solution(int a, int b) {
        long answer = 0;

        if (b < a) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        long solution = solution(a, b);
        System.out.println(solution);
    }

}
