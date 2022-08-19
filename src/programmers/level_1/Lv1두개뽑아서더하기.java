package programmers.level_1;

import java.util.*;

public class Lv1두개뽑아서더하기 {

    public static int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> list = new ArrayList<>();

        for (Integer i : set) {
            list.add(i);
        }
        Collections.sort(list);

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        solution(numbers);
    }
}
