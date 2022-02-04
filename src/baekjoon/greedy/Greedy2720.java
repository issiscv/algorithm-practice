package baekjoon.greedy;

import java.util.Scanner;

public class Greedy2720 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] changes = {25, 10, 5, 1};//센트, 1달러 = 100 센트
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();//124, 25, 194 센트
        }

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int[] answer = new int[4];

            for (int j = 0; j < 4; j++) {
                answer[j] = tmp / changes[j];//24 / 10 -- > 2
                tmp = tmp % changes[j];
            }
            for (int j = 0; j < 4; j++) {
                System.out.print(answer[j] + " ");
            }
            System.out.println();
        }
    }
}
