package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

    public static int solution(String[][] clothes) {
        int answer = clothes.length;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
                map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);

        }

        if (map.size() > 1) {
            int mul = 1;

            for (String s : map.keySet()) {
                mul *= (map.get(s) + 1);
            }
            answer += (mul-1);
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {

        String[][] clothes = {
                {"crowmask", "face"},
                {"bluesunglasses", "face"},
                {"smoky_makeup", "face"}
        };

        solution(clothes);
    }
}
