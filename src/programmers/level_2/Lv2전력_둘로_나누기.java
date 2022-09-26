package programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Lv2전력_둘로_나누기 {

    private static int[][] map;

    public static int solution(int n, int[][] wires) {
        int answer = 9;

        map = new int[n+1][n+1];

        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];

            map[a][b] = 1;
            map[b][a] = 1;
        }

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];

            map[a][b] = 0;
            map[b][a] = 0;

            answer= Math.min(answer, BFS(a, n));

            map[a][b] = 1;
            map[b][a] = 1;
        }

        System.out.println(answer);
        return answer;
    }

    private static int BFS(int s, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        queue.offer(s);
        int cnt=1;
        while (!queue.isEmpty()) {
            int point = queue.poll();//1

            visited[point] = true;
            for (int i = 1; i <= n; i++) {
                if (visited[i]) continue;
                if (map[i][point] == 1) {
                    queue.offer(i);
                    cnt++;
                }
            }
        }
        return (int)Math.abs(n-2*cnt); //cnt-(n-cnt);
    }


    public static void main(String[] args) {
        int n = 9;
        int[][] wires = {
                {1,3},
                {2,3},
                {3,4},
                {4,5},
                {4,6},
                {4,7},
                {7,8},
                {7,9}
        };

        solution(n, wires);
    }

}
