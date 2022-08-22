package programmers.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

public class Lv1이상한문자만들기 {

    public static String solution(String s) {
        String answer = "";

        String[] arr = s.split("");

        int idx = 0;
        for (int i = 0; i < s.length(); i++) {

            if (arr[i].equals(" ")) {
                answer += " ";
                idx = 0;
            } else if (idx % 2 == 0) {
                answer += arr[i].toUpperCase(Locale.ROOT);
                idx++;
            } else if (idx % 2 == 1) {
                answer += arr[i] = arr[i].toLowerCase(Locale.ROOT);
                idx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("try hello world");
    }

}
