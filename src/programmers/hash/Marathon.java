package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Marathon {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> pMap = new HashMap<>();

        for (String s : participant) {
            pMap.put(s, pMap.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            pMap.put(s, pMap.get(s) - 1);
            if (pMap.get(s) == 0) {
                pMap.remove(s);
            }
        }
        for (String s : pMap.keySet()) {
            answer = s;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] p = {"mislav", "stanko", "mislav", "ana"};
        String[] c = {"stanko", "ana", "mislav"};
        System.out.println(solution(p, c));
    }
}
