package programmers.kakao.level1;

import java.util.*;

public class Report {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> idx = new HashMap<>();
        Map<String, HashSet<String>> map = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String s = id_list[i];
            idx.put(s, i);
            map.put(s, new HashSet<>());
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String reporter = str[0];
            String target = str[1];

            map.get(reporter).add(target);
        }

        for (String s : map.keySet()) {
            HashSet<String> set = map.get(s);
            if (set.size() >= k) {
                for (String str : set) {
                    answer[idx.get(str)]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        solution(idList, report, k);

    }
}
