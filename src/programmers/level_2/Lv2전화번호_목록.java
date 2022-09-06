package programmers.level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lv2전화번호_목록 {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap();

        for (String p : phone_book) {
            map.put(p, 1);
        }

        for (String key : map.keySet()) {
            for (int i = 0; i < key.length(); i++) {
                String substring = key.substring(0, i);
                if (map.containsKey(substring)) {
                    return false;
                }
            }
        }


        return true;
    }

    public static void main(String[] args) {
        boolean solution = solution(new String[]{"123","456","789"});
        System.out.println(solution);
    }

}
