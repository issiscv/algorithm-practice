package section7_recursive_tree_graph;

import java.util.Scanner;

public class SixPartialSet {

    static int[] arr;
    static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n+1];

        DFS(1);
    }

    private static void DFS(int i) {

        if (i > n) {
            for (int j = 1; j <= n; j++) {
                if (arr[j] == 0) System.out.print(j + " ");
            }
            System.out.println();
            return;
        }
        else{
            arr[i] = 0;
            DFS(i+1);

            arr[i] = 1;
            DFS(i+1);
        }
    }
}
