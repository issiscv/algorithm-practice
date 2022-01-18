package basic_algorithm.section4_hashandset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String as = scanner.next();
        String bs = scanner.next();

        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for (int i = 0; i < as.length(); i++) {
            mapA.put(as.charAt(i), mapA.getOrDefault(as.charAt(i), 0) + 1);
        }

        for (int i = 0; i < bs.length(); i++) {
            mapB.put(bs.charAt(i), mapB.getOrDefault(bs.charAt(i), 0) + 1);
        }

        if (mapA.equals(mapB)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
