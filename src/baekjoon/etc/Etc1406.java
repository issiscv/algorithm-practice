package baekjoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Etc1406 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int N = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (char c : S.toCharArray()) {
            leftStack.push(c);
        }

        for (int i = 0; i < N; i++) {

            String cmd = br.readLine();

            switch (cmd.charAt(0)) {
                case 'L':
                    if (!leftStack.isEmpty())
                        rightStack.push(leftStack.pop());
                    break;
                case 'D':
                    if (!rightStack.isEmpty())
                        leftStack.push(rightStack.pop());
                    break;
                case 'B':
                    if (!leftStack.isEmpty())
                        leftStack.pop();
                    break;
                case 'P':
                    leftStack.push(cmd.charAt(2));
                    break;

            }
        }

        StringBuilder sb = new StringBuilder();

        while (!leftStack.isEmpty())
            rightStack.push(leftStack.pop());

        while (!rightStack.isEmpty())
            sb.append(rightStack.pop());

        System.out.println(sb);
    }
}
