package basic_algorithm.section9_greedy;

import java.util.Scanner;

public class SixDisJoinSet {

    static int n, m;
    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int fa = find(a);//1
            int fb = find(b);//2

            if (fa != fb) {
                arr[fa] = fb;
            }
        }

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int fa = find(x);
        int fb = find(y);
        if (fa != fb) System.out.println("NO");
        else System.out.println("YES");
    }

    private static int find(int v) {

        if (v == arr[v]) return v;
        else return find(arr[v]);
    }
}
