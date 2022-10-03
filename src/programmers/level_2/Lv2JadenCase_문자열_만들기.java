package programmers.level_2;


public class Lv2JadenCase_문자열_만들기 {

    public static String solution(String s) {
        String answer = "";
        boolean isFirst = true;

        for (int i = 0; i < s.length(); i++) {
            if (isFirst && !Character.isSpaceChar(s.charAt(i))) {
                if (Character.isDigit(s.charAt(i))) {
                    answer += s.charAt(i);
                } else {
                    answer += Character.toUpperCase(s.charAt(i));
                }

                isFirst = false;
            } else if (Character.isSpaceChar(s.charAt(i))) {
              isFirst = true;
              answer += s.charAt(i);
            } else {
                answer += Character.toLowerCase(s.charAt(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String solution = solution("for  the last week");
        System.out.println(solution);
    }

}
