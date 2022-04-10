package baekjoon.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2110 {

    private static int[] arr;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int C = scanner.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int lt = 0;
        int rt = Arrays.stream(arr).max().getAsInt() + 1;

        while (lt < rt) {
            int mid = (lt + rt) / 2;
            int ap = find(mid);

            if (ap >= C) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }

        System.out.println(lt-1);
    }

    private static int find(int mid) {
        int answer = 1;
        int before = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - before >= mid) {
                before = arr[i];
                answer++;
            }
        }
        return answer;
    }
}
