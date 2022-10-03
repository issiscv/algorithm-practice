package programmers.level_2;

import java.util.*;

public class Lv2영어_끝말잇기 {

    public static int[] solution(int n, String[] words) {
        int[] answer = {};
        answer = new int[2];

        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < words.length; i++) {
            list.get(i % n).add(words[i]);
        }

        Set<String> set = new HashSet<>();
        String lastWord = "";

        for (int i = 0; i < words.length; i++) {
            int a = i % n;//0 1 2 0 1 2
            int b = i / n;//0 0 0 1 1 1

            String str = list.get(a).get(b);

            if (i == 0) {
                set.add(str);
                lastWord = str;
                continue;
            }

            char now = str.charAt(0);
            char last = lastWord.charAt(lastWord.length()-1);

            if (now == last && !set.contains(str)) {
                set.add(str);
                lastWord = str;
            } else {
                answer[0] = a+1;
                answer[1] = b+1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        for (int si : solution) {
            System.out.println(si);
        }
    }

}
