package programmers.level_2;

public class Lv2_124_나라의_숫자 {

    public static String solution(int n) {
        String[] num = {"4", "1", "2"};
        String answer = "";

        while (n != 0) {
            answer = num[n % 3] + answer;
            n = (n-1) / 3;
        }

        return answer;
    }

    public static void main(String[] args) {
        String solution = solution(10);
        System.out.println(solution);
    }

}
