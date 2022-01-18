package basic_algorithm.section5_stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class ThreeCrain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        //8
        int m = scanner.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt();
        }
        int answer = 0;
        for (int i : moves) {
            for (int j = 0; j < n; j++) {
                if (arr[j][i-1] != 0) {
                    int tmp = arr[j][i-1];
                    arr[j][i-1] = 0;
                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
