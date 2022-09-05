package programmers.level_2;

import java.util.Stack;

public class Lv2짝지어_제거하기 {

    public static int solution(String s) {

        Stack<Character> stack = new Stack<>();

        char[] array = s.toCharArray();

        for (int j = 0; j < array.length; j++) {
            if (stack.isEmpty()) {
                stack.push(array[j]);
                continue;
            }

            if (stack.peek() == array[j]) {
                stack.pop();
            } else {
                stack.push(array[j]);
            }

        }

        if (stack.isEmpty()) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        int cdcd = solution("cdcd");
        System.out.println(cdcd);
    }
}
