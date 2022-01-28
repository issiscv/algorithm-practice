package baekjoon.greedy;

import java.util.Scanner;

public class Greedy4796 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        int idx = 1;
        while (true) {
            int l = scanner.nextInt();
            int p = scanner.nextInt();
            int v = scanner.nextInt();

            if (l == 0 && p == 0 && v == 0) {
                break;
            }

            int a = v / p;
            int b = v % p;

            System.out.println("Case "+ idx++ +": " + ((a * l) + Math.min(b, l)));
//            Case 1: 14
//            Case 2: 11
        }

    }
}
