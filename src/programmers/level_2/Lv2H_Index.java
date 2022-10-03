package programmers.level_2;

import java.util.Arrays;
import java.util.Collections;

public class Lv2H_Index {

    public static int solution(int[] citations) {
        int answer = 0;

        //0 1 3 5 6
        int max = Arrays.stream(citations).max().getAsInt();

        for (int i = 0; i <= max; i++) {
            int over = 0;//5
            int under = 0;//1

            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i) {
                    over++;
                }
                if (citations[j] <= i) {
                    under++;
                }
            }

            if (over >=i && under <= i) {
                answer = Math.max(answer, i);
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{3, 0, 6, 1, 5});
    }

}
