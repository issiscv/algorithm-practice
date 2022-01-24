package programmers.sort;

import java.util.Arrays;

public class HIndex {

    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        //0 1 3 5 6
        for (int i = 0; i < citations.length; i++) {
            int tmp = citations.length - i;//5

            if (citations[i] >= tmp) {
                answer = citations[i];
                break;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};

        solution(citations);
    }
}
