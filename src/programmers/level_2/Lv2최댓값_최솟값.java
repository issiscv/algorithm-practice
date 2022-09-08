package programmers.level_2;

import java.util.Arrays;

public class Lv2최댓값_최솟값 {

    public static String solution(String s) {
        String answer = "";

        String[] split = s.split(" ");

        int[] arr = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(arr);


        return arr[0] + " " + arr[arr.length-1];
    }

    public static void main(String[] args) {
        String solution = solution("-1 -2 -3 -4");
    }

}
