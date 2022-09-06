package programmers.level_2;

import java.util.*;

public class Lv2뉴스_클러스트링 {

    public static int solution(String str1, String str2) {
        int answer = 0;

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        List<String> union = new ArrayList<>();
        List<String> interSection = new ArrayList<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length() - 1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);

            if (a >= 'a' && a <= 'z' && b >= 'a' && b <= 'z') {
                list1.add(a + "" + b);
            }

        }

        for (int i = 0; i < str2.length() - 1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);

            if (a >= 'a' && a <= 'z' && b >= 'a' && b <= 'z') {
                list2.add(a + "" + b);
            }
        }

        for (String s : list1) {

            if (list2.remove(s)) {
                interSection.add(s);
            }
            union.add(s);
        }

        for (String s : list2) {
            union.add(s);
        }
        double v = (double)interSection.size() / union.size();

        if (union.isEmpty()) v = 1;


        return (int) (v * 65536);
    }


    public static void main(String[] args) {
        int solution = solution("FRANCE", "french");
        System.out.println(solution);
    }

}

