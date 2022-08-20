package programmers.level_1;

public class Lv1소수찾기 {

    public static int solution(int n) {
        int answer = 0;

        boolean[] flag = new boolean[n+1];

        flag[0]= true;
        flag[1]= true;

        for (int i = 2; i <= n; i++) {
            for (int j = i * 2; j <= n; j += i) {
                flag[j] = true;
            }
        }

        Integer.parseInt("3");

        for (int i = 2; i <= n; i++) {
            if (!flag[i]) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(10);
    }
}
