package programmers.level_2;

import java.util.Stack;

public class Lv2괄호_회전하기 {

    public static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(0, i);
            String b = s.substring(i);

            String tmp = b + a;

            if (isValidBracket(tmp)) {
                answer++;
            }

        }
        System.out.println(answer);

        return answer;
    }

    private static boolean isValidBracket(String tmp) {

        Stack<Character> stack = new Stack<>();

        for (char c : tmp.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                Character peek = stack.peek();
                if (c == ')') {
                    if (peek == '(') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == '}') {
                    if (peek == '{') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    if (peek == '[') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        solution("}}}");
    }

}
