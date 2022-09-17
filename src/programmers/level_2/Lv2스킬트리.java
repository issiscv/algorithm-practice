package programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Lv2스킬트리 {

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String st : skill_trees) {
            boolean flag = true;

            Queue<Character> queue = new LinkedList<>();
            for (char c : skill.toCharArray()) {
                queue.offer(c);
            }

            for (char c : st.toCharArray()) {
                if (queue.contains(c)) {
                    if (queue.peek() == c) {
                        queue.poll();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] skillTrees = {"BACDE", "CBADF", "AECB", "BDA"};
        solution("CBD", skillTrees);
    }

}
