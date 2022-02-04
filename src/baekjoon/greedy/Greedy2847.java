package baekjoon.greedy;

import java.util.Scanner;

public class Greedy2847 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0; // 정답, 동준이가 점수를 내린 횟수
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt(); // 입력을 받음

        int answer = 0;

        //5 3 7 5
        for (int i = n-2; i >= 0; i--) {

            if (arr[i] >= arr[i+1]) {
                int tmp = arr[i] - arr[i+1] + 1;
                answer += tmp;
                arr[i] = arr[i] - tmp;
            }
        }

        System.out.println(answer);
    }
}
