package programmers.level_1;

public class Lv1시저암호 {

    public static String solution(String s, int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isSpaceChar(c)) {
                sb.append(c);
            } else if (Character.isLowerCase(c)){
                sb.append((char)((c - 'a' + n) % 26 + 'a'));
            } else {
                sb.append((char)((c - 'A' + n) % 26 + 'A'));
            }
        }

        String answer = sb.toString();
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("z", 1);
    }
}
