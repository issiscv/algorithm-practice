package programmers.level_1;

import java.util.HashMap;
import java.util.Map;

public class NumericString {

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

        String tmp = "";
        String result = "";

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                result += c;
            } else {
                tmp += c;
                if (map.containsKey(tmp)) {
                    result += map.get(tmp);
                    tmp = "";
                }
            }
        }


        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        solution("one4seveneight");
    }

}
