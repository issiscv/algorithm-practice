package programmers.level_2;

import java.util.Stack;

public class Lv2올바른_괄호 {

    public static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (c == '(') {
                stack.push(c);
            } else {//)
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean solution = solution("()()");
        System.out.println(solution);
    }

}
