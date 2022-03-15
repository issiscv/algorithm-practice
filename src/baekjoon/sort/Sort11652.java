package baekjoon.sort;

import java.util.*;

public class Sort11652 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long a = scanner.nextLong();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        long idx = -1;

        for (long key : map.keySet()) {

            if (map.get(key) > max) {
                max = map.get(key);
                idx = key;
            } else if (map.get(key) == max) {
                idx = Math.min(idx, key);
            }
        }
        System.out.println(idx);
    }
}
