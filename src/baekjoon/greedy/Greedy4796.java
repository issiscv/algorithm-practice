package baekjoon.greedy;

import java.util.Scanner;

public class Greedy4796 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idx = 0;

        while (true) {
            int l = scanner.nextInt();
            int p = scanner.nextInt();
            int v = scanner.nextInt();

            if (v == 0) {
                break;
            }
            int i = v / p * l;
            int j = Math.min(v % p, l);
            idx++;
            System.out.println("Case " + (idx) + ": " +(i + j));
        }
    }

}
