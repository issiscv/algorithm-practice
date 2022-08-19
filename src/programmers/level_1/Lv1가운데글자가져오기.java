package programmers.level_1;

public class Lv1가운데글자가져오기 {

    public static String solution(String s) {

        if (s.length() % 2 == 1) {
            return String.valueOf(s.charAt(s.length() / 2));
        } else {
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
    }

    public static void main(String[] args) {
        solution("qwer");
    }

}
