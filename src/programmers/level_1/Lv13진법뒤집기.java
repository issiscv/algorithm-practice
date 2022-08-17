package programmers.level_1;

public class Lv13진법뒤집기 {

    public static int solution(int n) {
        int answer = 0;

        String str = "";
        while (n != 0) {
            str += n % 3;
            n = n / 3;
        }

        answer = Integer.parseInt(str, 3);

        return answer;
    }

    public static void main(String[] args) {
        int n = 125;

        solution(n);
    }
}
