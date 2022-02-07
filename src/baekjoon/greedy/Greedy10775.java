package baekjoon.greedy;

import java.util.Scanner;

public class Greedy10775 {

    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int G = scanner.nextInt();
        int P = scanner.nextInt();

        arr = new int[G+1];
        for (int i = 0; i <= G; i++) {
            arr[i] = i;
        }

        int answer = 0;

        for (int i = 0; i < P; i++) {
            int tmp = scanner.nextInt();//4
            int fa = find(tmp);
            if (fa == 0) break;

            union(fa, fa - 1);
            answer++;
        }
        System.out.println(answer);

    }

    private static void union(int x, int y) {
        int fx = arr[x];//4
        int fy = arr[y];//3

        if (fx != fy) {
            arr[fx] = fy;
        }
    }

    public static int find(int a) {
        if (a == arr[a]) {
            return a;
        } else {
            return arr[a] = find(arr[a]);
        }
    }
}
