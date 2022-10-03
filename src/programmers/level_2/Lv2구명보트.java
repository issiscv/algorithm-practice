package programmers.level_2;

import java.util.Arrays;

public class Lv2구명보트 {

    public static int solution(int[] people, int limit) {
        int answer = 0;

        //50 70 80
        Arrays.sort(people);
        int j = people.length-1;
        for (int i = 0; i <= j; j--) {

            if (people[i] + people[j] > limit) {
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
        int[] people = {50, 70, 80};
        int limit = 100;
        solution(people, limit); //-> 3
        //50, 50, 70, 80 -> 3
    }

}
