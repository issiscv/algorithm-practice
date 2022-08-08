package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sort10814 {

    private static class Member implements Comparable<Member> {

        private int age;
        private String name;
        private int priority;

        public Member(int age, String name, int priority) {
            this.age = age;
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Member o) {
            if (this.age == o.age) {
                return this.priority - o.priority;
            }
            return this.age - o.age;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Member> list = new ArrayList<>();

        int p = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken(), p++));
        }

        Collections.sort(list);

        for (Member member : list) {
            System.out.println(member.age + " " + member.name);
        }

    }
}
