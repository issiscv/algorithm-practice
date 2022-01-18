package basic_algorithm.section8_dfs_bfs;

import java.util.Scanner;

public class FourDuplicatedPermutation {

    static int[] ch;
    static int n, m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();//3
        m = scanner.nextInt();//2
        ch = new int[m];//2

        DFS(0);

    }

    private static void DFS(int i) {
        if (i == m) {
            for (int j = 0; j < m; j++) {
                System.out.print(ch[j] + " ");
            }
            System.out.println();
        } else {
            for (int j = 1; j <= n; j++) {
                ch[i] = j;
                DFS(i+1);
            }
        }
    }

}
