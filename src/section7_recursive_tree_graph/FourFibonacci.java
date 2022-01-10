package section7_recursive_tree_graph;

import java.util.Scanner;

public class FourFibonacci {

    static int n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n+1];

        DFS(n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int DFS(int n) {
        if (n == 0 || n== 1) {
            arr[n] = 1;
            return 1;
        }
        return arr[n] = DFS(n-1) + DFS(n-2);
    }
}
