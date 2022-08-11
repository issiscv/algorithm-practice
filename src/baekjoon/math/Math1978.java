package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Math1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] flag = new boolean[1001];

        Arrays.fill(flag, true);

        flag[0] = false;
        flag[1] = false;

        for (int i = 2; i < 1001; i++) {
            for (int j = i * 2; j < 1001; j += i) {
                flag[j] = false;
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (flag[arr[i]] == true) cnt++;
        }

        System.out.println(cnt);
    }
}
