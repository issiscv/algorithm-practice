package programmers.level_1;

import java.util.Arrays;

public class Lv1평균_구하기 {

    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,4});
    }

}
