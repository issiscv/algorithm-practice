package section_2Array;

import java.util.Arrays;
import java.util.Scanner;

public class NineGrating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int par = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }

            par = Math.max(par, sum);

        }

        int ver = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }

            ver = Math.max(ver, sum);
        }

        max = Math.max(ver, par);

        int lin = Integer.MIN_VALUE;
        int lr = 0;
        int rl = 0;

        for (int i = 0; i < n; i++) {
            lr += arr[i][i];
            rl += arr[n-1-i][n-1-i];
        }

        lin = Math.max(lr, rl);

        max = Math.max(max, lin);

        System.out.println(max);
    }
}
