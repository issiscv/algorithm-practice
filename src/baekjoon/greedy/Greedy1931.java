package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Greedy1931 {

    private static class Conference implements Comparable<Conference> {
        int start;
        int end;

        public Conference(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Conference o) {
            if (this.end == o.end) {
                return this.start - o.start;
            }
            return this.end - o.end;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        List<Conference> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            list.add(new Conference(s, e));
        }

        Collections.sort(list);

        int tmp = 0;
        int cnt = 0;

        for (Conference conference : list) {
            int start = conference.start;
            int end = conference.end;

            if (start >= tmp) {
                tmp = end;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
