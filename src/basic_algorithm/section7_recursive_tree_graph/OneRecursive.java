package basic_algorithm.section7_recursive_tree_graph;

import java.util.Scanner;

public class OneRecursive {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        DFS(0);
    }

    private static void DFS(int i) {
        if (i == n) return;
        System.out.println(i+1);
        DFS(i+1);
    }
}
