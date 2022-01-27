package baekjoon.greedy;

import java.util.Scanner;

public class Greedy1789 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long sum = 0;
        int count = 0;

        for (int i = 1; ; i++) {
            if (sum > n) {
                count--;
                break;
            }
            sum += i;
            count++;
        }
        System.out.println(count);
    }
}
