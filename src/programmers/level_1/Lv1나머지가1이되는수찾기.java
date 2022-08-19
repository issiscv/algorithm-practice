package programmers.level_1;

public class Lv1나머지가1이되는수찾기 {

    public static int solution(int n) {
        int answer = 0;

        int min = Integer.MAX_VALUE;

        for (int i = 2; i <= n; i++) {
            if (n % i == 1) {
                min = Math.min(min, i);
            }
        }
        System.out.println(min);
        return min;
    }

    public static void main(String[] args) {
        solution(10);
    }
}
