package section7_recursive_tree_graph;

import java.util.Scanner;

public class FourFibonacci {

    static int n;
    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        arr = new int[n+1];
        solution(n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int solution(int i) {
        if (i == 0 || i == 1) {
            arr[i] = 1;
            return 1;
        }
        return arr[i] = solution(i-1) + solution(i-2);
    }
}
