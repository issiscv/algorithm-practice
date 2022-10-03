package programmers.level_2;

import java.util.Stack;

public class Lv2짝지어_제거하기 {

    public static int solution(String s) {
        int answer = -1;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        int cdcd = solution("cdcd");
        System.out.println(cdcd);
    }
}
