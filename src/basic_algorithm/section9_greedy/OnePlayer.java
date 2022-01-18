package basic_algorithm.section9_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OnePlayer {

    private static class Player implements Comparable<Player>{
        int h;
        int w;

        public Player(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Player o) {
            return o.h - this.h;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Player> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();

            list.add(new Player(h, w));
        }
        Collections.sort(list);

        System.out.println(n - solution(list));
    }

    private static int solution(List<Player> list) {
        int answer = 0;
        for (Player a : list) {
            int tmp = 0;
            for (Player b : list) {
                if (b.h > a.h && b.w > a.w) {
                    tmp++;
                }
            }
            if (tmp >= 1) answer++;
        }
        return answer;
    }
}
