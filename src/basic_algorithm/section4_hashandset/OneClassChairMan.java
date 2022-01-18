package basic_algorithm.section4_hashandset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OneClassChairMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int get = map.getOrDefault(str.charAt(i), 0);
            map.put(str.charAt(i), ++get);
        }

        int max = Integer.MIN_VALUE;
        char answer = ' ';
        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                answer = c;
            }
        }

        System.out.println(answer);
    }
}
