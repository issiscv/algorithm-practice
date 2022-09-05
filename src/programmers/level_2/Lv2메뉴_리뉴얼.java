package programmers.level_2;

import java.util.*;

public class Lv2메뉴_리뉴얼 {

    private static char[] array;
    private static int n;
    private static int m;
    private static char[] ch;
    private static int idx;

    private static Map<String, Integer> courseMap = new HashMap<>();
    private static Map<Integer, List<String>> duplicatedCourseMap = new HashMap<>();
    private static Map<String, Integer> answerMap = new HashMap<>();

    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        for (int i = 1; i <= orders.length; i++) {
            duplicatedCourseMap.put(i, new ArrayList<>());
        }

        makeCourse(orders);

        findDuplicatedOrderedMenu(orders.length);

        List<String> list = new ArrayList<>();

        for (int i = 0; i < course.length; i++) {
            int max = Integer.MIN_VALUE;
            String maxKey = "";
            for (String key : answerMap.keySet()) {
                if (key.length() == course[i]) {
                    if (answerMap.get(key) > max) {
                        max = answerMap.get(key);
                        maxKey = key;
                    }
                }
            }
            if (maxKey.length() > 0)
                list.add(maxKey);
            answerMap.remove(maxKey);

            for (String key : answerMap.keySet()) {
                if (key.length() == course[i]) {
                    if (answerMap.get(key) == max) {
                        list.add(key);
                    }
                }
            }
        }
        Collections.sort(list);

        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }

    private static void findDuplicatedOrderedMenu(int length) {
        for (String s : courseMap.keySet()) {
            int cnt = 0;
            for (int i = 1; i <= length; i++) {
                List<String> list = duplicatedCourseMap.get(i);
                if (list.contains(s)) {
                    cnt++;
                }
            }

            if (cnt >= 2) {
                answerMap.put(s, courseMap.get(s));
            }
        }
    }

    private static void makeCourse(String[] orders) {
        for (int i = 0; i < orders.length; i++) {
            String order = orders[i];

            array = order.toCharArray();
            n = order.length();
            idx = i + 1;
            for (int j = 2; j <= orders.length; j++) {
                m = j;
                ch = new char[m];
                combi(0, 1);
            }
        }
    }

    private static void combi(int v, int s) {
        if (v == m) {
            StringBuilder sb = new StringBuilder();
            for (char c : ch) {
                sb.append(c);
            }

            String str = sb.toString();

            char[] array = str.toCharArray();
            Arrays.sort(array);
            str = new String(array);

            courseMap.put(str, courseMap.getOrDefault(str, 0) + 1);
            List<String> list = duplicatedCourseMap.get(idx);
            list.add(str);
        } else {
            for (int i = s; i <= n; i++) {
                ch[v] = array[i - 1];
                combi(v + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2, 3, 4};

        solution(orders, course);
    }
}
