package programmers.level_1;

import java.util.Arrays;

public class Lv1문자열내림차순으로배치하기 {

    public static String solution(String s) {
        String answer = "";

        char[] cArray = s.toCharArray();

        Arrays.sort(cArray);

        for (char c : cArray) {
            answer += String.valueOf(c);
        }

        answer = new StringBuilder(answer).reverse().toString();

        return answer;
    }

    public static void main(String[] args) {
        solution("Zbcdefg");
    }

}
