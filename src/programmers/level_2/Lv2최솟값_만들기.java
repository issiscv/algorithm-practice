package programmers.level_2;

import java.util.Arrays;
import java.util.Collections;

public class Lv2최솟값_만들기 {

    public static int solution(int []a, int []b) {
        int answer = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[b.length-i-1];
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};
        solution(a,	b);
    }

}
