package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int tmp = Integer.parseInt(st.nextToken());


            Integer upperBound = upperBound(arr, N, tmp);
            Integer lowerBound = lowerBound(arr, N, tmp);

            int gap = upperBound - lowerBound;

            sb.append(gap).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static Integer lowerBound(int[] arr, int N, int tmp) {
        int lt = 0;
        int rt = N;

        while (lt < rt) {

            int mid = (lt + rt) / 2;

            int value = arr[mid];
            if (value < tmp) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }

        return lt - 1;
    }

    public static Integer upperBound(int[] arr, int N, int tmp) {
        int lt = 0;
        int rt = N;

        while (lt < rt) {

            int mid = (lt + rt) / 2;

            if (arr[mid] <= tmp) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }

        return lt - 1;
    }
}
