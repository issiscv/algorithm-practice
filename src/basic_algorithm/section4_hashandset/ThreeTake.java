package basic_algorithm.section4_hashandset;

import java.util.*;

public class ThreeTake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());

        int lt = 0;
        for (int i = m; i < n; i++) {
            map.put(arr[lt], map.getOrDefault(arr[lt], 0) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            answer.add(map.size());
        }

        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }
}
