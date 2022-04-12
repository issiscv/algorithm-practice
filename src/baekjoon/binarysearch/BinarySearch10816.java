package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch10816 {

    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int m = Integer.parseInt(st.nextToken());

            sb.append(upperBound(m) - lowerBound(m)).append(" ");
        }
        System.out.println(sb.toString());
    }

    private static int lowerBound(int key) {

        int lt = 0;
        int rt = arr.length;

        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] < key) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }
        return lt - 1;
    }

    private static int upperBound(int key) {

        int lt = 0;
        int rt = arr.length;

        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] <= key) {
                lt = mid + 1;
            } else {
                rt= mid;
            }
        }

        return lt - 1;
    }
}
