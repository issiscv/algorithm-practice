package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BruteForce2583 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    private static int[][] arr;
    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        
        //5행 7열
        
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int ax = Integer.parseInt(st.nextToken());//4 -> y
            int ay = Integer.parseInt(st.nextToken());//0 -> x

            int bx = Integer.parseInt(st.nextToken());//6 -> y
            int by = Integer.parseInt(st.nextToken());//2 -> x

            for (int j = ay; j < by; j++) {
                for (int k = ax; k < bx; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    max = 0;
                    DFS(i, j);
                    list.add(max);
                    cnt++;
                }
            }
        }

        Collections.sort(list);
        System.out.println(cnt);

        for (Integer tmp : list) {
            System.out.print(tmp + " ");
        }

    }

    static int max;

    private static void DFS(int i, int j) {

        arr[i][j] = 2;
        max++;

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx >= 0 && nx< n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
                DFS(nx, ny);
            }

        }

    }
}
