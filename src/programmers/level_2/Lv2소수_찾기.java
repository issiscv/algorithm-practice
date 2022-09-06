package programmers.level_2;

import java.util.HashSet;
import java.util.Set;

public class Lv2소수_찾기 {

    private static int n;
    private static boolean[] visited;
    private static Set<Integer> set = new HashSet<>();

    public static int solution(String numbers) {

        n = numbers.length();
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            DFS(i, "", numbers);
        }

        int count = 0;
        for (Integer s : set) {

            if (isPrime(s)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int num) {

        if (num == 1 || num == 0) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static void DFS(int v, String ch, String numbers) {
        if (v == n) {
            set.add(Integer.parseInt(ch));
        } else {
            for (int i = 0; i < numbers.length(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    DFS(v+1, ch + numbers.charAt(i), numbers);
                    visited[i] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        int solution = solution("011");
    }

}
