package baekjoon.greedy;

import java.util.*;

public class Greedy1700 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            list.add(scanner.nextInt());
        }

        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < K; i++) {
            int t = list.get(i);

            if (set.contains(t)) continue;
            if (set.size() < N) {
                set.add(t);
                continue;
            }
            int max = -1;
            int idx = -1;
            for (int s : set) {
                int tmp = 0;
                List<Integer> subList;
                subList = list.subList(i+1, K);

                if (subList.contains(s)) {
                    tmp = subList.indexOf(s) + 1;
                } else {
                    tmp = K - i -1;
                }
                if (tmp > max) {
                    max = tmp;
                    idx = s;
                }
            }
            set.remove(idx);
            set.add(t);
            answer++;
        }
        System.out.println(answer);

    }
}
