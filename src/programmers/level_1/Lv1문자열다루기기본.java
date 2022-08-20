package programmers.level_1;

public class Lv1문자열다루기기본 {

    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("a234");
    }
}
