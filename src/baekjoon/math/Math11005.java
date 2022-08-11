package baekjoon.math;

import java.util.Scanner;

public class Math11005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int B = scanner.nextInt();

        char[] arr = new char[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(i + 'A');
        }

        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            int tmp = (N % B);

            if (tmp >= 10) {
                sb.append(arr[tmp - 10]);
            } else {
                sb.append(tmp);
            }
            N = N / B;
        }
        System.out.println(sb.reverse().toString());
    }
}
