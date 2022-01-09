package section8_dfs_bfs;

import java.util.Scanner;

public class OneSamePartialSum {

    public static int n;
    public static String answer = "NO";
    public static boolean flag = false;
    public static int total = 0;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        solution(0, 0, arr);

        System.out.println(answer);

    }

    private static void solution(int s, int sum, int[] arr) {
        if (flag) return;
        if (total / 2 < sum) return;
        if (s == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
                return;
            }
        } else {
            solution(s+1, sum, arr);
            solution(s+1, sum + arr[s], arr);
        }
    }

}
