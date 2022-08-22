package programmers.level_1;

public class Lv1약수의합 {

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer+=i;
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(12);
    }

}
