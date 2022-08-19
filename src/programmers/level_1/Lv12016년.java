package programmers.level_1;

import java.util.Scanner;

public class Lv12016년 {

    private static final int[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static String solution(int a, int b) {

        int monthGap = a - 1;
        int dayGap = b - 1;

        int sum = 0;

        for (int i = 0; i < monthGap; i++) {
            sum += arr[i];
        }

        sum += dayGap;

        int seven = sum % 7;
        String answer = "";
        switch (seven) {
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }

        System.out.println(answer);

        return  answer;
    }

    public static void main(String[] args) {

        solution(5, 24);

    }
}
