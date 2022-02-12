package baekjoon.greedy;

import java.util.Scanner;

public class Greedy1052 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int answer = 0;
        while (true) {

            int num = N;
            int count = 0;
            while (num != 0) {

                if (num % 2 != 0) {
                    count++;
                }
                num = num / 2;
            }

            if (count <= K) break;

            N++;
            answer++;
        }

        System.out.println(answer);
    }
}
