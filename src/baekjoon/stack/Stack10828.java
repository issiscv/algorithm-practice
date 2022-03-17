package baekjoon.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Stack10828 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String cmd = scanner.next();

            if (cmd.equals("push")) {
                int value = scanner.nextInt();
                stack.push(value);
            } else if (cmd.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack.pop() + "\n");

                }
            } else if (cmd.equals("size")) {
                sb.append(stack.size() + "\n");
            } else if (cmd.equals("empty")) {
                if (stack.isEmpty())
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");
            } else if (cmd.equals("top")) {
                if (stack.isEmpty())
                    sb.append(-1 + "\n");
                else
                    sb.append(stack.peek() + "\n");
            }
        }

        System.out.println(sb);
    }
}
