package programmers.level_2;

import java.util.*;

public class Lv2튜플 {

    public static int[] solution(String s) {
        int[] answer = {};

        s = s.substring(1, s.length()-1);

        Stack<Character> stack = new Stack<>();

        List<String> list = new ArrayList<>();

        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && s.charAt(i) == ',')
                continue;

            if (stack.isEmpty() && s.charAt(i) == '{')  {
                stack.push(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == '}') {
                stack.pop();
                list.add(tmp);
                tmp = "";
                continue;
            }

            if (s.charAt(i) != ',')
                tmp += s.charAt(i);
            else
                tmp += " ";

        }

        Collections.sort(list, (o1, o2) -> o1.length()-o2.length());

        List<Integer> setList = new ArrayList<>();

        for (String s1 : list) {
            String[] split = s1.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (!setList.contains(Integer.parseInt(split[i]))) {
                    setList.add(Integer.parseInt(split[i]));
                }
            }
        }

        answer = setList.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        String arr = "{{20,111},{111}}";
        solution(arr);
    }

}
