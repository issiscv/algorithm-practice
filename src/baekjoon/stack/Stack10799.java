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

            if (str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();

                if (str.charAt(i-1) == ')') {
                    sum += 1;
                } else {
                    sum += stack.size();
                }
            }
        }

        System.out.println(sum);
    }

}
