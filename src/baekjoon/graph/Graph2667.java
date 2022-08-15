package baekjoon.graph;

import java.util.*;

public class Graph2667 {

    static int N;
    static int cnt = 2;
    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        arr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            String str = scanner.next();
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] == 1) {
                    DFS(i, j);
                    cnt++;
                }
            }
        }
    
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 2; i <= cnt-1; i++) {
            map.put(i, 0);
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (map.containsKey(arr[i][j])) {
                    map.put(arr[i][j], map.get(arr[i][j]) + 1);
                }
            }
        }
    
        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            list.add(map.get(key));
        }

        Collections.sort(list);

        System.out.println(cnt-2);
        for (int i : list) {
            System.out.println(i);
        }
        
    }

    private static void DFS(int a, int b) {

        arr[a][b] = cnt;

        for (int k = 0; k < 4; k++) {
            int x = a + dx[k];
            int y = b + dy[k];

            if (x >= 1 && x <= N && y >= 1 && y <= N && arr[x][y] == 1) {
                DFS(x, y);
            }
        }
    }
}
