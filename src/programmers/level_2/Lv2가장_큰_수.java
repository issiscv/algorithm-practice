package programmers.level_2;

import java.util.Arrays;
import java.util.Comparator;

public class Lv2가장_큰_수 {

    public static String solution(int[] numbers) {
        String answer = "";

        String[] strArr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for (String s : strArr) {
            answer += s;
        }

        if (answer.charAt(0) == '0') return "0";

        return answer;
    }

    public static void main(String[] args) {
        String solution = solution(new int[]{6, 10, 2});
        System.out.println(solution);
    }

}
