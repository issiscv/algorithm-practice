package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Greedy1931 {

    private static class Conference implements Comparable<Conference> {
        int s;
        int e;

        public Conference(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Conference o) {
            if (this.e == o.e) {
                return this.s - o.s;
            }
            return this.e - o.e;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Conference> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            list.add(new Conference(s, e));
        }

        Collections.sort(list);

        int tmp = list.get(0).e;
        int result = 0;
        for (int i = 1; i < N; i++) {
            if (list.get(i).s >= tmp) {
                tmp = list.get(i).e;
                result++;
            }
        }
        System.out.println(result+1);
    }
}
