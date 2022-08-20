package programmers.level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lv1문자열내마음대로정렬하기 {

    public static String[] solution(String[] strings, int n) {

        List<String> list = new ArrayList<>();

        for (String string : strings) {
            list.add(string);
        }

        Collections.sort(list, (o1, o2) -> {
            char a = o1.charAt(n);
            char b = o2.charAt(n);

            if (a == b) {
                return o1.compareTo(o2);
            }

            return a-b;
        });

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] str = {"sun", "bed", "car"};
        int n = 1;

        solution(str, n);
    }
}
