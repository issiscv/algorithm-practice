package baekjoon.bruteforcing;

import java.util.Scanner;

public class BruteForce15684 {

    private static int R;
    private static int C;
    private static int[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        C = scanner.nextInt();//세로선의 수
        int M = scanner.nextInt();//가로선의 개수
        R = scanner.nextInt();//세로선 마다 가로선을 놓을 수 있는 위치의 개수

        arr = new int[R + 1][C + 1];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();//1
            int b = scanner.nextInt();//2열과 3열을 1의 가로선에

            arr[a][b] = 1;
            arr[a][b + 1] = 1;
        }


        for (int i = 1; i <= C; i++) {
            DFS(i, 1);
        }
    }

    private static void DFS(int v, int s) {

        if (check(v)) {

        } else {
            for (int i = 1; i <= R; i++) {
                if (arr[i][v] == 1) {
                    if (arr[i][v+1] == 1) {
                        DFS(v+1, s+1);
                    } else if (arr[i][v-1] == 1) {
                        DFS(v+1, s-1);
                    }
                }
            }
        }



    }

    private static boolean check(int v) {

        for (int i = 1; i <= R; i++) {
            if (arr[i][v] != 0) {
                return false;
            }
        }

        return true;
    }
}
