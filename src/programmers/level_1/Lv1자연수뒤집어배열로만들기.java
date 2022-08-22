package programmers.level_1;

public class Lv1자연수뒤집어배열로만들기 {

    public static int[] solution(long n) {
        int[] answer = {};

        String str = String.valueOf(n);
        str = new StringBuilder(str).reverse().toString();

        answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(i) - '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(12345);
    }

}
