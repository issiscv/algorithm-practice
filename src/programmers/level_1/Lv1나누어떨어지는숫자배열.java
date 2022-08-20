package programmers.level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lv1나누어떨어지는숫자배열 {

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            if (number % divisor == 0) {
                list.add(number);
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        Collections.sort(list);

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        solution(arr, divisor);

    }
}
