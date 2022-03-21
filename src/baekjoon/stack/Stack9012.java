package baekjoon.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Stack9012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(scanner.next());
        }

        for (String str : list) {
            Stack<Character> stack = new Stack<>();

            boolean flag = true;

            for (char c : str.toCharArray()) {
                if (c == '(') stack.push('(');
                else {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!stack.isEmpty() || flag == false) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
