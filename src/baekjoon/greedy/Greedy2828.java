package baekjoon.greedy;

import java.util.Scanner;

public class Greedy2828 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();//스크린 크기
        int B = scanner.nextInt();//바구니 크기
        int A = scanner.nextInt();//사과 개수

        int sIdx = 1;
        int sum = 0;

        for (int i = 0; i < A; i++) {
            int tmp = scanner.nextInt();//1 5 3

            int eIdx = sIdx + B - 1;

            if (tmp >= sIdx && tmp <= eIdx) {
                continue;
            }

            if (tmp > eIdx) {
                int a = tmp - eIdx;
                sum += a;
                sIdx += a;
                continue;
            }

            if (tmp < sIdx) {
                int a = sIdx - tmp;
                sum += a;
                sIdx -= a;
                continue;
            }
        }

        System.out.println(sum);
    }
}
