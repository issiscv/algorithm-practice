package baekjoon.greedy;

import java.util.Scanner;

public class Greedy13413 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();

            String target = scanner.next();
            String goal = scanner.next();

            int w = 0;
            int b = 0;

            for (int j = 0; j < target.length(); j++) {
                if (target.charAt(j) != goal.charAt(j)) {
                    if (target.charAt(j) == 'W') {
                        w++;
                    } else {gi
                        b++;
                    }
                }
            }

            if (w > b) {
                System.out.println(b + (w - b));
            } else {
                System.out.println(w + (b - w));
            }
        }
    }
}
