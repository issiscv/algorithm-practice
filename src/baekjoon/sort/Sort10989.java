package baekjoon.sort;

import java.io.*;
import java.util.*;

public class Sort10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (int i : arr) {
            sb.append(i).append("\n");
        }
        System.out.println(sb.toString());
    }

}
