package programmers.level_1;

import java.util.Arrays;

public class KthNumber {

    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];

            int[] copy = Arrays.copyOfRange(array, a-1, b);
            Arrays.sort(copy);
            int tmp = copy[c-1];
            answer[i] = tmp;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array, commands);
    }

}
