package programmers.level_2;

import java.util.*;

public class Lv2영어_끝말잇기 {

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < words.length; i++) {
            int idx = i % n;//0 1 2
            list.get(idx).add(words[i]);
        }

        String lastWord = "";
        Set<String> set = new HashSet<>();

        int len = words.length;

        for (int i = 0; i < len; i++) {
            int a = i / n;
            int b = i % n;

            String s = list.get(b).get(a);

            if (i == 0) {
                lastWord = s;
                set.add(s);
                continue;
            }


            char now = s.charAt(0);
            char last = lastWord.charAt(lastWord.length() - 1);


            if (!set.contains(s) && now == last) {
                lastWord = s;
                set.add(s);
            } else {
                answer[0] = b+1;
                answer[1] = a+1;
                break;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        for (int si : solution) {
            System.out.println(si);
        }
    }

}
