package programmers.level_1;

import java.util.HashMap;
import java.util.Map;

public class AthletesNoFinished {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
    
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                answer = s;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        solution(participant, completion);
    }

}
