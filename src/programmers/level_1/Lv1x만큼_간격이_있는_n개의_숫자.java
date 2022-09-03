package programmers.level_1;

public class Lv1x만큼_간격이_있는_n개의_숫자 {

    public static long[] solution(long x, int n) {
        long[] answer = new long[n];

        for (int i = 1; i <= n; i++) {
            answer[i-1] = i * x;
            System.out.println(answer[i-1]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        solution(-4, 2);
    }

}
