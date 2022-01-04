package section5_stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class FourPostFix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        Stack<Integer> number = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            int tmp = 0;
            if (Character.isDigit(str.charAt(i))) {
                String s = Character.toString(str.charAt(i));
                number.push(Integer.parseInt(s));
            } else {
                int a = number.pop();
                int b = number.pop();
                if (str.charAt(i) == '+') {
                    tmp = b + a;
                } else if (str.charAt(i) == '-') {
                    tmp = b - a;
                } else if (str.charAt(i) == '*') {
                    tmp = b * a;
                } else if (str.charAt(i) == '/') {
                    tmp = b / a;
                }
                number.push(tmp);
            }
        }
        System.out.println(number.pop());
    }
}
