package programmers.level_2;

import java.util.Stack;

public class Lv2괄호_변환 {

    public static String solution(String p) {
        return recursive(p);
    }

    private static String recursive(String p) {

        if (p.length() == 0) return "";

        int balancedIndex = findBalancedIndex(p);

        String u = p.substring(0, balancedIndex);
        String v = p.substring(balancedIndex, p.length());

        if (isRightBracket(u)) {
            return u + recursive(v);
        } else {
            String tmp = "(";
            tmp += recursive(v);
            tmp += ")";

            u = u.substring(1, u.length()-1);
            u = flip(u);
            return tmp + u;
        }

    }

    private static String flip(String u) {

        String answer = "";

        for (char c : u.toCharArray()) {
            if (c == '(') {
                answer += ")";
            } else {
                answer += "(";
            }
        }
        return answer;
    }

    private static boolean isRightBracket(String u) {
        Stack<Character> stack = new Stack<>();

        for (char c : u.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c == ')') {
                    stack.pop();
                } else {
                    stack.push('(');
                }
            }
        }

        return stack.isEmpty();
    }

    private static int findBalancedIndex(String p) {
        int count = 0;
        int idx = 0;

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') count++;
            else count--;

            if (count == 0) {
                break;
            }
            idx++;
        }
        return idx+1;
    }

    public static void main(String[] args) {
        String solution = solution("()))((()");
        System.out.println(solution);
    }

}
