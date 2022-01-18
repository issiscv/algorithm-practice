package basic_algorithm.section5_stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class TwoDeleteBracket {

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push(str.charAt(i));
            else if (str.charAt(i) == ')') {
                stack.pop();
            }

            if (stack.isEmpty() && Character.isAlphabetic(str.charAt(i)))
                answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(solution(str));
    }
}
