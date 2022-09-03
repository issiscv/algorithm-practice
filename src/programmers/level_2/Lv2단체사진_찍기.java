package programmers.level_2;

import java.util.HashMap;
import java.util.Map;

public class Lv2단체사진_찍기 {

    private static Map<Character, Integer> map = new HashMap<>();
    private static int[] ch = new int[8];
    private static boolean[] visited = new boolean[8];
    private static int answer;
    private static String[] d;

    public static int solution(int n, String[] data) {
        answer = 0;
        d = data;

        map.put('A', 0);
        map.put('C', 1);
        map.put('F', 2);
        map.put('J', 3);
        map.put('M', 4);
        map.put('N', 5);
        map.put('R', 6);
        map.put('T', 7);

        DFS(0);

        return answer;
    }

    private static void DFS(int v) {
        if (v == 8) {
            if (check()) {
                answer++;
            }
        } else {
            for (int i = 0; i < 8; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    ch[v] = i;
                    DFS(v+1);
                    visited[i] = false;
                }
            }
        }
    }

    private static boolean check() {

        for (String s : d) {
            int a = ch[map.get(s.charAt(0))];
            int b = ch[map.get(s.charAt(2))];

            char operator = s.charAt(3);
            int gap = s.charAt(4) - '0' + 1;

            if (operator == '=') {
                if (Math.abs(a-b) != gap) return false;
            } else if (operator == '>') {
                if (Math.abs(a-b) <= gap) return false;
            } else {
                if (Math.abs(a-b) >= gap) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 2;
        String[] data = {"M~C<2", "C~M>1"};
        System.out.println(solution(n, data));
    }
}
