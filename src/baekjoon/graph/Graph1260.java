package baekjoon.graph;

import java.util.*;

public class Graph1260 {

    private static List<List<Integer>> list;
    private static boolean[] arr;

    public static void DFS(int v) {

        System.out.print(v + " ");
        arr[v] = false;
        for (int i : list.get(v)) {
            if (arr[i])
                DFS(i);
        }
    }

    private static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        arr[v] = false;

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            System.out.print(poll + " ");
            for (int i : list.get(poll)) {
                if (arr[i]) {
                    queue.offer(i);
                    arr[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int V = scanner.nextInt();

        list = new ArrayList<>();
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
        System.out.println();
        Arrays.fill(arr, true);
        BFS(V);
    }
}
