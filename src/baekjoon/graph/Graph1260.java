package baekjoon.graph;

import java.util.*;

public class Graph1260 {

    public static List<List<Integer>> list = new ArrayList<>();
    public static boolean[] arr;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int V = scanner.nextInt();

        arr = new boolean[N+1];
        Arrays.fill(arr, true);

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(list.get(i));
        }

        DFS(V);
        Arrays.fill(arr, true);
        System.out.println();
        BFS(V);
    }

    public static void DFS(int v) {
        System.out.print(v + " ");
        arr[v] = false;

        for (int tmp : list.get(v)) {
            if (arr[tmp]) {
                DFS(tmp);
            }
        }
    }
    
    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        arr[v] = false;
        System.out.print(v + " ");

        while (!queue.isEmpty()) {
            int tmp = queue.poll();

            for (int t : list.get(tmp)) {
                if (arr[t]) {
                    queue.offer(t);
                    arr[t] = false;
                    System.out.print(t + " ");
                }
            }
        }
    }
}
