package programmers.level_2;

import java.util.Locale;

public class Lv2JadenCase_문자열_만들기 {

    public static String solution(String s) {
        String answer = "";
        boolean first = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (first) {
                answer += Character.toUpperCase(c);
                first = false;
            } else {
                answer += Character.toLowerCase(c);
            }

            if (c == ' ') {
                first = true;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String solution = solution("for the last week");
        System.out.println(solution);
    }

}
