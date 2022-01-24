package programmers.sort;

import java.util.Arrays;

public class NumberOfK {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int i = command[0];//2
            int j = command[1];//5
            int k = command[2];//3

            int[] tmp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(tmp);

            answer[idx++] = tmp[k-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

        int[] solution = solution(array, commands);

        for (int i : solution) {
            System.out.println(i);
        }

    }
}
