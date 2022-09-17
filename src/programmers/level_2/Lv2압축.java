package programmers.level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lv2압축 {

    public static int[] solution(String msg) {
        int[] answer = {};

        Map<String, Integer> map = new HashMap<>();
        int idx = 27;
        for (int i = 1; i <= 26; i++) {
            String key = String.valueOf((char) ('A' + i - 1));
            map.put(key, i);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < msg.length(); i++) {
            int a = 1;

            while (i + a <= msg.length() && map.containsKey(msg.substring(i, i + a))) {
                a++;
            }

            if(i+a> msg.length()){
                list.add(map.get(msg.substring(i)));
                break;
            }

            list.add(map.get(msg.substring(i, i + a - 1)));
            map.put(msg.substring(i, i + a), idx++);

            i += (a-2);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] s = solution("TOBEORNOTTOBEORTOBEORNOT");
        for (int t : s) {
            System.out.println(t);
        }
    }

}
