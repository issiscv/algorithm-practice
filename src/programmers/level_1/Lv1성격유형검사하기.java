package programmers.level_1;

import java.util.HashMap;
import java.util.Map;

public class Lv1성격유형검사하기 {

    public static String solution(String[] survey, int[] choices) {
        String answer = "";

        int len = survey.length;
        Map<Character, Integer> map = new HashMap<>();

        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i = 0; i < len; i++) {

            int choice = choices[i];
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);

            if (choice > 4) {
                map.put(second, map.get(second) + choice - 4);
            } else {
                map.put(first, map.get(first) + 4 - choice);
            }

        }

        if (map.get('R') >= map.get('T'))
            answer = "R";
        else
            answer = "T";

        if (map.get('C') >= map.get('F'))
            answer += "C";
        else
            answer += "F";

        if (map.get('J') >= map.get('M'))
            answer += "J";
        else
            answer += "M";

        if (map.get('A') >= map.get('N'))
            answer += "A";
        else
            answer += "N";

        return answer;

    }

    public static void main(String[] args) {
        String[] str = {"TR", "RT", "TR"};
        int[] choice = {7, 1, 3};

        solution(str, choice);
    }
}
