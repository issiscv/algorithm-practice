package baekjoon.bruteforcing;

import java.util.*;

public class BruteForce1759 {

    private static char[] arr;
    private static boolean[] visited;
    private static int l;
    private static int c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        l = scanner.nextInt();
        c = scanner.nextInt();

        arr = new char[c];
        visited = new boolean[c];

        for (int i = 0; i < c; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        Arrays.sort(arr);

        DFS(0, 0);

    }

    private static void DFS(int v, int count) {
        if (count == l) {
            int a = 0;
            int b = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < c; i++) {
                if (visited[i]) {
                    sb.append(arr[i]);
                }
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    a++;
                } else {
                    b++;
                }
            }
            if (a >= 1 && b >= 2) {
                System.out.println(sb.toString());
            }

        } else {
            for (int i = v; i < c; i++) {
                visited[i] = true;
                DFS(i+1, count+1);
                visited[i] = false;
            }
        }
    }
}
