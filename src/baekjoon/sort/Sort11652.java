package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sort11652 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(br.readLine());
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        long max = Long.MIN_VALUE;
        long number = -1;

        for (Long key : map.keySet()) {
            Integer value = map.get(key);
            if (value > max) {
                max = value;
                number = key;
            } else if (value == max) {
                number = Math.min(number, key);
            }
        }
        System.out.println(number);
    }
}
