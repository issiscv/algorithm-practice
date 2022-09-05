package programmers.level_2;

import java.util.Stack;

public class Lv2괄호_변환 {

    public static String solution(String p) {

        if (isRightBracket(p)) {
            return p;
        } else {
            return recursive(p);
        }
    }

    private static String recursive(String p) {
        if (p.equals("")) {
            return "";
        } else {
            int idx = makeBalanceBracket(p);
            String u = p.substring(0, idx);
            String v = p.substring(idx, p.length());

            if (isRightBracket(u)) {
                return u + recursive(v);
            } else {
                String tmp = "(";
                tmp += recursive(v);
                tmp += ")";

                u = u.substring(1, u.length() - 1);
                u = flip(u);

                return tmp + u;
            }
        }
    }

    private static String flip(String u) {

        String str = "";

        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                str += ')';
            } else {
                str += '(';
            }
        }
        return str;
    }


    private static int makeBalanceBracket(String p) {

        //올바른 괄호 문자열인지 확인
        int count = 0;
        int idx = 0;

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                break;
            }
            idx++;
        }
        return idx + 1;
    }

    private static boolean isRightBracket(String p) {
        Stack<Character> stack = new Stack<>();

        for (char c : p.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c == '(') {
                    stack.push('(');
                } else {
                    stack.pop();
                }
            }

        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String solution = solution(")(");
        System.out.println(solution);
    }

}
