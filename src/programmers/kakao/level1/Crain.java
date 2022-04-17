package programmers.kakao.level1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Crain {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][m-1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[i][m-1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][m-1]);
                    }
                    board[i][m-1] = 0;
                    break;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] move = {1,5,3,5,1,2,1,4};

        solution(board, move);

    }
}
