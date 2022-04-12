package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int m = Integer.parseInt(st.nextToken());

            int lt = 0;
            int rt = N - 1;


            boolean flag = false;
            while (lt <= rt) {
                int mid = (lt + rt) / 2;
                int target = arr[mid];

                if (target == m) {
                    flag = true;
                    break;
                }

                if(target > m) {
                    rt = mid - 1;
                }
                else {
                    lt = mid + 1;
                }
            }

            if (flag) sb.append("1 ");
            else sb.append("0 ");
        }
        System.out.println(sb.toString());
    }
}
