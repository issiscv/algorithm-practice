package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack10799 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        Stack<Character> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                if (str.charAt(i-1) == '(') {
                    stack.pop();
                    sum += stack.size();
                } else {
                    stack.pop();
                    sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}
