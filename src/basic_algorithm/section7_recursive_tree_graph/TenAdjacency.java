package basic_algorithm.section7_recursive_tree_graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TenAdjacency {

    static int n, m;
    static int answer = 0;
    static int[] ch;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        ch = new int[n+1];
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            list.get(a).add(b);
        }

        DFS(1, list);
        System.out.println(answer);
    }

    private static void DFS(int i, List<List<Integer>> list) {

        if (i == n) {
            answer++;
            return;
        }
        for (int t :  list.get(i)) {

            if (ch[t] == 0) {
                ch[i] = 1;
                DFS(t, list);
                ch[i] = 0;
            }
        }
    }
}
