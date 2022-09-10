package programmers.level_2;

import java.util.Arrays;

public class Lv2구명보트 {

    public static int solution(int[] people, int limit) {
        int answer = 0;

        int i = 0;
        Arrays.sort(people);

        for (int j = people.length - 1;  i <= j; j--) {
            int sum = people[j] + people[i];

            if (sum > limit) {
                answer++;
            } else {
                i++;
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{50, 70, 80}, 100); //-> 3
        //50, 50, 70, 80 -> 3
    }

}
