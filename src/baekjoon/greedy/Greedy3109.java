package baekjoon.greedy;

import java.util.*;

public class Greedy3109 {
    private static int R,C;
    private static char[][] map;
    private static int[] dir = {-1,0,1};//오른쪽 라인을 검사해주기 위함
    private static int width,answer;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        R = scanner.nextInt();//5
        C = scanner.nextInt();//5
        map = new char[R][C];

        for (int i = 0; i < R; i++) {

            map[i] = scanner.next().toCharArray();

        }
        answer = 0;
        for (int i = 0; i < R; i++) DFS(i,0);

        System.out.println(answer);
    }
    
    //행 열
    private static boolean DFS(int x, int y) {

        if (y == C-1) {
            answer++;
            return true;
        }
        for (int i = 0; i < 3; i++) {
            int nx = x + dir[i];
            int ny = y + 1;


            if (nx >= 0 && nx < R && ny >= 0 && ny < C && map[nx][ny] != 'x') {
                map[nx][ny] = 'x';
                if (DFS(nx,ny)) return true;
            }
        }

        return false;
    }

}