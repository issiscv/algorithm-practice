package baekjoon.bruteforcing;

import java.util.*;

public class BruteForce1759 {

    private static int n;
    private static int m;
    private static char[] arr;
    private static char[] password;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new char[m];
        password = new char[n];

        for (int i = 0; i < m; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        Arrays.sort(arr);

        combi(0, 1);

    }

    private static void combi(int v, int s) {

        if (v == n) {

            int moeum = 0;
            int zaeum = 0;

            for (int i = 0; i < n; i++) {
                int p = password[i];
                if (p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u')
                    moeum++;
                else
                    zaeum++;
            }

            if (moeum >= 1 && zaeum >= 2) {
                for (char i : password) {
                    System.out.print(i);
                }
                System.out.println();
            }

        } else {
            for (int i = s; i <= m; i++) {
                password[v] = arr[i-1];
                combi(v+1, i+1);
            }
        }

    }
}
