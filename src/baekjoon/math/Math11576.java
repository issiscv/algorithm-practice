package baekjoon.math;

import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Logger;

public class Math11576 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();//17
        int B = scanner.nextInt();//8

        int M = scanner.nextInt();//2
        int[] arr = new int[M];

        for (int i = 0; i < M; i++) {
            arr[i] = scanner.nextInt();
        }

        long decimal = 0;

        for (int i = 0; i < M; i++) {
            int pow = (int)Math.pow(A, M - i - 1);
            decimal += pow * arr[i];
        }

        Stack<Long> stack = new Stack<>();

        while (decimal != 0) {
            long o = decimal % B;
            stack.push(o);
            decimal = decimal / B;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
