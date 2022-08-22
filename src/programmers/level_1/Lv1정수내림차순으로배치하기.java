package programmers.level_1;

import java.util.Arrays;
import java.util.Collections;

public class Lv1정수내림차순으로배치하기 {

    public static long solution(long n) {
        long answer = 0;

        String str = String.valueOf(n);
        char[] array = str.toCharArray();

        Integer[] arr = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i] - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        String numberStr = "";
        for (int i : arr) {
            numberStr += i;
        }

        answer = Long.parseLong(numberStr);
        return answer;
    }

    public static void main(String[] args) {
        solution(118372);
    }

}
