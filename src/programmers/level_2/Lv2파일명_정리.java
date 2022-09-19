package programmers.level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lv2파일명_정리 {

    private static class File implements Comparable<File> {
        private String head;
        private String number;
        private String tail;
        private int idx;

        public File(String head, String number, String tail, int idx) {
            this.head = head;
            this.number = number;
            this.tail = tail;
            this.idx = idx;
        }

        @Override
        public int compareTo(File o) {
            if (this.head.equalsIgnoreCase(o.head)) {
                if (Integer.parseInt(this.number) == Integer.parseInt(o.number)) {
                    return this.idx - o.idx;
                }

                return Integer.parseInt(this.number) - Integer.parseInt(o.number);
            }
            return this.head.toLowerCase().compareTo(o.head.toLowerCase());
        }
    }

    public static String[] solution(String[] files) {
        String[] answer = {};

        List<File> list = new ArrayList<>();
        int idx = 1;

        for (String f : files) {
            int i = 0;

            for (; i < f.length(); i++) {
                if (Character.isDigit(f.charAt(i)))
                    break;
            }
            int j = i;
            String head = f.substring(0, i);

            for (; i < f.length(); i++) {
                if (!Character.isDigit(f.charAt(i)))
                    break;
            }

            String number = f.substring(j, i);
            String tail = f.substring(i);

            list.add(new File(head, number, tail, idx));
            idx++;
        }

        Collections.sort(list);

        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).head + list.get(i).number + list.get(i).tail;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        solution(arr);
    }

}
