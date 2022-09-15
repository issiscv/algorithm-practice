package programmers.level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lv2압축 {

    public static int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();

        int idx = 27;
        Map<String, Integer> dictionary = new HashMap<>();

        for (int i = 1; i <= 26; i++) {
            char tmp = (char) ('A' + i - 1);
            dictionary.put(String.valueOf(tmp), i);
        }

        for (int i = 0; i < msg.length(); i++) {
            int a = 1;
            while (i + a <= msg.length() && dictionary.containsKey(msg.substring(i, i+a))) {
                a++;
            }

            if(i+a> msg.length()){
                list.add(dictionary.get(msg.substring(i)));
                break;
            }

            list.add(dictionary.get(msg.substring(i, i + a - 1)));
            dictionary.put(msg.substring(i, i + a), idx++);
            i += (a - 2);
        }

        return list.stream().mapToInt(m -> m).toArray();
    }

    public static void main(String[] args) {
        int[] s = solution("KAKAO");
        for (int t : s) {
            System.out.println(t);
        }
    }

}
