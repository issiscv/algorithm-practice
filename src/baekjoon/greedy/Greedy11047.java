package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Greedy11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list, Collections.reverseOrder());

        int cnt = 0;

        for (int i = 0; i < list.size(); i++) {
            if (K == 0) break;
            if (list.get(i) <= K) {
                cnt += K / list.get(i);
                K = K % list.get(i);
            }
        }

        System.out.println(cnt);

    }
}
