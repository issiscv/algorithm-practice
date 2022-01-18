package basic_algorithm.section5_stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class FiveIronBar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int answer = 0;

        Stack<Character> stack = new Stack<>();
        //  ()(((()())(())()))(())
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();

                if (str.charAt(i-1) == '(')
                    answer += stack.size();
                else
                    answer += 1;
            }
        }
        System.out.println(answer);
    }
}
