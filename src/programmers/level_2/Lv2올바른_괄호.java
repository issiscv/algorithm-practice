package programmers.level_2;

import java.util.Stack;

public class Lv2올바른_괄호 {

    public static boolean solution(String s) {
        boolean answer = true;

        if (s.charAt(0) == ')') return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.add('(');
            } else if (stack.isEmpty() && c == ')'){
                return false;
            } else {
                stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = false;

        return answer;
    }

    public static void main(String[] args) {
        solution("(())()");
    }

}
