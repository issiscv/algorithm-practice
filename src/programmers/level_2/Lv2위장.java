package programmers.level_2;

import java.util.HashMap;
import java.util.Map;

public class Lv2위장 {

    public static int solution(String[][] clothes) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];

            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        //2, 1
        if (map.size() > 1) {
            int mul = 1;

            for (String s : map.keySet()) {
                mul *=  (map.get(s) + 1);
            }
            answer = mul-1;
        }


        return answer;
    }

    public static void main(String[] args) {
        String[][] strings = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        solution(strings);
    }

}
