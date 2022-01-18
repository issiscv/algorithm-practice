package basic_algorithm.section7_recursive_tree_graph;

import java.util.Scanner;

public class TwoRecursiveBinary {

    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        DFS(n);
    }

    private static void DFS(int n) {
        if (n == 0) return;
        DFS(n/2);
        System.out.print(n%2);
    }
}
