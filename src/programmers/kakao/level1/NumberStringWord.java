package programmers.kakao.level1;

import java.util.HashMap;
import java.util.Map;

public class NumberStringWord {

    public static int solution(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        int answer = 0;

        String result = "";
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                tmp += c;
                if (map.containsKey(tmp)) {
                    result += map.get(tmp);
                    tmp = "";
                }
            } else {
                result += c;
            }
        }

        answer = Integer.parseInt(result);

        return answer;
    }

    public static void main(String[] args) {
        String str = "123";
        solution(str);
    }
}
