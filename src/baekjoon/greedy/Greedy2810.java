package baekjoon.greedy;

import java.util.Scanner;

public class Greedy2810 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();

        int cnt = 1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'S') {
                cnt++;
            } else if (str.charAt(i) == 'L') {
                i++;
                cnt++;
            }
        }

        if (cnt > n) {
            System.out.println(n);
        } else {
            System.out.println(cnt);
        }

    }
}
