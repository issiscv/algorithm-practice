package section7_recursive_tree_graph;

import java.util.Scanner;

public class ThreeFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        int n = scanner.nextInt();

        int dfs = DFS(n);
        System.out.println(dfs);
    }

    private static int DFS(int n) {
        if (n == 1) return 1;
        return n * DFS(n-1);
    }
}
