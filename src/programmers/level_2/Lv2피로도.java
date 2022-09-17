package programmers.level_2;

public class Lv2피로도 {

    private static boolean[] visited;
    private static int[][] map;
    private static int answer;

    public static int solution(int k, int[][] dungeons) {
        answer = 0;
        map = dungeons;
        visited = new boolean[dungeons.length];

        DFS(0, 0, k);

        System.out.println(answer);
        return answer;
    }

    private static void DFS(int v, int s, int k) {

        if (v == map.length) {
            answer = Math.max(answer, s);
        } else {
            for (int i = 0; i < map.length; i++) {
                int min = map[i][0];
                int waste = map[i][1];
                if (!visited[i]) {
                    visited[i] = true;
                    if (k >= min) {
                        DFS(v+1,s+1, k-waste);
                    } else {
                        DFS(v+1,s, k);
                    }
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] dungeons = {
                {80, 20},
                {50, 40},
                {30, 10}
        };

        solution(80, dungeons);
    }
}
