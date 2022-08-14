package programmers.level_1;

import java.util.Stack;

public class CraneGame {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int num = moves[i];

            for (int j = 0; j < board.length; j++) {
                int tmp = board[j][num-1];

                if (tmp != 0) {
                    if (!stack.isEmpty()) {
                        int top = stack.peek();

                        if (top == tmp) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(tmp);
                        }
                    } else {
                        stack.push(tmp);
                    }
                    board[j][num-1] = 0;
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[][] map = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1,5,3,5,1,2,1,4};

        int solution = solution(map, moves);
        System.out.println(solution);
    }

}
