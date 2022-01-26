package baekjoon.greedy;

import java.util.Scanner;

public class Greedy5585 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] rest = {500, 100, 50, 10, 5, 1};
        int count = 0;
        int tmp = 1000 - n;
        for (int i = 0; i < rest.length; i++) {

            if (rest[i] <= tmp) {
                count += tmp / rest[i];// 20 / 2 == 2
                tmp = tmp % rest[i];
            }
        }
        System.out.println(count);
    }
}
