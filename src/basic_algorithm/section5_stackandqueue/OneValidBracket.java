package basic_algorithm.section5_stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class OneValidBracket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push(str.charAt(i));
            else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty() && flag == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
