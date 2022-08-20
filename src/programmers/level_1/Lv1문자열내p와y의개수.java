package programmers.level_1;

import java.util.Locale;

public class Lv1문자열내p와y의개수 {

    public static boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase(Locale.ROOT);

        int p = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'p') {
                p++;
            }

            if (c == 'y') {
                y++;
            }
        }

        if (p == 0 && y == 0)
            return true;

        if (p == y) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        solution("pPoooyY");
    }

}
