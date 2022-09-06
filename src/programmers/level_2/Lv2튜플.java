package programmers.level_2;

import java.util.*;

public class Lv2튜플 {

    public static int[] solution(String s) {
        int[] answer = {};

        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        List<String> list = new ArrayList<>();

        String tmp = "";
        for (int i = 1; i < array.length-1; i++) {
            if (array[i] == ',' && !stack.isEmpty()) {
                tmp += " ";
                continue;
            } else if (array[i] == ',') {
                continue;
            }

            if (stack.isEmpty()) {
                stack.push(array[i]);
            } else {
                if (Character.isDigit(array[i])) {
                    tmp += array[i];
                } else if (array[i] == '}') {
                    list.add(tmp);
                    tmp = "";
                    stack.pop();
                }
            }
        }

        Collections.sort(list, (o1, o2) -> o1.length() - o2.length());

        List<String> setList = new ArrayList<>();

        for (String str : list) {
            String[] split = str.split(" ");
            for (String sp : split) {
                if (!setList.contains(sp)) {
                    setList.add(sp);
                }
            }
        }

        answer = new int[setList.size()];

        for (int i = 0; i < setList.size(); i++) {
            answer[i] = Integer.parseInt(setList.get(i));
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        String arr = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        solution(arr);
    }

}
