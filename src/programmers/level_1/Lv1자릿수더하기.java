package programmers.level_1;

public class Lv1자릿수더하기 {

    public static int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        for (char c : str.toCharArray()) {
            int number = c - '0';
            answer += number;
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(123);
    }

}
