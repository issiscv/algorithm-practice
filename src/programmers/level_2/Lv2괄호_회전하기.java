package programmers.level_2;

import java.util.Stack;

public class Lv2괄호_회전하기 {

    public static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(0, i);
            String b = s.substring(i);

            if (isValidBracket(b+a)) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    private static boolean isValidBracket(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                } else if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                } else {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }
                }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        solution("[](){}");
    }

}
