package programmers.level_2;

import java.util.Arrays;

public class Lv2쵯댓값과_최솟값 {

    public static String solution(String s) {
        String answer = "";

        String[] split = s.split(" ");

        int max = Arrays.stream(
                Arrays.stream(split).map(str -> Integer.parseInt(str)).mapToInt(i -> i).toArray()
        ).max().getAsInt();

        int min = Arrays.stream(
                Arrays.stream(split).map(str -> Integer.parseInt(str)).mapToInt(i -> i).toArray()
        ).min().getAsInt();

        answer = min + "" + max;

        return answer;
    }

    public static void main(String[] args) {
        solution("-1 -2 -3 -4");
    }

}
